import { Resource, ResourceProps } from './base';
import { ApiObject, ApiObjectMetadata, ApiObjectMetadataDefinition } from 'cdk8s';
import { Construct } from 'constructs';
import * as cdk8s from 'cdk8s';

import * as k8s from './imports/k8s';
import { RestartPolicy, PodSpecDefinition, PodSpec } from './pod';
import { Duration } from './duration';


/**
 * Properties for initialization of `Job`.
 */
export interface JobProps extends ResourceProps, JobSpec {}

/**
 * Specification of a `Job`.
 */
export interface JobSpec {

  /**
   * Spec for the job pods.
   *
   * @default - Empty spec. Can be configured via the `job.spec.podSpec` field.
   */
  readonly podSpec?: PodSpec;

  /**
   * Metadata for the job pods.
   *
   * @default - Empty metadata. Can be configured via the `job.spec.podMetadata` field.
   */
  readonly podMetadata?: ApiObjectMetadata;

  /**
   * Limits the lifetime of a Job that has finished execution (either Complete
   * or Failed). If this field is set, after the Job finishes, it is eligible to
   * be automatically deleted. When the Job is being deleted, its lifecycle
   * guarantees (e.g. finalizers) will be honored. If this field is set to zero,
   * the Job becomes eligible to be deleted immediately after it finishes. This
   * field is alpha-level and is only honored by servers that enable the
   * `TTLAfterFinished` feature.
   *
   * @default - If this field is unset, the Job won't be automatically deleted.
   */
  readonly ttlAfterFinished?: Duration;

}

/**
 * A Job creates one or more Pods and ensures that a specified number of them successfully terminate. As pods successfully complete,
 * the Job tracks the successful completions. When a specified number of successful completions is reached, the task (ie, Job) is complete.
 * Deleting a Job will clean up the Pods it created. A simple case is to create one Job object in order to reliably run one Pod to completion.
 * The Job object will start a new Pod if the first Pod fails or is deleted (for example due to a node hardware failure or a node reboot).
 * You can also use a Job to run multiple Pods in parallel.
 */
export class Job extends Resource {

  protected readonly apiObject: ApiObject;
  public readonly spec: JobSpecDefinition;

  constructor(scope: Construct, id: string, props: JobProps = {}) {
    super(scope, id, props);

    this.spec = new JobSpecDefinition(props);

    this.apiObject = new k8s.Job(this, 'Default', {
      metadata: props.metadata,
      spec: cdk8s.Lazy.any({ produce: () => this.spec._toKube() }),
    });
  }
}

export class JobSpecDefinition {

  /**
   * Provides access to the underlying pod spec.
   *
   * You can use this field to apply post instatiation mutations to the pod spec.
   */
  public readonly podSpec: PodSpecDefinition;

  /**
   * Provides access to the underlying pod metadata.
   *
   * You can use this field to apply post instatiation mutations to the pod metadata.
   */
  public readonly podMetadata: ApiObjectMetadataDefinition;

  /**
   * TTL before the job is deleted after it is finished.
   */
  public readonly ttlAfterFinished?: Duration;

  constructor(props: JobSpec = {}) {
    this.podSpec = new PodSpecDefinition({
      restartPolicy: props.podSpec?.restartPolicy ?? RestartPolicy.NEVER,
      ...props.podSpec,
    });
    this.podMetadata = new ApiObjectMetadataDefinition(props.podMetadata);
    this.ttlAfterFinished = props.ttlAfterFinished;
  }

  /**
   * @internal
   */
  public _toKube(): k8s.JobSpec {
    return {
      template: {
        metadata: this.podMetadata.toJson(),
        spec: this.podSpec._toKube(),
      },
      ttlSecondsAfterFinished: this.ttlAfterFinished ? this.ttlAfterFinished.toSeconds() : undefined,
    };
  }
}