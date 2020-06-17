import * as k8s from '../imports/k8s';
import { Construct } from 'constructs';
import { Resource, ResourceProps } from './base';
import * as cdk8s from 'cdk8s';
import { onSynth } from './utils';
import { ObjectMeta } from './object-meta';
import { PodSpec } from './pod';

export interface PodTemplateProps extends ResourceProps {

  readonly spec: PodTemplateSpec;

}

export class PodTemplate extends Resource {

  public readonly apiObject: cdk8s.ApiObject;

  private readonly spec: PodTemplateSpec;

  constructor(scope: Construct, name: string, props: PodTemplateProps) {
    super(scope, name, props);

    this.spec = props.spec;

    this.apiObject = new k8s.PodTemplate(this, 'PodTemplate', {
      metadata: {
        name: this.metadata?.name,
        ...this.metadata?._toKube(),
      },
      template: this.spec._toKube(),
    })

  }


}

export interface PodTemplateSpecProps {

  readonly metadata?: ObjectMeta;

  readonly podSpec?: PodSpec;

}

export class PodTemplateSpec {

  public readonly metadata: ObjectMeta;
  public readonly podSpec: PodSpec;

  constructor(props: PodTemplateSpecProps = {}) {
    this.metadata = props.metadata ?? new ObjectMeta();
    this.podSpec = props.podSpec ?? new PodSpec();
  }

  /**
   * @internal
   */
  public _toKube(): k8s.PodTemplateSpec {
    return onSynth(() => ({
      metadata: this.metadata._toKube(),
      spec: this.podSpec._toKube(),
    }));
  }

}