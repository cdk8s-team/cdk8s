import { Construct } from "@aws-cdk/core";
import { Service as ServiceApiObject, ServicePort, IntOrString } from '../../.gen/service-v1';
import { Ingress, IngressOptions } from "./ingress";

export interface ISelector {
  readonly selector: { [key: string]: string };
}

export interface ServiceOptions {
  readonly labels?: { [key: string]: string };

  /**
   * Type of service.
   *
   * @default CLUSTER_IP
   */
  readonly serviceType?: ServiceType;

  /**
   * ClusterIP HTTP port.
   *
   * @default 9898
   */
  readonly externalPort?: number;

  /**
   * NodePort for the HTTP endpoint 
   * 
   * @default 31198
   */
  readonly nodePort?: number;

  /**
   * Route service traffic to pods with label keys and values matching this
   * selector. If empty or not present, the service is assumed to have an
   * external process managing its endpoints, which Kubernetes will not modify.
   */
  readonly selector: ISelector;

  /**
   * Adds an ingress controller that routes traffic to this service. Use
   * `ingressOptions ` to specify additional ingress options.
   *
   * @default false
   */
  readonly ingress?: boolean;

  /**
   * Ingress options
   * 
   * @default - see defaults
   */
  readonly ingressOptions?: IngressOptions;
}

export class Service extends Construct {
  private readonly ports = Array<{ name: string } & PortOptions>();

  constructor(scope: Construct, id: string, options: ServiceOptions) {
    super(scope, id);

    //
    // parse options

    const serviceType = options.serviceType || ServiceType.CLUSTER_IP;
    const externalPort = options.externalPort || 9898;
    const nodePort = options.serviceType === ServiceType.NODE_PORT ? (options.nodePort || 31198) : undefined;
    const ingressEnabled = options.ingress !== undefined ? true : false;

    //
    // validation

    if (options.nodePort && options.serviceType !== ServiceType.NODE_PORT) {
      throw new Error(`"serviceType" must be NODE_PORT if "nodePort" is specified`);
    }

    if (ingressEnabled && options.ingressOptions) {
      throw new Error(`can't specify "ingressOptions" when ingress is not enabled`);
    }

    // service

    const service = new ServiceApiObject(this, 'Service', {
      metadata: {
        labels: options.labels
      },
      spec: {
        type: serviceType,
        selector: options.selector.selector,
        ports: this.ports.map(port => {
          return {
            port: port.port,
            name: port.name,
            nodePort: port.nodePort,
            protocol: port.protocol,
            targetPort: IntOrString.fromString(port.targetPort)
          } as ServicePort
        })
      }
    });

    this.addPort('http', {
      port: externalPort,
      targetPort: 'http',
      nodePort: nodePort
    });

    if (ingressEnabled) {
      new Ingress(this, 'ingress', {
        backend: {
          servicePort: 'http',
          serviceName: service.name
        },
        ...options.ingressOptions
      });
    }      
  }

  public addPort(name: string, options: PortOptions) {
    this.ports.push({ name, ...options });
  }
}

export enum ServiceType {
  CLUSTER_IP = 'ClusterIP',
  EXTERNAL_NAME = 'ExternalName',
  NODE_PORT = 'NodePort',
  LOAD_BALANCER = 'LoadBalancer',
}


export interface PortOptions {
  /**
   * The port that will be exposed by this service.
   */
  readonly port: number;

  readonly targetPort: string;

  /**
   * The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
   */
  readonly nodePort?: number;

  /**
   * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP".
   * 
   * @default TCP
   */
  readonly protocol?: string;
}
