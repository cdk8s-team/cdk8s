import { Construct } from "constructs";
import {
	App,
	Helm,
	JsonPatch,
	ApiObject,
	Chart,
	ChartProps,
	Size,
} from "cdk8s";
import * as kplus from "cdk8s-plus-25";
import { readFileSync } from "fs";
import { parse } from "yaml";
import path = require("path");

const dbSecretKeys = [
	"MYSQL_DATABASE",
	"MYSQL_ROOT_PASSWORD",
	"MYSQL_USER",
	"MYSQL_PASSWORD",
];

const YAMLS_PATH = "../yamls/";
const CONFIG_PATH = path.join(YAMLS_PATH, "config.yaml");
const FILES_ENCODING = "utf8";
const STORAGE_CLASS = "rawfile-btrfs";

/**
 * Creates secret for database
 *
 * @param {Chart} chart - chart object
 * @param {string} namespace
 * @param {string} path - path to secret file
 * @return {kplus.Secret}
 */
function getSecret(
	chart: Chart,
	namespace: string,
	path: string,
): kplus.Secret {
	const secret = new kplus.Secret(chart, "nextcloud-db-secret", {
		metadata: {
			namespace: namespace,
		},
	});
	const file = readFileSync(path, FILES_ENCODING);
	const secrets = parse(file);
	dbSecretKeys.forEach((key) => {
		secret.addStringData(key, secrets[key]);
	});
	return secret;
}

/**
 * gets default deployment object with given name as app:name label
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} name - name of labels
 * @param {number} replicas - number of replicas
 *
 * @returns {kplus.Deployment}
 */
function getRawDeployment(
	chart: Chart,
	namespace: string,
	name: string,
	replicas: number,
): kplus.Deployment {
	return new kplus.Deployment(chart, name, {
		metadata: {
			labels: {
				app: name,
			},
			name: name,
			namespace: namespace,
		},
		replicas: replicas,
		securityContext: {
			ensureNonRoot: false,
		},
		podMetadata: {
			labels: {
				app: name,
			},
		},
	});
}

/**
 * create database container
 *
 * @param {kplus.Deployment} mariadbDeployment - deplyoment object of database
 * @param {kplus.Secret} secret - secret object for MYSQL_... environment variables
 *
 * @returns {kplus.Container}
 */
function getMariadbContainer(
	mariadbDeployment: kplus.Deployment,
	secret: kplus.Secret,
	port: number,
	name: string,
): kplus.Container {
	const mariadbContainer = mariadbDeployment.addContainer({
		name: name,
		image: "mariadb:latest",
		resources: {},
		args: [
			"--transaction-isolation=READ-COMMITTED",
			"--binlog-format=ROW",
			"--max-connections=1000",
		],
		ports: [{ number: port }],
		securityContext: {
			ensureNonRoot: false,
			readOnlyRootFilesystem: false,
		},
	});
	dbSecretKeys.forEach((key) => {
		const value = kplus.EnvValue.fromSecretValue({
			secret: secret,
			key: key,
		});
		mariadbContainer.env.addVariable(key, value);
	});
	return mariadbContainer;
}

/**
 * Creates a ClusterIP service
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} name - suffix of service name
 * @param {kplus.Deployment} deployment - deplyoment object for service
 * @param {number} port - port number of service
 *
 * @returns {kplus.Service}
 */
function getService(
	chart: Chart,
	namespace: string,
	name: string,
	deployment: kplus.Deployment,
	port: number,
): kplus.Service {
	return new kplus.Service(chart, "Service".concat(name), {
		metadata: {
			name: name,
			labels: {
				app: name,
			},
			namespace: namespace,
		},
		selector: deployment,
		ports: [{ port: port }],
	});
}

/**
 * Create persistent volume claim
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} name - name of pvc
 * @param {number} size - size of pvc in gigabytes
 *
 * @returns {kplus.Pers}
 */
