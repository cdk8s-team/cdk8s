import * as k8s from '../imports/k8s';
import { Construct } from 'constructs';
import { ResourceProps, Resource } from './base';
import * as cdk8s from 'cdk8s';
import { IServiceAccount } from './service-account';
import { Container } from './container';
import { Volume } from './volume';
import { lazy } from './utils';

/**
 * Properties for initialization of `Pod`.
 */
export interface PodProps extends ResourceProps {

  readonly spec?: PodSpec;

}

/**
 * Pod is a collection of containers that can run on a host. This resource is
 * created by clients and scheduled onto hosts.
 */
export class Pod extends Resource {
  public readonly apiObject: cdk8s.ApiObject;

  public readonly spec: PodSpec;

  constructor(scope: Construct, id: string, props: PodProps = {}) {
    super(scope, id, props);

    this.spec = props.spec ?? new PodSpec();

    this.apiObject = new k8s.Pod(this, 'Pod', {
      metadata: this.metadata._toKube(),
      spec: lazy(() => this.spec._toKube()),
    })
  }

}

/**
 * Properties for initialization of `PodSpec`.
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
  readonly serviceAccout?: IServiceAccount;
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

/**
 * A description of a pod.
 */
export class PodSpec {

  /**
   * List of containers belonging to the pod.
   */
  public readonly containers: Container[];

  /**
   * List of volumes that can be mounted by containers belonging to the pod.
   */
  public readonly volumes: Volume[];

  /**
   * Restart policy for all containers within the pod.
   */
  public restartPolicy?: RestartPolicy;

  /**
   * The service account used to run this pod.
   */
  public serviceAccount?: IServiceAccount;

  constructor(props: PodSpecProps = {}) {
    this.containers = props.containers ?? [];
    this.volumes = props.volumes ?? [];
    this.restartPolicy = props.restartPolicy;
    this.serviceAccount = props.serviceAccout;
  }

  /**
   * Adds a container to this pod.
   *
   * @param container The container to add
   */
  public addContainer(container: Container): void {
    this.containers.push(container);
  }

  /**
   * Adds a volume to this pod.
   *
   * @paractualme The volume to add
   */
  public addVolume(volume: Volume): void {
    this.volumes.push(volume);
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

    for (const volume of this.volumes) {
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
