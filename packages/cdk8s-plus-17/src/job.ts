import { ApiObject, ApiObjectMetadataDefinition, Lazy, Duration } from 'cdk8s';
import { Construct } from 'constructs';
import { Resource, ResourceProps } from './base';
import { Container, ContainerProps } from './container';
import * as k8s from './imports/k8s';
import { RestartPolicy, PodTemplateProps, IPodTemplate, PodTemplate } from './pod';
import { IServiceAccount } from './service-account';
import { Volume } from './volume';


/**
 * Properties for initialization of `Job`.
 */
export interface JobProps extends ResourceProps, PodTemplateProps {

  /**
   * Specifies the duration in seconds the job may be active before the system tries to terminate it.
   *
   * @default - If unset, then there is no deadline.
   */
  readonly activeDeadline?: Duration;

  /**
   * Specifies the number of retries before marking this job failed.
   *
   * @default - If not set, system defaults to 6.
   */
  readonly backoffLimit?: number;

  /**
   * Specifies the desired number of successfully finished pods the job should be run with.
   * Setting to undefined means that the success of any pod signals the success of all pods,
   * and allows parallelism to have any positive value. Setting to 1 means that parallelism
   * is limited to 1 and the success of that pod signals the success of the job.
   *
   * @default - undefined
   */
  readonly completions?: number;

  /**
   * Specifies the maximum desired number of pods the job should run at any given time.
   * The actual number of pods running in steady state will be less than this number when
   * ((.spec.completions - .status.successful) < .spec.parallelism),
   * i.e. when the work left to do is less than max parallelism.
   *
   * @defaul - If unset, there will be no parallelism.
   */
  readonly parallelism?: number;

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
export class Job extends Resource implements IPodTemplate {

  /**
   * Duration before job is terminated. (must be integer number of seconds)
   */
  public readonly activeDeadline?: Duration;

  /**
   * Number of retries before marking failed.
   */
  public readonly backoffLimit?: number;

  /**
   * Number of successful completions required for job.
   */
  public readonly completions?: number;

  /**
   * Max pods to run at a given time.
   */
  public readonly parallelism?: number;

  /**
   * TTL before the job is deleted after it is finished.
   */
  public readonly ttlAfterFinished?: Duration;


  /**
   * @see base.Resource.apiObject
   */
  protected readonly apiObject: ApiObject;

  private readonly _podTemplate: PodTemplate;

  constructor(scope: Construct, id: string, props: JobProps = {}) {
    super(scope, id, { metadata: props.metadata });

    this.apiObject = new k8s.KubeJob(this, 'Resource', {
      metadata: props.metadata,
      spec: Lazy.any({ produce: () => this._toKube() }),
    });

    this._podTemplate = new PodTemplate({
      ...props,
      restartPolicy: props.restartPolicy ?? RestartPolicy.NEVER,
    });
    this.activeDeadline = props.activeDeadline;
    this.backoffLimit = props.backoffLimit;
    this.completions = props.completions;
    this.parallelism = props.parallelism;
    this.ttlAfterFinished = props.ttlAfterFinished;

  }

  public get podMetadata(): ApiObjectMetadataDefinition {
    return this._podTemplate.podMetadata;
  }

  public get containers(): Container[] {
    return this._podTemplate.containers;
  }

  public get volumes(): Volume[] {
    return this._podTemplate.volumes;
  }

  public get restartPolicy(): RestartPolicy | undefined {
    return this._podTemplate.restartPolicy;
  }

  public get serviceAccount(): IServiceAccount | undefined {
    return this._podTemplate.serviceAccount;
  }

  public addContainer(container: ContainerProps): Container {
    return this._podTemplate.addContainer(container);
  }

  public addVolume(volume: Volume): void {
    return this._podTemplate.addVolume(volume);
  }

  /**
   * @internal
   */
  public _toKube(): k8s.JobSpec {
    return {
      template: this._podTemplate._toPodTemplateSpec(),
      activeDeadlineSeconds: this.activeDeadline ? this.activeDeadline?.toSeconds() : undefined,
      backoffLimit: this.backoffLimit,
      completions: this.completions,
      parallelism: this.parallelism,
      ttlSecondsAfterFinished: this.ttlAfterFinished ? this.ttlAfterFinished.toSeconds() : undefined,
    };
  }

}
