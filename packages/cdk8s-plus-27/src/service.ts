import { ApiObject, Lazy, Duration } from 'cdk8s';
import { Construct, IConstruct } from 'constructs';
import * as base from './base';
import * as k8s from './imports/k8s';
import * as selector from './selector';
import * as util from './util';

/**
 * Options for `Service`.
 */
export interface ServiceProps {
  /**
   * The IP address of the service and is usually assigned randomly by the
   * master. If an address is specified manually and is not in use by others,
   * it will be allocated to the service; otherwise, creation of the service
   * will fail. This field can not be changed through updates. Valid values
   * are "None", empty string (""), or a valid IP address. "None" can be
   * specified for headless services when proxying is not required. Only
   * applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type
   * is ExternalName.
   *
   * @default - Automatically assigned.
   */
  readonly clusterIP?: string;

  /**
   * A list of IP addresses for which nodes in the cluster will also accept
   * traffic for this service. These IPs are not managed by Kubernetes.
   *
   * @default - No external IPs.
   */
  readonly externalIPs?: string[];

  /**
   * Determines how the Service is exposed.
   *
   * @default ServiceType.CLUSTER_IP
   */
  readonly type?: ServiceType;

  /**
   * The list of ports that are exposed by this service.
   *
   * @default - No ports.
   */
  readonly ports?: ServicePort[];

  /**
   * Label selector for pods. Only pods matching the selector will be
   * considered by this service.
   *
   * @default - No selector.
   */
  readonly selector?: selector.PodSelector;

  /**
   * The external name of the service. Only applies to services of
   * type ExternalName.
   *
   * @default - No external name.
   */
  readonly externalName?: string;
}

/**
 * Constant values for clusterIP.
 */
export class ClusterIP {
  /**
   * Used to specify a headless service.
   */
  public static readonly NONE = 'None';
}

/**
 * Service types.
 */
export enum ServiceType {
  /**
   * Exposes the service on a cluster-internal IP.
   */
  CLUSTER_IP = 'ClusterIP',

  /**
   * Exposes the service on each Node's IP at a static port.
   */
  NODE_PORT = 'NodePort',

  /**
   * Exposes the service externally using a cloud load balancer.
   */
  LOAD_BALANCER = 'LoadBalancer',

  /**
   * Maps the service to the contents of the externalName field.
   */
  EXTERNAL_NAME = 'ExternalName',
}

/**
 * Options for a service port.
 */
export interface ServicePort {
  /**
   * The port number.
   */
  readonly port: number;

  /**
   * The port on the pod to target.
   *
   * @default - The value of `port` is used.
   */
  readonly targetPort?: number;

  /**
   * The name of the port.
   *
   * @default - No name.
   */
  readonly name?: string;

  /**
   * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP".
   *
   * @default Protocol.TCP
   */
  readonly protocol?: Protocol;
}

/**
 * Network protocols.
 */
export enum Protocol {
  TCP = 'TCP',
  UDP = 'UDP',
  SCTP = 'SCTP',
}

/**
 * A Kubernetes service.
 */
export class Service extends base.Resource {

  /**
   * The type of the service.
   */
  public readonly type: ServiceType;

  /**
   * The cluster IP address of the service.
   */
  public readonly clusterIP?: string;

  /**
   * The external name of the service.
   */
  public readonly externalName?: string;

  /**
   * The external IP addresses of the service.
   */
  public readonly externalIPs: string[];

  private readonly _ports: ServicePort[];
  private readonly _selector: { [key: string]: string };

  /**
   * Whether the service is headless.
   */
  private get _isHeadless(): boolean {
    return this.clusterIP === ClusterIP.NONE;
  }

  constructor(scope: Construct, id: string, props: ServiceProps = {}) {
    super(scope, id);

    this.type = props.type ?? ServiceType.CLUSTER_IP;
    this.clusterIP = props.clusterIP;
    this.externalName = props.externalName;
    this.externalIPs = props.externalIPs ?? [];
    this._ports = props.ports ?? [];
    this._selector = props.selector?._selector() ?? {};
  }

  /**
   * Add a port to the service.
   */
  public addPort(port: ServicePort): void {
    this._ports.push(port);
  }

  /**
   * The ports exposed by the service.
   */
  public get ports(): ServicePort[] {
    return [...this._ports];
  }

  /**
   * @internal
   */
  public _toKube(): k8s.KubeServiceProps {
    const ports: k8s.ServicePort[] = this._ports.map(p => ({
      port: p.port,
      targetPort: p.targetPort ?? p.port,
      name: p.name,
      protocol: p.protocol,
    }));

    return {
      spec: {
        type: this.type,
        clusterIP: this.clusterIP,
        externalName: this.externalName,
        externalIPs: this.externalIPs,
        selector: this._selector,
        ports: ports.length > 0 ? ports : undefined,
      },
    };
  }

  /**
   * @internal
   */
  public _toKubeApiObject(): k8s.KubeService {
    return new k8s.KubeService(this, 'Service', this._toKube());
  }

  /**
   * Validate the service.
   */
  protected validate(): string[] {
    const errors: string[] = [];

    if (this._ports.length === 0 && !this._isHeadless) {
      errors.push('A service must be configured with a port');
    }

    if (this._ports.length === 0 && this.type !== ServiceType.CLUSTER_IP && !this._isHeadless) {
      errors.push('A non-headless service of type ' + this.type + ' must have at least one port');
    }

    return errors;
  }
}