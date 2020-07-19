import * as k8s from './imports/k8s';
import { Construct } from 'constructs';
import { ResourceProps, Resource } from './base';
import * as cdk8s from 'cdk8s';
import { lazy } from './utils';
import { PodSpec, PodSpecDefinition } from './pod';

/**
 * Properties for initialization of `PodTemplate`.
 */
export interface PodTemplateProps extends ResourceProps {

  readonly template?: PodTemplateSpec;

}

export interface PodTemplateSpec extends PodSpec {

  readonly metadata?: cdk8s.ApiObjectMetadata;

}

/**
 * Pod template is...
 */
export class PodTemplate extends Resource {
  protected readonly apiObject: cdk8s.ApiObject;

  /**
   * Provides access to the underlying spec.
   *
   * You can use this field to apply post instantiation mutations
   * to the spec.
   */
  public readonly spec: PodTemplateSpecDefinition;

  constructor(scope: Construct, id: string, props: PodTemplateProps = {}) {
    super(scope, id, props);

    this.spec = new PodTemplateSpecDefinition(props);

    this.apiObject = new k8s.PodTemplate(this, 'Pod', {
      metadata: props.metadata,
      template: lazy(() => this.spec._toKube()),
    });
  }
}

/**
 * A description of a pod template.
 */
export class PodTemplateSpecDefinition {

  /**
   * Provides access to the underlying pod template spec.
   *
   * You can use this field to apply post instatiation mutations
   * to the spec.
   */
  public readonly spec: PodSpecDefinition;

  public readonly metadata: cdk8s.ApiObjectMetadataDefinition;

  constructor(props: PodTemplateSpec = {}) {
    this.spec = new PodSpecDefinition(props);
    this.metadata = new cdk8s.ApiObjectMetadataDefinition(props.metadata);
  }

  /**
   * @internal
   */
  public _toKube(): k8s.PodTemplateSpec {
    return {
      metadata: this.metadata.toJson(),
      spec: this.spec._toKube(),
    }
  }
}
