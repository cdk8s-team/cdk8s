import * as k8s from './imports/k8s';
import { Construct, Node } from 'constructs';
import { Service, ServiceType } from './service';
import { ResourceProps } from './base';
import * as cdk8s from 'cdk8s';
import { ApiObjectMetadata, ApiObjectMetadataDefinition, Names } from 'cdk8s';
import { PodResource, PodSpec, PodSpecDefinition } from './pod'

/**
 * Properties for initialization of `Deployment`.
 */
export interface DeploymentProps extends ResourceProps {

  /**
   * Number of desired pods.
   *
   * @default 1
   */
  readonly replicas?: number;

  /**
   * Automatically allocates a pod selector for this deployment.
   *
   * If this is set to `false` you must define your selector through
   * `podSepcTemplate.addLabel()` and `selectByLabel()`.
   *
   * @default true
   */
  readonly defaultSelector?: boolean;

  /**
   * Spec for the deployment pods.
   *
   * @default - Empty spec. Can be configured via the `deployment.spec.podSpec` field.
   */
  readonly podSpec?: PodSpec;

  /**
   * Metadata for the deployment pods.
   *
   * @default - Empty metadata. Can be configured via the `deployment.spec.podMetadata` field.
   */
  readonly podMetadata?: ApiObjectMetadata;

}

/**
 * Options for exposing a deployment via a service.
 */
export interface ExposeOptions {
  /**
   * The type of the exposed service.
   *
   * @default - ClusterIP.
   */
  readonly serviceType?: ServiceType;
}

/**
*
* A Deployment provides declarative updates for Pods and ReplicaSets.
*
* You describe a desired state in a Deployment, and the Deployment Controller changes the actual
* state to the desired state at a controlled rate. You can define Deployments to create new ReplicaSets, or to remove
* existing Deployments and adopt all their resources with new Deployments.
*
* > Note: Do not manage ReplicaSets owned by a Deployment. Consider opening an issue in the main Kubernetes repository if your use case is not covered below.
*
* Use Case
* ---------
*
* The following are typical use cases for Deployments:
*
* - Create a Deployment to rollout a ReplicaSet. The ReplicaSet creates Pods in the background.
*   Check the status of the rollout to see if it succeeds or not.
* - Declare the new state of the Pods by updating the PodTemplateSpec of the Deployment.
*   A new ReplicaSet is created and the Deployment manages moving the Pods from the old ReplicaSet to the new one at a controlled rate.
*   Each new ReplicaSet updates the revision of the Deployment.
* - Rollback to an earlier Deployment revision if the current state of the Deployment is not stable.
*   Each rollback updates the revision of the Deployment.
* - Scale up the Deployment to facilitate more load.
* - Pause the Deployment to apply multiple fixes to its PodTemplateSpec and then resume it to start a new rollout.
* - Use the status of the Deployment as an indicator that a rollout has stuck.
* - Clean up older ReplicaSets that you don't need anymore.
*
**/
export class Deployment extends PodResource {

  /**
   * Number of desired pods.
   */
  public readonly replicas: number;

  /**
   * @see base.Resource.apiObject
   */
  protected readonly apiObject: cdk8s.ApiObject;

  /**
   * @see pod.PodResource.podSpecDefinition
   */
  protected readonly podSpecDefinition: PodSpecDefinition;

  /**
   * @see pod.PodResource.podMetadataDefinition
   */
  protected readonly podMetadataDefinition: ApiObjectMetadataDefinition;

  private readonly _labelSelector: Record<string, string>;

  constructor(scope: Construct, id: string, props: DeploymentProps = {}) {
    super(scope, id, props);

    this.apiObject = new k8s.Deployment(this, 'Deployment', {
      metadata: props.metadata,
      spec: cdk8s.Lazy.any({ produce: () => this._toKube() }),
    });
    this.podSpecDefinition = new PodSpecDefinition(props.podSpec)
    this.podMetadataDefinition = new ApiObjectMetadataDefinition(props.podMetadata);

    this.replicas = props.replicas ?? 1;
    this._labelSelector = {};

    if (props.defaultSelector ?? true) {
      const selector = 'cdk8s.deployment';
      const matcher = Names.toLabelValue(Node.of(this).path);
      this.podMetadataDefinition.addLabel(selector, matcher);
      this.selectByLabel(selector, matcher);
    }
  }

  /**
   * The labels this deployment will match against in order to select pods.
   *
   * Returns a a copy. Use `selectByLabel()` to add labels.
   */
  public get labelSelector(): Record<string, string> {
    return { ...this._labelSelector };
  }

  /**
   * Configure a label selector to this deployment.
   * Pods that have the label will be selected by deployments configured with this spec.
   *
   * @param key - The label key.
   * @param value - The label value.
   */
  public selectByLabel(key: string, value: string) {
    this._labelSelector[key] = value;
  }

  /**
   * Expose a deployment via a service.
   *
   * This is equivalent to running `kubectl expose deployment <deployment-name>`.
   *
   * @param port The port number the service will bind to.
   * @param options Options.
   */
  public expose(port: number, options: ExposeOptions = {}): Service {
    const service = new Service(this, 'Service', {
      type: options.serviceType ?? ServiceType.CLUSTER_IP,
    });

    service.addDeployment(this, port);
    return service;
  }

  /**
   * @internal
   */
  public _toKube(): k8s.DeploymentSpec {
    return {
      replicas: this.replicas,
      template: {
        metadata: this.podMetadataDefinition.toJson(),
        spec: this.podSpecDefinition._toKube(),
      },
      selector: {
        matchLabels: this._labelSelector,
      },
    };
  }

}