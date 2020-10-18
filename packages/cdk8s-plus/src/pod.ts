import * as k8s from './imports/k8s';
import { Construct } from 'constructs';
import { ResourceProps, Resource } from './base';
import * as cdk8s from 'cdk8s';
import { IServiceAccount } from './service-account';
import { Container } from './container';
import { Volume } from './volume';
import { ApiObjectMetadata, ApiObjectMetadataDefinition } from 'cdk8s';

/**
 * Represents a resource that deploys pods. (e.g `Deployment`, `Job`, `Pod`...).
 *
 * Use the `PodSpec` class as an implementation helper.
 */
export interface IPodSpec {

  /**
   * The containers belonging to the pod.
   *
   * Use `addContainer` to add containers.
   */
  readonly containers: Container[];

  /**
   * The volumes associated with this pod.
   *
   * Use `addVolume` to add volumes.
   */
  readonly volumes: Volume[];

  /**
   * Restart policy for all containers within the pod.
   */
  readonly restartPolicy?: RestartPolicy;

  /**
   * The service account used to run this pod.
   */
  readonly serviceAccount?: IServiceAccount;

  /**
   * Add a container to the pod.
   *
   * @param container The container.
   */
  addContainer(container: Container): void;

  /**
   * Add a volume to the pod.
   *
   * @param volume The volume.
   */
  addVolume(volume: Volume): void;

}

export interface IPodTemplate extends IPodSpec {

  readonly podMetadata: ApiObjectMetadataDefinition;
}

/**
 * Provides read/write capabilities ontop of a `PodSpec`.
 */
export class PodSpec implements IPodSpec {

  public readonly restartPolicy?: RestartPolicy;
  public readonly serviceAccount?: IServiceAccount;

  private readonly _containers: Container[];
  private readonly _volumes: Volume[];

  constructor(props: PodSpecProps = {}) {
    this.restartPolicy = props.restartPolicy;
    this.serviceAccount = props.serviceAccount;

    this._containers = props.containers ?? [];
    this._volumes = props.volumes ?? [];
  }

  public get containers(): Container[] {
    return [ ...this._containers ];
  }

  public get volumes(): Volume[] {
    return [ ...this._volumes ];
  }

  public addContainer(container: Container): void {
    this._containers.push(container);
  }

  public addVolume(volume: Volume): void {
    this._volumes.push(volume);
  }

  /**
   * @internal
   */
  public _toKube(): k8s.PodSpec {

    if (this.containers.length === 0) {
      throw new Error('PodSpec must have at least 1 container');
    }

    const volumes: k8s.Volume[] = [];
    const containers: k8s.Container[] = [];

    for (const container of this.containers) {

      // automatically add volume from the container mount
      // to this pod so thats its available to the container.
      for (const mount of container.mounts) {
        volumes.push(mount.volume._toKube());
      }

      containers.push(container._toKube());
    }

    for (const volume of this._volumes) {
      volumes.push(volume._toKube());
    }

    return {
      restartPolicy: this.restartPolicy,
      serviceAccountName: this.serviceAccount?.name,
      containers: containers,
      volumes: volumes,
    };

  }

}

export class PodTemplate extends PodSpec implements IPodTemplate {

  public readonly podMetadata: ApiObjectMetadataDefinition;

  constructor(props: PodTemplateProps = {}) {
    super(props);
    this.podMetadata = new ApiObjectMetadataDefinition(props.podMetadata);
  }
}

/**
 * Properties for initialization of `Pod`.
 */
export interface PodProps extends ResourceProps, PodSpecProps {}

/**
 * Specification of a `Pod`.
 */
export interface PodSpecProps {

  /**
   * List of containers belonging to the pod. Containers cannot currently be
   * added or removed. There must be at least one container in a Pod.
   *
   * You can add additionnal containers using `podSpec.addContainer()`
   *
   * @default - No containers. Note that a pod spec must include at least one container.
   */
  readonly containers?: Container[];

  /**
   * List of volumes that can be mounted by containers belonging to the pod.
   *
   * You can also add volumes later using `podSpec.addVolume()`
   *
   * @see https://kubernetes.io/docs/concepts/storage/volumes
   *
   * @default - No volumes.
   */
  readonly volumes?: Volume[];

  /**
   * Restart policy for all containers within the pod.
   *
   * @see https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
   *
   * @default RestartPolicy.ALWAYS
   */
  readonly restartPolicy?: RestartPolicy;

  /**
   * A service account provides an identity for processes that run in a Pod.
   *
   * When you (a human) access the cluster (for example, using kubectl), you are
   * authenticated by the apiserver as a particular User Account (currently this
   * is usually admin, unless your cluster administrator has customized your
   * cluster). Processes in containers inside pods can also contact the
   * apiserver. When they do, they are authenticated as a particular Service
   * Account (for example, default).
   *
   * @see https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
   *
   * @default - No service account.
   */
  readonly serviceAccount?: IServiceAccount;

}

export interface PodTemplateProps extends PodSpecProps {

  readonly podMetadata?: ApiObjectMetadata;
}

/**
 * Pod is a collection of containers that can run on a host. This resource is
 * created by clients and scheduled onto hosts.
 */
export class Pod extends Resource implements IPodSpec {

  /**
   * @see base.Resource.apiObject
   */
  protected readonly apiObject: cdk8s.ApiObject;

  private readonly _spec: PodSpec;

  constructor(scope: Construct, id: string, props: PodProps = {}) {
    super(scope, id, { metadata: props.metadata });

    this.apiObject = new k8s.Pod(this, 'Pod', {
      metadata: props.metadata,
      spec: cdk8s.Lazy.any({ produce: () => this._spec._toKube() }),
    });

    this._spec = new PodSpec(props);
  }

  public get containers(): Container[] {
    return this._spec.containers;
  }

  public get volumes(): Volume[] {
    return this._spec.volumes;
  }

  public get restartPolicy(): RestartPolicy | undefined {
    return this._spec.restartPolicy;
  }

  public get serviceAccount(): IServiceAccount | undefined {
    return this._spec.serviceAccount;
  }

  public addContainer(container: Container): void {
    return this._spec.addContainer(container);
  }

  public addVolume(volume: Volume): void {
    return this._spec.addVolume(volume);
  }

}

/**
 * Restart policy for all containers within the pod.
 */
export enum RestartPolicy {
  /**
   * Always restart the pod after it exits.
   */
  ALWAYS = 'Always',

  /**
   * Only restart if the pod exits with a non-zero exit code.
   */
  ON_FAILURE = 'OnFailure',

  /**
   * Never restart the pod.
   */
  NEVER = 'Never'
}