function pvc(
	chart: Chart,
	namespace: string,
	name: string,
	size: number,
	access_mod = kplus.PersistentVolumeAccessMode.READ_WRITE_ONCE,
): kplus.Volume {
	const claim = new kplus.PersistentVolumeClaim(chart, name, {
		metadata: {
			namespace: namespace,
		},
		storage: Size.gibibytes(size),
		accessModes: [access_mod],
		storageClassName: STORAGE_CLASS,
	});
	return kplus.Volume.fromPersistentVolumeClaim(
		chart,
		"Vol ".concat(name),
		claim,
	);
}

/**
 * Creates all manifests for database
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {kplus.Secret} secret - secret object for MYSQL_XXX envs
 * @param {string} name
 * @param {number} port
 * @param {number} storage size of database in gigabytes
 *
 */
function mariadb(
	chart: Chart,
	namespace: string,
	secret: kplus.Secret,
	name: string,
	port: number,
	storage: number,
) {
	const mariadbDeployment = getRawDeployment(chart, namespace, name, 1);
	const mariadbContainer = getMariadbContainer(
		mariadbDeployment,
		secret,
		port,
		name,
	);
	const dbPvc = pvc(chart, namespace, "mariadb-pvc", storage);
	mariadbContainer.mount("/var/lib/mysql", dbPvc);
	getService(chart, namespace, name, mariadbDeployment, port);
}

/**
 * Creates all manifests for redis
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} name
 * @param {number} port
 * @param {number} replicas
 */
function redis(
	chart: Chart,
	namespace: string,
	name: string,
	port: number,
	replicas: number,
) {
	const redisDeployment = getRawDeployment(chart, namespace, name, replicas);
	redisDeployment.addContainer({
		name: name,
		image: "redis:latest",
		resources: {},
		ports: [{ number: port }],
		securityContext: {
			ensureNonRoot: false,
		},
	});
	getService(chart, namespace, name, redisDeployment, port);
}

/**
 * Creates cluster issuer
 *
 * @param {Chart} chart
 * @param {string} ca address of ca
 * @param {string} email
 * @returns {ApiObject}
 */

function addClusterIssuer(chart: Chart, ca: string, email: string): ApiObject {
	const clusterIssuer = new ApiObject(chart, "cluster-issuer", {
		apiVersion: "cert-manager.io/v1",
		kind: "ClusterIssuer",
		metadata: {
			name: "acme-issuer",
			namespace: "cert-manager",
		},
	});
	clusterIssuer.addJsonPatch(
		JsonPatch.add("/spec", {
			acme: {
				email: email,
				server: ca,
				privateKeySecretRef: { name: "pvtkey-issuer" },
				solvers: [
					{
						http01: {
							ingress: {
								class: "traefik",
							},
						},
					},
				],
			},
		}),
	);
	return clusterIssuer;
}

/**
 * Creates certificate
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {ApiObject} clusterIssuer
 * @param {kplus.Secret} tlsSecret
 * @param {string} host
 */
function createCertificate(
	chart: Chart,
	namespace: string,
	clusterIssuer: ApiObject,
	tlsSecret: kplus.Secret,
	host: string,
) {
	const certi = new ApiObject(chart, "certificate", {
		apiVersion: "cert-manager.io/v1",
		kind: "Certificate",
		metadata: {
			name: host,
			namespace: namespace,
		},
	});

	certi.addJsonPatch(
		JsonPatch.add("/spec", {
			secretName: tlsSecret.name,
			issuerRef: {
				name: clusterIssuer.name,
				kind: "ClusterIssuer",
			},
			dnsNames: [host],
		}),
	);
}

/**
 * Creates ingress manifest for nextcloud
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} path - suffix path of url
 * @param {kplus.Service} service - service to expose
 * @param {string} host
 * @param {string} ca address of ca
 * @param {string} email
 */
function addIngress(
	chart: Chart,
	namespace: string,
	path: string,
	service: kplus.Service,
	host: string,
	ca: string,
	email: string,
) {
	const clusterIssuer = addClusterIssuer(chart, ca, email);

	const tlsSecret = new kplus.Secret(chart, "tls-secret", {
		metadata: {
			namespace: namespace,
		},
		type: "kubernetes.io/tls",
	});
	createCertificate(chart, namespace, clusterIssuer, tlsSecret, host);
	new kplus.Ingress(chart, "ingress", {
		metadata: {
			name: "ingress",
			namespace: namespace,
		},
		rules: [
			{
				host: host,
				path: path,
				backend: kplus.IngressBackend.fromService(service),
			},
		],
		tls: [
			{
				hosts: [host],
				secret: tlsSecret,
			},
		],
	});
}

