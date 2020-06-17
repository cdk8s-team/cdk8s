import * as k8s from '../imports/k8s';
import { Construct } from 'constructs';
import { ResourceProps, Resource } from './base';
import * as cdk8s from 'cdk8s';
import { IServiceAccount } from './service-account';
import { EnvValue, Container } from './container';
import { Volume } from './volume';

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
      metadata: {
        name: this.metadata?.name,
        ...this.metadata?._toKube(),
      },
      spec: this.spec._toKube(),
    })
  }

}

/**
 * Properties for initialization `PodSpec`.
 */
export interface PodSpecProps {
  /**
   * List of containers belonging to the pod. Containers cannot currently be
   * added or removed. There must be at least one container in a Pod.
   *
   * You can add additionnal containers using `podSpec.addContainer()`
   */
  readonly containers?: Container[];

  /**
   * List of volumes that can be mounted by containers belonging to the pod.
   *
   * You can also add volumes later using `podSpec.addVolume()`
   *
   * @see https://kubernetes.io/docs/concepts/storage/volumes
   * @default - no volumes
   */
  readonly volumes?: Volume[];

  /**
   * Restart policy for all containers within the pod.
   *
   * @see https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
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
   * @see
   * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
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
   * List of containers belonging to the pod. Containers cannot currently be
   * added or removed. There must be at least one container in a Pod.
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
   * @param container The container to add
   */
  public addContainer(container: Container): void {
    this.containers.push(container);
  }

  /**
   * Adds a volume to this pod.
   * @param volume The volume to add
   */
  public addVolume(volume: Volume): void {
    this.volumes.push(volume);
  }

  /**
   * @internal
   */
  public _toKube(): k8s.PodSpec {

    if (this.containers.length == 0) {
      throw new Error('PodSpec must have at least 1 container');
    }

    const volumes: k8s.Volume[] = [];
    const containers: k8s.Container[] = [];

    for (const volume of this.volumes) {
      volumes.push({
        name: volume.name,
        configMap: volume.configMap,
        hostPath: volume.hostPath,
      })
    }

    for (const container of this.containers) {

      const volumeMounts: k8s.VolumeMount[] = [];

      for (const volumeMount of container.volumeMounts) {
        volumeMounts.push({
          // TODO: validate this volume is actually one of the pod volumes.
          // later we can consider automatically adding the volume.
          name: volumeMount.volume.name,
          mountPath: volumeMount.path,
        })
      }

      const ports = new Array();

      containers.push({
        name: container.name,
        image: container.image,
        ports: ports,
        volumeMounts: volumeMounts,
        command: container.command,
        workingDir: container.workingDir,
        env: renderEnv(container.env),
      });

      if (container.port) {
        ports.push({
          containerPort: container.port,
        });
      }
    }

    return {
      restartPolicy: this.restartPolicy,
      serviceAccountName: this.serviceAccount?.name,
      containers: containers,
      volumes: volumes,
    };

    function renderEnv(env?: { [name: string]: EnvValue }): k8s.EnvVar[] {
      const result = new Array<k8s.EnvVar>();
      for (const [name, v] of Object.entries(env ?? {})) {
        result.push({
          name,
          value: v.value,
          valueFrom: v.valueFrom,
        });
      }
      return result;
    }
  }
}
