import { ApiObject, Lazy, Names } from 'cdk8s';
import { Construct } from 'constructs';
import * as k8s from './imports/k8s';
import * as pod from './pod';
import * as svc from './service';

export interface StatefulSetProps extends pod.IPodTemplateOptions {
  /**
   * The name of the stateful set.
   *
   * @default - An auto-generated name.
   */
  readonly name?: string;

  /**
   * The Docker image name to use for the stateful set.
   */
  readonly image: string;

  /**
   * Number of desired pods.
   *
   * @default 1
   */
  readonly replicas?: number;

  /**
   * Service to associate with the stateful set.
   *
   * @default - A service is automatically created.
   */
  readonly service?: svc.Service;

  /**
   * The pod metadata of this workload.
   */
  readonly podMetadata?: any;

  /**
   * Automatically allocates a pod label selector for this workload and add
   * it to the pod metadata. This ensures that pods created by this workload
   * will consistently get selected by services declared with `{ selector:
   * WorkloadLabelSelector.POD }`.
   *
   * @default true
   */
  readonly select?: boolean;
}

/**
 * StatefulSet is the workload API object used to manage stateful applications.
 */
export class StatefulSet extends ApiObject {
  /**
   * The name of this stateful set.
   */
  public readonly name: string;

  /**
   * The metadata of pods in this workload.
   */
  public readonly podMetadata: any;

  /**
   * Whether or not this workload is configured to automatically allocate a
   * pod label selector and inject into the pod metadata.
   */
  public readonly select: boolean;

  /**
   * The containers in this stateful set.
   */
  public readonly containers: pod.Container[] = [];

  /**
   * The init containers in this stateful set.
   */
  public readonly initContainers: pod.Container[] = [];

  /**
   * The volumes associated with this stateful set.
   */
  public readonly volumes: pod.Volume[] = [];

  /**
   * The service associated with this stateful set.
   */
  public readonly service: svc.Service;

  private readonly _podOptions: pod.PodSpecOptions;
  private readonly _replicas: number;

  constructor(scope: Construct, id: string, props: StatefulSetProps) {
    super(scope, id);

    this._replicas = props.replicas ?? 1;
    this.select = props.select ?? true;

    this.podMetadata = props.podMetadata ?? { };
    this.name = props.name ?? Names.uniqueId(this).toLowerCase();

    // collect pod options
    this._podOptions = {
      containers: [],
      initContainers: props.initContainers,
      volumes: [],
      restartPolicy: props.restartPolicy,
      serviceAccount: props.serviceAccount,
      securityContext: props.securityContext,
      dns: props.dns,
      hostAliases: props.hostAliases,
      hostNetwork: props.hostNetwork,
      terminationGracePeriod: props.terminationGracePeriod,
      affinity: props.affinity,
      topologySpreadConstraints: props.topologySpreadConstraints,
      tolerations: props.tolerations,
    };

    const defaultPort: number | undefined = props.port;
    const defaultImage: string = props.image;

    this.addContainer({
      image: defaultImage,
      port: defaultPort,
      name: 'main',
    });

    if (props.service) {
      this.service = props.service;
    } else {
      this.service = new svc.Service(this, 'service', {
        selector: this.select ? pod.PodLabelSelector.of(this) : undefined,
        ports: props.port ? [{ port: props.port }] : undefined,
      });
    }

    // allow configuration of the pod metadata through the static pod metadata
    // property of the workload. this enables adding labels/annotations to the
    // pod metadata directly from the workload.
    if (this.select) {
      const selector = pod.PodLabelSelector.of(this);
      this.podMetadata.labels = { ...this.podMetadata.labels, ...selector.labels };
    }
  }

  /**
   * Add a container to the stateful set.
   *
   * @param container The container to add.
   */
  public addContainer(container: pod.ContainerProps): pod.Container {
    const impl = new pod.Container(container);
    this.containers.push(impl);
    return impl;
  }

  /**
   * Add an init container to the stateful set.
   *
   * @param container The container to add.
   */
  public addInitContainer(container: pod.ContainerProps): pod.Container {
    const impl = new pod.Container(container);
    this.initContainers.push(impl);
    return impl;
  }

  /**
   * Add a volume to the stateful set.
   *
   * @param volume The volume to add.
   */
  public addVolume(volume: pod.Volume): void {
    this.volumes.push(volume);
  }

  /**
   * @internal
   */
  public _toKube(): k8s.StatefulSetSpec {
    const podSpec: k8s.PodSpec = {
      containers: Lazy.any({ produce: () => this.containers.map(c => c._toKube()) }),
      initContainers: Lazy.any({ produce: () => this.initContainers.map(c => c._toKube()) }),
      volumes: Lazy.any({ produce: () => 
        [...this.volumes, ...this.collectVolumesFromContainers()]
          .map(v => v._toKube())
      }),
      restartPolicy: this._podOptions.restartPolicy,
      serviceAccountName: this._podOptions.serviceAccount?.name,
      securityContext: this._podOptions.securityContext?._toKube(),
      dnsPolicy: this._podOptions.dns?.policy,
      dnsConfig: this._podOptions.dns?.config,
      hostAliases: this._podOptions.hostAliases,
      hostNetwork: this._podOptions.hostNetwork,
      terminationGracePeriodSeconds: this._podOptions.terminationGracePeriod?.toSeconds(),
      affinity: this._podOptions.affinity?._toKube(),
      topologySpreadConstraints: this._podOptions.topologySpreadConstraints?.map(c => c._toKube()),
      tolerations: this._podOptions.tolerations?.map(t => t._toKube()),
    };

    return {
      serviceName: this.service.name,
      replicas: this._replicas,
      selector: {
        matchLabels: pod.PodLabelSelector.of(this).labels,
      },
      template: {
        metadata: this.podMetadata,
        spec: podSpec,
      },
    };
  }

  /**
   * Collect all volumes from all containers in this stateful set.
   */
  private collectVolumesFromContainers(): pod.Volume[] {
    const volumes: pod.Volume[] = [];
    for (const container of [...this.containers, ...this.initContainers]) {
      volumes.push(...container._volumes);
    }
    return volumes;
  }
}