/**
 * Creates all manifests for nextcloud core
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {kplus.Secret} secret - secret object to access MYSQL_XXX envs
 * @param {string} name
 * @param {number} port
 * @param {number} storage storage size of next cloud in gigibytes
 * @param {string[]} dbSecretKeys list of secrets key
 * @param {string} redis_host url of redis
 * @param {string} admin_user admin username
 * @param {string} db_host url of database
 * @param {string} host address of host
 * @param {string} ca address of ca
 * @param {string} email email for ceritifcaste
 */
function nextCloud(
	chart: Chart,
	namespace: string,
	secret: kplus.Secret,
	name: string,
	port: number,
	storage: number,
	dbSecretKeys: string[],
	redis_host: string,
	admin_user: string,
	db_host: string,
	host: string,
	ca: string,
	email: string,
) {
	const nextCloudeDeployment = getRawDeployment(chart, namespace, name, 1);
	const nextCloudContainer = getNextCloudContainer(
		nextCloudeDeployment,
		secret,
		name,
		port,
		dbSecretKeys,
		redis_host,
		admin_user,
		db_host,
		host,
	);
	const nextCloudPvc = pvc(chart, namespace, "nextcloud-pvc", storage);
	nextCloudContainer.mount("/var/www/html", nextCloudPvc);
	const nextCloudService = getService(
		chart,
		namespace,
		name,
		nextCloudeDeployment,
		port,
	);

	addIngress(chart, namespace, "/", nextCloudService, host, ca, email);
}

/**
 * Creates container for nextcloud
 *
 * @param {kplus.Deployment} deployment - deplyoment object for nextcloud
 * @param {kplus.Secret} secret
 * @param {string} name
 * @param {number} port
 * @param {string[]} dbSecretKeys list of secrets key
 * @param {string} redis_host url of redis
 * @param {string} admin_user admin username
 * @param {string} db_host url of database
 * @param {string} host address of host
 *
 * @returns {kplus.Container}
 */
function getNextCloudContainer(
	deployment: kplus.Deployment,
	secret: kplus.Secret,
	name: string,
	port: number,
	dbSecretKeys: string[],
	redis_host: string,
	admin_user: string,
	db_host: string,
	host: string,
): kplus.Container {
	const nextCloudContainer = deployment.addContainer({
		name: name,
		image: "nextcloud:apache",
		resources: {},
		ports: [{ number: port }],
		securityContext: {
			ensureNonRoot: false,
			readOnlyRootFilesystem: false,
		},
	});
	dbSecretKeys.forEach((key) => {
		const value = kplus.EnvValue.fromSecretValue({
			secret: secret,
			key: key,
		});
		nextCloudContainer.env.addVariable(key, value);
	});
	const env = {
		REDIS_HOST: redis_host,
		// REDIS_HOST_PASSWORD: "",
		NEXTCLOUD_ADMIN_USER: admin_user,
		MYSQL_HOST: db_host,
		NEXTCLOUD_TRUSTED_DOMAINS: host,
	};
	Object.entries(env).forEach(([key, value]) => {
		nextCloudContainer.env.addVariable(key, kplus.EnvValue.fromValue(value));
	});
	nextCloudContainer.env.addVariable(
		"NEXTCLOUD_ADMIN_PASSWORD",
		kplus.EnvValue.fromSecretValue({
			secret: secret,
			key: "MYSQL_PASSWORD", /// just for testing
		}),
	);
	return nextCloudContainer;
}

/**
 * install traefik using helm
 */
