import { Construct } from '@aws-cdk/core';
import { KubService, KubDeployment } from '../../lib';

export enum ImagePullPolicy {
  IF_NOT_PRESENT = 'IfNotPresent'
}

export interface PodinfoOptions {
  readonly logLevel: string;
  readonly serviceGrpcService?: string;
  readonly serviceMetricsPort?: number;
  readonly resources?: any;
  readonly tolerations?: any;
  readonly serviceHttpPort?: number;
  readonly serviceAccountName?: string;
  readonly serviceAccountEnabled?: boolean;
  readonly serviceEnabled?: boolean;
  readonly serviceGrpcPort?: number;
  readonly serviceNodePort?: number;
  readonly serviceExternalPort?: number;

  /**
   * type of service
   *
   * @default ClusterIP
   */
  readonly serviceType?: string;

  /**
   * node/pod affinities
   */
  readonly affinity?: string;

  /**
   * echo backend URL
   */
  readonly backend?: string;

   /**
   * random HTTP response delays between 0 and 5 seconds
   *
   * @default false
   */
  readonly faultDelay?: boolean;

  /**
   * 1/3 chances of a random HTTP response error
   */
  readonly faultError?: boolean;

  /**
   * enables ingress
   * @default false
   */
  readonly ingressEnabled?: boolean;

  /**
   * ingress annotations
   */
  readonly ingressAnnotations?: string[];

  /**
   * ingress accepted hostnames
   */
  readonly ingressHosts?: string[];

  /**
   * ingress TLS configuration
   */
  readonly ingressTls?: string;

  /**
   * image pull policy
   *
   * @default ImagePullPolicy.IF_NOT_PRESENT
   */
  readonly imagePullPolicy?: ImagePullPolicy;

  /**
   * image repository
   *
   * @default stefanprodan/podinfo
   */
  readonly imageRepository: string;

  /**
   * @default <VERSION>
   */
  readonly imageTag?: string;

  /**
   * UI greetings message
   */
  readonly message?: string;

  /**
   * node labels for pod assignment
   */
  readonly nodeSelector?: any;

  /**
   * desired number of pods
   * @default 2
   */
  readonly replicaCount?: number;
}

export class Podinfo extends Construct {
  public readonly scaleTargetRef: any;

  constructor(scope: Construct, ns: string, options: PodinfoOptions) {
    super(scope, ns);

    if (options.serviceNodePort && options.serviceType !== ServiceType.NODE_PORT) {
      throw new Error(`serviceType must be NODE_PORT if serviceNodePort is specified`);
    }

    const serviceLabel = { app: this.node.uniqueId };
    const nodePort = options.serviceType === ServiceType.NODE_PORT ? (options.serviceNodePort || 31198) : undefined;
    const serviceAccountName = !options.serviceAccountEnabled ? undefined : (options.serviceAccountName || this.node.uniqueId);
    const imageRepository    = options.imageRepository || 'stefanprodan/podinfo';
    const imageTag           = options.imageTag        || '3.0.0';
    const imagePullPolicy    = options.imagePullPolicy || ImagePullPolicy.IF_NOT_PRESENT;
    const serviceHttpPort    = options.serviceHttpPort || 9898;

    const volume = 'data';
    const podLabel = { app: this.node.uniqueId };
    const deploymentLabel = { app: this.node.uniqueId };

    const deployment = new KubDeployment(this, 'Deployment', {
      metadata: {
        labels: deploymentLabel
      },
      spec: {
        replicas: !options.hpa ? options.replicaCount : undefined,
        strategy: {
          type: 'RollingUpdate',
          rollingUpdate: { maxUnavailable: 1 }
        },
        selector: {
          matchLabels: podLabel
        },
        template: {
          metadata: {
            labels: podLabel,
            annotations: {
              'prometheus.io/scrape': 'true',
              'prometheus.io/port': serviceHttpPort,
            }
          },
          spec: {
            terminationGracePeriodSeconds: 30,
            serviceAccountName: serviceAccountName,
            containers: [
              {
                name: 'podinfo',
                image: `${imageRepository}:${imageTag}`,
                imagePullPolicy: imagePullPolicy,
                command: this.renderCommand(serviceHttpPort, options),
                env: [
                  ...!options.message ? [] : [ { name: 'PODINFO_UI_MESSAGE', value: options.message } ],
                  ...!options.backend ? [] : [ { name: 'PODINFO_BACKEND_URL', value: options.backend } ]
                ],
                ports: [
                  { name: 'http', containerPort: serviceHttpPort },
                  ...!options.serviceMetricsPort ? [] : [ { name: 'http-metrics', containerPort: options.serviceMetricsPort, protocol: 'TCP' } ],
                  ...!options.serviceGrpcPort    ? [] : [ { name: 'grpc', containerPort: options.serviceGrpcPort, protocol: 'TCP'} ]
                ],
                livenessProbe: {
                  exec: {
                    command: [ 'podcli', 'check', 'http', `localhost:${serviceHttpPort}/healthz` ]
                  },
                  initialDelaySeconds: 1,
                  timeoutSeconds: 5,
                },
                readinessProbe: {
                  exec: {
                    command: [ 'podcli', 'check', 'http', `localhost:${serviceHttpPort}/readyz` ]
                  },
                  initialDelaySeconds: 1,
                  timeoutSeconds: 5
                },
                volumeMounts: [
                  { name: volume, mountPath: '/data' }
                ],
                resources: options.resources
              }
            ],
          },
          nodeSelector: options.nodeSelector,
          affinity: options.affinity,
          tolerations: options.tolerations,
          volumes: [
            { name: volume, emptyDir: { } }
          ]
        }
      }
    });

    new KubService(this, 'Service', {
      metadata: {
        labels: serviceLabel
      },
      spec: {
        type: options.serviceType,
        ports: [
          {
            port: options.serviceExternalPort || 9898,
            targetPort: 'http',
            protocol: 'TCP',
            name: 'http',
            nodePort: nodePort
          },
          ...!options.serviceGrpcPort ? [] : [ { port: options.serviceGrpcPort, targetPort: 'grpc', protocol: 'TCP', name: 'grpc' } ]
        ],
        selector: deploymentLabel
      }
    });

    this.scaleTargetRef = {
      apiVersion: deployment.apiVersion,
      kind: deployment.kind,
      name: deployment.name
    };
  }

  private renderCommand(serviceHttpPort: any, options: PodinfoOptions) {
    const command = new Array<string>();
    command.push('./podinfo');
    command.push(`--port=${serviceHttpPort}`);

    if (options.serviceMetricsPort) {
      command.push(`--port-metrics=${options.serviceMetricsPort}`);
    }

    if (options.serviceGrpcPort) {
      command.push(`--grpc-port=${options.serviceGrpcPort}`);
    }

    if (options.serviceGrpcService) {
      command.push(`--grpc-service-name=${options.serviceGrpcService}`);
    }

    command.push(`--level=${options.logLevel || 'info'}`);

    if (options.faultDelay) {
      command.push(`--random-delay=${options.faultDelay}`);
    }

    if (options.faultError) {
      command.push(`--random-error=${options.faultError}`);
    }

    return command;
  }
}

export enum ServiceType {
  CLUSTER_IP = 'ClusterIP',
  EXTERNAL_NAME = 'ExternalName',
  NODE_PORT = 'NodePort',
  LOAD_BALANCER = 'LoadBalancer',
}
