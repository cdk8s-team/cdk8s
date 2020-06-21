import * as k8s from './imports/k8s';
import { Construct } from 'constructs';
import { Resource, ResourceProps } from './base';
import * as cdk8s from 'cdk8s';
import { lazy } from './utils';
import { ObjectMeta } from './object-meta';
import { PodSpec } from './pod';

/**
 * Properties for initialization of `PodTemplate`.
 */
export interface PodTemplateProps extends ResourceProps {

  readonly spec?: PodTemplateSpec;

}

/**
 * Controllers for workload resources create Pods from a pod template and manage those Pods on your behalf.
 * PodTemplates are specifications for creating Pods, and are included in workload resources such as Deployments, Jobs, and DaemonSets.
 * Each controller for a workload resource uses the PodTemplate inside the workload object to make actual Pods.
 * The PodTemplate is part of the desired state of whatever workload resource you used to run your app.
 */
export class PodTemplate extends Resource {

  /**
   * @see base.Resource.apiObject
   */
  protected readonly apiObject: cdk8s.ApiObject;

  /**
   * Provides access to the underlying spec.
   *
   * You can use this field to apply post instantiation mutations
   * to the spec.
   */
  public readonly spec: PodTemplateSpec;

  constructor(scope: Construct, name: string, props: PodTemplateProps = {}) {
    super(scope, name, props);

    this.spec = props.spec ?? new PodTemplateSpec();

    this.apiObject = new k8s.PodTemplate(this, 'Pod', {
      metadata: this.metadata._toKube(),
      template: lazy(() => this.spec._toKube()),
    })
  }

}

/**
 * Properties for initialization of `PodTemplateSpec`.
 */
export interface PodTemplateSpecProps {

  /**
   * The metadata of the pod that will be created based on the template.
   *
   * @default - No metadata.
   */
  readonly metadata?: ObjectMeta;

  /**
   * The spec of the pod that will be created based on the template.
   * Use `template.podSpec` to apply post instantiation mutations.
   *
   * @default - An empty spec will be created.
   */
  readonly podSpec?: PodSpec;

}

/**
 * PodTemplateSpec describes the data a pod should have when created from a template
 *
 * @schema io.k8s.api.core.v1.PodTemplateSpec
 */
export class PodTemplateSpec {

  /**
   * Provides access to the pod spec this template uses.
   *
   * You can use this field to apply post instantiation mutations
   * to the spec.
   */
  public readonly podSpec: PodSpec;

  /**
   * Provides access to the pod metadata this template uses.
   *
   * You can use this field to apply post instantiation mutations
   * to the metadata.
   */
  public readonly metadata: ObjectMeta;

  constructor(props: PodTemplateSpecProps = {}) {
    this.metadata = props.metadata ?? new ObjectMeta();
    this.podSpec = props.podSpec ?? new PodSpec();
  }

  /**
   * @internal
   */
  public _toKube(): k8s.PodTemplateSpec {
    return {
      metadata: this.metadata._toKube(),
      spec: this.podSpec._toKube(),
    };
  }

}