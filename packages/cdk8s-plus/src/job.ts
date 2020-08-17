import { Resource, ResourceProps } from './base';
import { ApiObject, ApiObjectMetadata, ApiObjectMetadataDefinition } from 'cdk8s';
import { Construct } from 'constructs';
import * as cdk8s from 'cdk8s';

import * as k8s from './imports/k8s';
import { RestartPolicy, PodSpec, PodSpecDefinition } from './pod';
import { Duration } from './duration';


/**
 * Properties for initialization of `Job`.
 */
export interface JobProps extends ResourceProps {

  /**
   * The spec of the job. Use `job.spec` to apply post instantiation mutations.
   *
   * @default - An empty spec will be created.
   */
  readonly spec?: JobSpec;
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

    this.spec = new JobSpecDefinition(props.spec);

    this.apiObject = new k8s.Job(this, 'Default', {
      metadata: props.metadata,
      spec: cdk8s.Lazy.any({ produce: () => this.spec._toKube() }),
    });
  }
}

/**
 * Properties for initialization of `JobSpec`.
 */
export interface JobSpec {
  /**
   * The spec of pods created by this job.
   */
  readonly podSpecTemplate?: PodSpec;

  /**
   * The metadata of pods created by this job.
   */
  readonly podMetadataTemplate?: ApiObjectMetadata;

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

export class JobSpecDefinition {
  /**
   * The spec for pods created by this job.
   */
  public readonly podSpecTemplate: PodSpecDefinition;

  /**
   * The metadata for pods created by this job.
   */
  public readonly podMetadataTemplate: ApiObjectMetadataDefinition;

  /**
   * TTL before the job is deleted after it is finished.
   */
  public readonly ttlAfterFinished?: Duration;

  constructor(props: JobSpec = {}) {
    this.podSpecTemplate = new PodSpecDefinition({
      restartPolicy: props.podSpecTemplate?.restartPolicy ?? RestartPolicy.NEVER,
      ...props.podSpecTemplate,
    });
    this.podMetadataTemplate = new ApiObjectMetadataDefinition(props.podMetadataTemplate);
    this.ttlAfterFinished = props.ttlAfterFinished;
  }

  /**
   * @internal
   */
  public _toKube(): k8s.JobSpec {
    return {
      template: {
        metadata: this.podMetadataTemplate.toJson(),
        spec: this.podSpecTemplate._toKube(),
      },
      ttlSecondsAfterFinished: this.ttlAfterFinished ? this.ttlAfterFinished.toSeconds() : undefined,
    };
  }
}