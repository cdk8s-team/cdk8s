import * as k8s from './imports/k8s';
import { Construct } from 'constructs';
import { ResourceProps, Resource } from './base';
import * as cdk8s from 'cdk8s';
import { lazy } from './utils';


/**
 * Properties for initialization of `Service`.
 */
export interface ServiceProps extends ResourceProps {

  /**
   * The spec of the service. Use `service.spec` to apply post instantiation mutations.
   *
   * @default - An empty spec will be created.
   */
  readonly spec?: ServiceSpec;

}

/**
 * For some parts of your application (for example, frontends) you may want to expose a Service onto an
 * external IP address, that's outside of your cluster.
 * Kubernetes ServiceTypes allow you to specify what kind of Service you want.
 * The default is ClusterIP.
 */
export enum ServiceType {

  /**
   * Exposes the Service on a cluster-internal IP.
   * Choosing this value makes the Service only reachable from within the cluster.
   * This is the default ServiceType
   */
  CLUSTER_IP = 'ClusterIP',

  /**
   * Exposes the Service on each Node's IP at a static port (the NodePort).
   * A ClusterIP Service, to which the NodePort Service routes, is automatically created.
   * You'll be able to contact the NodePort Service, from outside the cluster,
   * by requesting <NodeIP>:<NodePort>.
   */
  NODE_PORT = 'NodePort',

  /**
   * Exposes the Service externally using a cloud provider's load balancer.
   * NodePort and ClusterIP Services, to which the external load balancer routes,
   * are automatically created.
   */
  LOAD_BALANCER = 'LoadBalancer',

  /**
   * Maps the Service to the contents of the externalName field (e.g. foo.bar.example.com), by returning a CNAME record with its value.
   * No proxying of any kind is set up.
   *
   * > Note: You need either kube-dns version 1.7 or CoreDNS version 0.0.8 or higher to use the ExternalName type.
   */
  EXTERNAL_NAME = 'ExternalName'
}

/**
 * An abstract way to expose an application running on a set of Pods as a network service.
 * With Kubernetes you don't need to modify your application to use an unfamiliar service discovery mechanism.
 * Kubernetes gives Pods their own IP addresses and a single DNS name for a set of Pods, and can load-balance across them.
 *
 * For example, consider a stateless image-processing backend which is running with 3 replicas. Those replicas are fungible—frontends do not care which backend they use.
 * While the actual Pods that compose the backend set may change, the frontend clients should not need to be aware of that,
 * nor should they need to keep track of the set of backends themselves.
 * The Service abstraction enables this decoupling.
 *
 * If you're able to use Kubernetes APIs for service discovery in your application, you can query the API server for Endpoints,
 * that get updated whenever the set of Pods in a Service changes. For non-native applications, Kubernetes offers ways to place a network port
 * or load balancer in between your application and the backend Pods.
 */
export class Service extends Resource {

  /**
   * @see base.Resource.apiObject
   */
  public readonly apiObject: cdk8s.ApiObject;

  /**
   * Provides access to the underlying spec.
   *
   * You can use this field to apply post instantiation mutations
   * to the spec.
   */
  public readonly spec: ServiceSpec;

  constructor(scope: Construct, id: string, props: ServiceProps = {}) {
    super(scope, id, props);

    this.spec = props.spec ?? new ServiceSpec();

    this.apiObject = new k8s.Service(this, 'Pod', {
      metadata: this.metadata._toKube(),
      spec: lazy(() => this.spec._toKube()),
    })
  }

}

/**
 * Definition of a service port.
 */
export interface ServicePort {

  /**
   * The port number the service will bind to.
   */
  readonly port: number;

  /**
   * The port number the service will redirect to.
   *
   * @default - The value of `port` will be used.
   */
  readonly targetPort?: number;

}

/**
 * Properties for initialization of `ServiceSpec`.
 */
export interface ServiceSpecProps {

  /**
   * clusterIP is the IP address of the service and is usually assigned randomly by the master.
   * If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail.
   * This field can not be changed through updates. Valid values are "None", empty string (""), or a valid IP address. "None" can be specified
   * for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer.
   * Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   *
   * @default - Automatically assigned.
   *
   */
  readonly clusterIP?: string;

  /**
   * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service. These IPs are not managed by Kubernetes.
   * The user is responsible for ensuring that traffic arrives at a node with this IP.
   * A common example is external load-balancers that are not part of the Kubernetes system.
   *
   * @default - No external IPs.
   */
  readonly externalIPs?: string[];

  /**
   * type determines how the Service is exposed.
   *
   * More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
   *
   * @see ServiceType
   * @default 'ClusterIP'.
   */
  readonly type?: ServiceType;

  /**
   * The port exposed by this service.
   *
   * More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   */
  readonly ports?: ServicePort[]

}

/**
 * A description of a service.
 */
export class ServiceSpec {

  private readonly clusterIP?: string;
  private readonly externalIPs: string[];
  private readonly type?: string;
  private readonly labels: Record<string, string>;

  private ports: ServicePort[];

  constructor(props: ServiceSpecProps = {}) {
    this.clusterIP = props.clusterIP;
    this.externalIPs = props.externalIPs ?? [];
    this.type = props.type ?? ServiceType.CLUSTER_IP;
    this.labels = {};
    this.ports = props.ports ?? [];
  }

  /**
   * Services defined using this spec will select pods according the provided label.
   *
   * @param key The label key.
   * @param value The label value.
   */
  public selectByLabel(key: string, value: string) {
    this.labels[key] = value;
  }

  /**
   * Configure a port the service will bind to.
   * This method can be called multiple times.
   *
   * @param port The port definition.
   */
  public serve(port: ServicePort) {
    this.ports.push({
      port: port.port,
      targetPort: port.targetPort,
    })
  }

  /**
   * @internal
   */
  public _toKube(): k8s.ServiceSpec {

    if (this.ports?.length === 0) {
      throw new Error('A service must be configured with a port');
    }

    const ports: k8s.ServicePort[] = [];

    for (const port of this.ports) {
      ports.push({
        port: port.port,
        targetPort: port.targetPort,
      })
    }

    return {
      clusterIP: this.clusterIP,
      externalIPs: this.externalIPs,
      type: this.type,
      selector: this.labels,
      ports: ports,
    };
  }


}