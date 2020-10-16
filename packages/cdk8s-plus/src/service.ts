import * as k8s from './imports/k8s';
import { Construct } from 'constructs';
import { ResourceProps, Resource } from './base';
import * as cdk8s from 'cdk8s';
import { Deployment } from './deployment';

/**
 * Properties for initialization of `Service`.
 */
export interface ServiceProps extends ResourceProps {

  /**
   * The IP address of the service and is usually assigned randomly by the
   * master. If an address is specified manually and is not in use by others, it
   * will be allocated to the service; otherwise, creation of the service will
   * fail. This field can not be changed through updates. Valid values are
   * "None", empty string (""), or a valid IP address. "None" can be specified
   * for headless services when proxying is not required. Only applies to types
   * ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName.
   *
   * @see https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @default - Automatically assigned.
   *
   */
  readonly clusterIP?: string;

  /**
   * A list of IP addresses for which nodes in the cluster will also accept
   * traffic for this service. These IPs are not managed by Kubernetes. The user
   * is responsible for ensuring that traffic arrives at a node with this IP. A
   * common example is external load-balancers that are not part of the
   * Kubernetes system.
   *
   * @default - No external IPs.
   */
  readonly externalIPs?: string[];

  /**
   * Determines how the Service is exposed.
   *
   * More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
   *
   * @default ServiceType.ClusterIP
   */
  readonly type?: ServiceType;

  /**
   * The port exposed by this service.
   *
   * More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   */
  readonly ports?: ServicePort[];

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
   * The IP address of the service and is usually assigned randomly by the
   * master.
   */
  public readonly clusterIP?: string;

  /**
   * Determines how the Service is exposed.
   */
  public readonly type: ServiceType;

  /**
   * @see base.Resource.apiObject
   */
  protected readonly apiObject: cdk8s.ApiObject;

  private readonly _externalIPs: string[];
  private readonly _selector: Record<string, string>;
  private readonly _ports: ServicePort[];

  constructor(scope: Construct, id: string, props: ServiceProps = {}) {
    super(scope, id, props);

    this.apiObject = new k8s.Service(this, 'Pod', {
      metadata: props.metadata,
      spec: cdk8s.Lazy.any({ produce: () => this._toKube() }),
    });

    this.clusterIP = props.clusterIP;
    this.type = props.type ?? ServiceType.CLUSTER_IP;

    this._externalIPs = props.externalIPs ?? [];
    this._ports = [];
    this._selector = { };

    for (const portAndOptions of props.ports ?? []) {
      this.serve(portAndOptions.port, portAndOptions);
    }

  }

  /**
   * Returns the labels which are used to select pods for this service.
   */
  public get selector() {
    return this._selector;
  }

  /**
   * Ports for this service.
   *
   * Use `serve()` to expose additional service ports.
   */
  public get ports() {
    return [...this._ports];
  }

  /**
   * Associate a deployment to this service.
   *
   * Requests will be routed to the port exposed by the first container in the
   * deployment's pods. The deployment's `labelSelector` will be used to select
   * pods.
   *
   * @param deployment The deployment to expose
   * @param port The external port
   */
  public addDeployment(deployment: Deployment, port: number) {
    const containers = deployment.containers;
    if (containers.length === 0) {
      throw new Error('Cannot expose a deployment without containers');
    }

    const selector = Object.entries(deployment.labelSelector);
    if (selector.length === 0) {
      throw new Error('deployment does not have a label selector');
    }

    if (Object.keys(this.selector).length > 0) {
      throw new Error('a selector is already defined for this service. cannot add a deployment');
    }

    for (const [ k, v ] of selector) {
      this.addSelector(k, v);
    }

    this.serve(port, {
      // just a PoC, we assume the first container is the main one.
      // TODO: figure out what the correct thing to do here.
      targetPort: containers[0].port,
    });
  }

  /**
   * Services defined using this spec will select pods according the provided label.
   *
   * @param label The label key.
   * @param value The label value.
   */
  public addSelector(label: string, value: string) {
    this._selector[label] = value;
  }

  /**
   * Configure a port the service will bind to.
   * This method can be called multiple times.
   *
   * @param port The port definition.
   */
  public serve(port: number, options: ServicePortOptions = { }) {
    this._ports.push({ port, ...options });
  }

  /**
   * @internal
   */
  public _toKube(): k8s.ServiceSpec {
    if (this._ports.length === 0) {
      throw new Error('A service must be configured with a port');
    }

    const ports: k8s.ServicePort[] = [];

    for (const port of this._ports) {
      ports.push({
        port: port.port,
        targetPort: port.targetPort,
        nodePort: port.nodePort,
      });
    }

    return {
      clusterIP: this.clusterIP,
      externalIPs: this._externalIPs,
      type: this.type,
      selector: this._selector,
      ports: ports,
    };
  }

}

export enum Protocol {
  TCP = 'TCP',
  UDP = 'UDP',
  SCTP = 'SCTP'
}

export interface ServicePortOptions {
  /**
   * The name of this port within the service. This must be a DNS_LABEL. All
   * ports within a ServiceSpec must have unique names. This maps to the 'Name'
   * field in EndpointPort objects. Optional if only one ServicePort is defined
   * on this service.
   */
  readonly name?: string;

  /**
   * The port on each node on which this service is exposed when type=NodePort
   * or LoadBalancer. Usually assigned by the system. If specified, it will be
   * allocated to the service if unused or else creation of the service will
   * fail. Default is to auto-allocate a port if the ServiceType of this Service
   * requires one.
   *
   * @see https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
   *
   * @default to auto-allocate a port if the ServiceType of this Service
   * requires one.
   */
  readonly nodePort?: number;

  /**
   * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP.
   *
   * @default Protocol.TCP
   */
  readonly protocol?: Protocol;

  /**
   * The port number the service will redirect to.
   *
   * @default - The value of `port` will be used.
   */
  readonly targetPort?: number;
}

/**
 * Definition of a service port.
 */
export interface ServicePort extends ServicePortOptions {

  /**
   * The port number the service will bind to.
   */
  readonly port: number;
}