function addTraefik(chart: Chart) {
	new Helm(chart, "traefik", {
		releaseName: "traefik",
		chart: "traefik/traefik",
		values: {
			additionalArguments: [
				"--serversTransport.insecureSkipVerify=true",
				"--log.level=DEBUG",
				"--metrics.prometheus=true",
			],
			deployment: {
				additionalContainers: [],
				annotations: {},
				enabled: true,
				initContainers: [],
				podAnnotations: {},
				replicas: 1,
			},
			globalArguments: [
				"--global.sendanonymoususage=false",
				"--global.checknewversion=false",
			],
			ingressRoute: { dashboard: { enabled: false } },
			ports: {
				web: { redirectTo: "websecure" },
				websecure: { tls: { enabled: true } },
				metrics: {
					port: 9100,
					expose: false,
					exposedPort: 9100,
					protocol: "TCP",
				},
			},
			hub: {
				enabled: true,
			},
			metrics: {
				prometheus: {
					entryPoint: "metrics",
					addRoutersLabels: true,
					addServicesLabels: true,
				},
			},
			providers: {
				kubernetesCRD: {
					allowExternalNameServices: true,
					enabled: true,
					ingressClass: "traefik-external",
				},
				kubernetesIngress: {
					allowExternalNameServices: true,
					enabled: true,
					publishedService: { enabled: false },
				},
			},
			rbac: { enabled: true },
			service: {
				annotations: {},
				enabled: true,
				externalIPs: [],
				labels: {},
				loadBalancerSourceRanges: [],
				type: "LoadBalancer",
			},
		},
	});
}

/**
 * Add cert-manager using helm
 */
function addCertManager(chart: Chart) {
	new Helm(chart, "cert-manager", {
		releaseName: "cert-manager",
		namespace: "cert-manager",
		version: "v1.9.1",
		chart: "jetstack/cert-manager",
		values: {
			extraArgs: [
				"--dns01-recursive-nameservers=1.1.1.1:53,9.9.9.9:53",
				"--dns01-recursive-nameservers-only",
			],
			installCRDs: false,
			podDnsConfig: { nameservers: ["1.1.1.1", "9.9.9.9"] },
			podDnsPolicy: "None",
			replicaCount: 1,
		},
	});
}

/**
 * Create victoria
 *
 * @param {Chart} chart
 * @param {string} namespace
 * @param {string} name
 * @param {number} port port of victoria
 * @param {string} prom_file_path path to store prometheus config file
 * @param {string} prom_config_name name of prometheus config file
 * @param {string} config_path path to prometheus config file
 * @param {number} storage size of storage in gigabytes
 */
function victoriaMetrics(
	chart: Chart,
	namespace: string,
	name: string,
	port: number,
	prom_file_path: string,
	prom_config_name: string,
	config_path: string,
	storage: number,
) {
	const deployment = getRawDeployment(chart, namespace, name, 1);
	const container = deployment.addContainer({
		name: name,
		image: "victoriametrics/victoria-metrics:latest",
		resources: {},
		ports: [{ number: port }],
		securityContext: {
			ensureNonRoot: false,
		},
		args: ["-promscrape.config=".concat(prom_file_path, prom_config_name)],
	});

	const config = new kplus.ConfigMap(chart, "vic-config", {
		metadata: {
			name: name,
			namespace: namespace,
		},
	});
	config.addFile(path.join(YAMLS_PATH, config_path), prom_config_name);
	const volume = kplus.Volume.fromConfigMap(chart, "ConfigMap", config);
	container.mount(prom_file_path, volume);

	const vmvc = pvc(chart, namespace, "victoria-pvc", storage);
	container.mount("/victoria-metrics-data", vmvc);
	getService(chart, namespace, name, deployment, port);
}

/**
 * Create garafan
 *
 * @param {Chart} chart
 * @param {sttring} namespace
 * @param {string} name name of grafana
 * @param {number} port port of grafana
 * @param {number} storage size of grafana storage in gigabytes
 */
