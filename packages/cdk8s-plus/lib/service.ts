import * as k8s from '../imports/k8s';
import { Construct } from 'constructs';
import { ResourceProps, Resource } from './base';
import * as cdk8s from 'cdk8s';
import { onSynth } from './utils';


export interface ServiceProps extends ResourceProps {

  readonly spec?: ServiceSpec;

}

export class Service extends Resource {

  public readonly apiObject: cdk8s.ApiObject;

  public readonly spec: ServiceSpec;

  constructor(scope: Construct, id: string, props: ServiceProps = {}) {
    super(scope, id, props);

    this.spec = props.spec ?? new ServiceSpec();

    this.apiObject = new k8s.Service(this, 'Pod', {
      metadata: {
        name: this.metadata?.name,
        ...this.metadata?._toKube(),
      },
      spec: this.spec._toKube(),
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

    return onSynth(() => ({
      clusterIP: this.clusterIP,
      externalIPs: this.externalIPs,
      type: this.type,
      selector: this.labels,
      ports: ports,
    }));
  }


}