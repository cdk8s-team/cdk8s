import * as k8s from './imports/k8s';
import { Construct } from 'constructs';
import { ResourceProps, Resource } from './base';
import * as cdk8s from 'cdk8s';
import { lazy } from './utils';


export interface ServiceProps extends ResourceProps {

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

export class Service extends Resource {

  public readonly apiObject: cdk8s.ApiObject;

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

export interface ServicePort {

  readonly port: number;

  readonly targetPort?: number;

}

export interface ServiceSpecProps {

  readonly clusterIP?: string;

  readonly externalIPs?: string[];

  readonly type?: string;

  // TODO: make this an array
  readonly port?: ServicePort

}

export class ServiceSpec {

  private readonly clusterIP?: string;
  private readonly externalIPs: string[];
  private readonly type?: string;
  private readonly port?: ServicePort

  private readonly labels: Record<string, string>;

  constructor(props: ServiceSpecProps = {}) {
    this.clusterIP = props.clusterIP;
    this.externalIPs = props.externalIPs ?? [];
    this.type = props.type;
    this.labels = {};
    this.port = props.port;
  }

  public addExternalIP(ip: string) {
    this.externalIPs.push(ip);
  }

  public selectByLabel(key: string, value: string) {
    this.labels[key] = value;
  }

  /**
   * @internal
   */
  public _toKube(): k8s.ServiceSpec {

    const ports: k8s.ServicePort[] = [];

    if (this.port) {
      ports.push({
        port: this.port.port,
        targetPort: this.port.targetPort,
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