function grafana(
	chart: Chart,
	namespace: string,
	name: string,
	port: number,
	storage: number,
) {
	const deployment = getRawDeployment(chart, namespace, name, 1);
	const pvcGrafana = pvc(chart, namespace, "volGrafana", storage);
	const initContainer = deployment.addInitContainer({
		name: "chown",
		image: "busybox:latest",
		resources: {},
		securityContext: {
			ensureNonRoot: false,
			readOnlyRootFilesystem: false,
		},
		command: ["chown", "-R", "472:472", "/var/lib/grafana"],
	});

	initContainer.mount("/var/lib/grafana", pvcGrafana);

	const container = deployment.addContainer({
		name: name,
		image: "grafana/grafana:latest",
		resources: {},
		ports: [{ number: port }],
		securityContext: {
			ensureNonRoot: false,
			readOnlyRootFilesystem: false,
		},
	});
	container.mount("/var/lib/grafana", pvcGrafana);
	getService(chart, namespace, name, deployment, port);
}

function createNamespace(chart: Chart, name: string) {
	new kplus.Namespace(chart, name.concat("-ns"), {
		metadata: {
			name: name,
		},
	});
}

export class NextCloud extends Chart {
	constructor(scope: Construct, id: string, props: ChartProps = {}) {
		super(scope, id, props);

		const configFile = readFileSync(CONFIG_PATH, FILES_ENCODING);
		const config = parse(configFile);

		const MARIADB = config["db"]["name"];
		const DB_PORT = config["db"]["port"];
		const DB_STORAGE = config["db"]["storage"];
		const REDIS = config["redis"]["name"];
		const REDIS_PORT = config["redis"]["port"];
		const REDIS_REPLICAS = config["redis"]["replicas"];
		const NEXT_CLOUD = config["nextcloud"]["name"];
		const NEXTCLOUD_PORT = config["nextcloud"]["port"];
		const NBEXTCLOUD_STORAGE = config["nextcloud"]["storage"];
		const ADD_TRAEFIK = config["helm"]["traeifk"];
		const ADD_CERT_MANAGER = config["helm"]["cert_manager"];
		const HOST = config["network"]["host"];
		const STAGING = config["network"]["staging"];
		const PRODUCTION_TLS = config["network"]["production_tls"];
		const STAGING_TLS = config["network"]["staging_tls"];
		const EMAIL_TLS = config["network"]["email_tls"];
		const SECRETS_PATH = path.join(YAMLS_PATH, config["secrets_path"]);
		const GRAFANA = config["grafana"]["name"];
		const GRAFANA_PORT = config["grafana"]["port"];
		const GRAFANA_STORAGE = config["grafana"]["storage"];
		const viccon = config["victoria"];
		const VICTORIA = viccon["name"];
		const VICTORIA_PORT = viccon["port"];
		const VICTORIA_CONFIG_PATH = viccon["config_file"];
		const PROM_FILE_PATH = viccon["prom_path"];
		const PROM_CONFIG_NAME = viccon["prom_config_name"];
		const VICTORIA_STORAGE = viccon["storage"];

		const NS_MAIN = config["namespace"]["main"];
		const NS_METRICS = config["namespace"]["metrics"];

		createNamespace(this, NS_MAIN);
		createNamespace(this, NS_METRICS);

		if (ADD_TRAEFIK) addTraefik(this);
		if (ADD_CERT_MANAGER) addCertManager(this);

		const secret = getSecret(this, NS_MAIN, SECRETS_PATH);
		mariadb(this, NS_MAIN, secret, MARIADB, DB_PORT, DB_STORAGE);
		redis(this, NS_MAIN, REDIS, REDIS_PORT, REDIS_REPLICAS);
		nextCloud(
			this,
			NS_MAIN,
			secret,
			NEXT_CLOUD,
			NEXTCLOUD_PORT,
			NBEXTCLOUD_STORAGE,
			dbSecretKeys,
			REDIS,
			"admin",
			MARIADB,
			HOST,
			[PRODUCTION_TLS, STAGING_TLS][Number(STAGING)],
			EMAIL_TLS,
		);
		victoriaMetrics(
			this,
			NS_METRICS,
			VICTORIA,
			VICTORIA_PORT,
			PROM_FILE_PATH,
			PROM_CONFIG_NAME,
			VICTORIA_CONFIG_PATH,
			VICTORIA_STORAGE,
		);
		grafana(this, NS_METRICS, GRAFANA, GRAFANA_PORT, GRAFANA_STORAGE);
	}
}

const app = new App();
new NextCloud(app, "nextcloud");
app.synth();
