import * as k8s from '../imports/k8s';
import { Construct } from 'constructs';
import { ResourceProps, Resource } from './base';
import * as cdk8s from 'cdk8s';
import { PodTemplateSpec } from './pod-template';


export interface StatefulSetProps extends ResourceProps {

  readonly spec?: StatefulSetSpec;

}

export class StatefulSet extends Resource {

  public readonly apiObject: cdk8s.ApiObject;

  public readonly spec: StatefulSetSpec;

  constructor(scope: Construct, id: string, props: StatefulSetProps = {}) {
    super(scope, id, props);

    this.spec = props.spec ?? new StatefulSetSpec();

    this.apiObject = new k8s.StatefulSet(this, 'StatefulSet', {
      metadata: {
        name: this.metadata?.name,
        ...this.metadata?._toKube(),
      },
      spec: this.spec._toKube(),
    })
  }

}

export interface StatefulSetSpecProps {

  readonly serviceName?: string;

  readonly podTemplateSpec?: PodTemplateSpec;

}

export class StatefulSetSpec {

  public readonly serviceName?: string;
  public readonly podTemplateSpec: PodTemplateSpec;
  public readonly labels: Record<string, string>;

  constructor(props: StatefulSetSpecProps = {}) {
    this.serviceName = props.serviceName;
    this.podTemplateSpec = props.podTemplateSpec ?? new PodTemplateSpec();

    this.labels = {};
  }

  public selectByLabel(key: string, value: string) {
    this.labels[key] = value;
  }

  /**
   * @internal
   */
  public _toKube(): k8s.StatefulSetSpec {

    // TODO: validate serviceName

    return {
      serviceName: this.serviceName!,
      template: this.podTemplateSpec._toKube(),
      selector: {
        matchLabels: this.labels,
      },
    }
  }

}
