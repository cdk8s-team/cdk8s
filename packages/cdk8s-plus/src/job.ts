import { Resource, ResourceProps } from './base';
import { ApiObject } from 'cdk8s';
import { Construct } from 'constructs';

import * as k8s from './imports/k8s';
import { PodTemplateSpec } from './pod-template';
import { RestartPolicy } from './pod';
import { Duration } from './duration';
import { lazy } from './utils';


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

  public readonly apiObject: ApiObject;
  public readonly spec: JobSpec;

  constructor(scope: Construct, id: string, props: JobProps = {}) {
    super(scope, id, props);

    this.spec = props.spec ?? new JobSpec();

    this.apiObject = new k8s.Job(this, 'Default', {
      metadata: this.metadata._toKube(),
      spec: lazy(() => this.spec._toKube()),
    });
  }
}

/**
 * Properties for initialization of `JobSpec`.
 */
export interface JobSpecProps {

  readonly template?: PodTemplateSpec;

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
export class JobSpec {

  public readonly template: PodTemplateSpec;
  public readonly ttlAfterFinished?: Duration;

  constructor(props: JobSpecProps = {}) {
    this.template = props.template ?? new PodTemplateSpec();
    this.ttlAfterFinished = props.ttlAfterFinished;

    if (!this.template.podSpec.restartPolicy) {
      this.template.podSpec.restartPolicy = RestartPolicy.NEVER;
    }
  }

  /**
   * @internal
   */
  public _toKube(): k8s.JobSpec {
    return {
      template: this.template._toKube(),
      ttlSecondsAfterFinished: this.ttlAfterFinished ? this.ttlAfterFinished.toSeconds() : undefined,
    };
  }
}