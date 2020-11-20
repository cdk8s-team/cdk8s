import { ApiObject, ApiObjectMetadataDefinition, Lazy, Names } from 'cdk8s';
import { Construct } from 'constructs';
import { Resource, ResourceProps } from './base';
import { Container, ContainerProps } from './container';
import * as k8s from './imports/k8s';
import { RestartPolicy, PodTemplate, IPodTemplate, PodTemplateProps } from './pod';
import { Service, ServiceProps, ServiceType } from './service';
import { IServiceAccount } from './service-account';
import { Volume } from './volume';


export enum PodManagementPolicy {
  ORDERED_READY = 'OrderedReady',
  PARALLEL = 'Parallel',
}

/**
 * Properties for initialization of `StatefulSet`.
 */
export interface StatefulSetProps extends ResourceProps, PodTemplateProps {
  /**
    * Number of desired pods.
    *
    * @default 1
    */
  readonly replicas?: number;

  /**
    * Automatically allocates a pod selector for this statefulset.
    *
    * If this is set to `false` you must define your selector through
    * `statefulset.podMetadata.addLabel()` and `statefulset.selectByLabel()`.
    *
    * @default true
    */
  readonly defaultSelector?: boolean;

  /**
    * Pod management policy to use for this statefulset.
    *
    * @default PodManagementPolicy.ORDERED_READY
    */
  readonly podManagementPolicy?: PodManagementPolicy;

  /**
    * Details of service to create and expose.
    *
    * @default undefined - allocate a default service based upon servicePort and serviceName.
    */
  readonly service?: ServiceProps;

  /**
    * Default port to expose if service doesn't includes ports.
    *
    * Must set this or include ports in service props.
    *
    * @default undefined
    */
  readonly servicePort?: number;

  /**
    * Name to use for the service to allow finding it in DNS.
    *
    * @default undefined
    */
  readonly serviceName?: string;
}

/**
 * StatefulSet is the workload API object used to manage stateful applications.
 *
 * Manages the deployment and scaling of a set of Pods, and provides guarantees
 * about the ordering and uniqueness of these Pods.
 *
 * Like a Deployment, a StatefulSet manages Pods that are based on an identical
 * container spec. Unlike a Deployment, a StatefulSet maintains a sticky identity
 * for each of their Pods. These pods are created from the same spec, but are not
 * interchangeable: each has a persistent identifier that it maintains across any
 * rescheduling.
 *
 * If you want to use storage volumes to provide persistence for your workload, you
 * can use a StatefulSet as part of the solution. Although individual Pods in a StatefulSet
 * are susceptible to failure, the persistent Pod identifiers make it easier to match existing
 * volumes to the new Pods that replace any that have failed.
 *
 * Using StatefulSets
 * ------------------
 * StatefulSets are valuable for applications that require one or more of the following.
 *
 * - Stable, unique network identifiers.
 * - Stable, persistent storage.
 * - Ordered, graceful deployment and scaling.
 * - Ordered, automated rolling updates.
 */
export class StatefulSet extends Resource implements IPodTemplate {
  /**
    * Number of desired pods.
    */
  public readonly replicas: number;

  /**
    * Management policy to use for the set.
    */
  public readonly podManagementPolicy: PodManagementPolicy;

  /**
    * @see base.Resource.apiObject
    */
  protected readonly apiObject: ApiObject;

  private readonly _podTemplate: PodTemplate;
  private readonly _labelSelector: Record<string, string>;

  private readonly _service: Service;

  constructor(scope: Construct, id: string, props: StatefulSetProps = {}) {
    super(scope, id, { metadata: props.metadata });

    this.apiObject = new k8s.KubeStatefulSet(this, 'Resource', {
      metadata: props.metadata,
      spec: Lazy.any({ produce: () => this._toKube() }),
    });

    if (!props.servicePort && !props.service?.ports) {
      throw new Error('Cannot build a stateful set with a Service without ports.');
    }

    this._service = new Service(this, 'Service', {
      metadata: props.serviceName ? { name: props.serviceName } : undefined,
      type: props.service?.type ?? ServiceType.CLUSTER_IP,
      clusterIP: props.service?.clusterIP,
      ports:
            props.service?.ports ?? (props.servicePort != null ? [{ port: props.servicePort }] : []),
    });

    this.replicas = props.replicas ?? 1;
    this.podManagementPolicy = props.podManagementPolicy ?? PodManagementPolicy.ORDERED_READY;
    this._podTemplate = new PodTemplate(props);
    this._labelSelector = {};

    if (props.defaultSelector ?? true) {
      const selector = 'cdk8s.statefulset';
      const matcher = Names.toLabelValue(this);
      this.podMetadata.addLabel(selector, matcher);
      this.selectByLabel(selector, matcher);
    }

    const selectors = Object.entries(this.labelSelector);
    for (const [k, v] of selectors) {
      this._service.addSelector(k, v);
    }
  }

  get podMetadata(): ApiObjectMetadataDefinition {
    return this._podTemplate.podMetadata;
  }

  /**
    * The labels this deployment will match against in order to select pods.
    *
    * Returns a a copy. Use `selectByLabel()` to add labels.
    */
  get labelSelector(): Record<string, string> {
    return { ...this._labelSelector };
  }

  get containers(): Container[] {
    return this._podTemplate.containers;
  }

  get volumes(): Volume[] {
    return this._podTemplate.volumes;
  }

  get restartPolicy(): RestartPolicy | undefined {
    return this._podTemplate.restartPolicy;
  }

  get serviceAccount(): IServiceAccount | undefined {
    return this._podTemplate.serviceAccount;
  }

  /**
    * Configure a label selector to this deployment.
    * Pods that have the label will be selected by deployments configured with this spec.
    *
    * @param key - The label key.
    * @param value - The label value.
    */
  selectByLabel(key: string, value: string): void {
    this._labelSelector[key] = value;
  }

  addContainer(container: ContainerProps): Container {
    return this._podTemplate.addContainer(container);
  }

  addVolume(volume: Volume): void {
    return this._podTemplate.addVolume(volume);
  }

  /**
    * @internal
    */
  _toKube(): k8s.StatefulSetSpec {
    return {
      serviceName: this._service.name,
      replicas: this.replicas,
      template: this._podTemplate._toPodTemplateSpec(),
      selector: {
        matchLabels: this._labelSelector,
      },
      podManagementPolicy: this.podManagementPolicy,
    };
  }
}
