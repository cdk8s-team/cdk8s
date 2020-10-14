import * as k8s from './imports/k8s';
import { Construct } from 'constructs';
import { Service, ServiceType } from './service';
import { Resource, ResourceProps } from './base';
import * as cdk8s from 'cdk8s';
import { PodSpecDefinition, PodSpec } from './pod';
import { ApiObjectMetadata, ApiObjectMetadataDefinition } from 'cdk8s';

/**
 * Properties for initialization of `Deployment`.
 */
export interface DeploymentProps extends ResourceProps {
  /**
   * The spec of the deployment. Use `deployment.spec` to apply post instatiation mutations.
   *
   * @default - An empty spec will be created.
   */
  readonly spec?: DeploymentSpec;
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
export class Deployment extends Resource {
  /**
   * @see base.Resource.apiObject
   */
  protected readonly apiObject: cdk8s.ApiObject;

  /**
   * Provides access to the underlying spec.
   *
   * You can use this field to apply post instantiation mutations
   * to the spec.
   */
  public readonly spec: DeploymentSpecDefinition;

  constructor(scope: Construct, id: string, props: DeploymentProps = {}) {
    super(scope, id, props);

    this.spec = new DeploymentSpecDefinition(props.spec);

    this.apiObject = new k8s.Deployment(this, 'Pod', {
      metadata: props.metadata,
      spec: cdk8s.Lazy.any({ produce: () => this.spec._toKube() }),
    });
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
      spec: {
        type: options.serviceType ?? ServiceType.CLUSTER_IP,
      },
    });

    service.spec.addDeployment(this, port);
    return service;
  }
}

/**
 * Properties for initialization of `DeploymentSpec`.
 */
export interface DeploymentSpec {

  /**
   * Number of desired pods.
   * @default 1
   */
  readonly replicas?: number;

  /**
   * Template for pod specs.
   */
  readonly podSpecTemplate?: PodSpec;

  /**
   * Template for pod metadata.
   */
  readonly podMetadataTemplate?: ApiObjectMetadata;
}

/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 */
export class DeploymentSpecDefinition {
  /**
   * Number of desired pods.
   */
  public readonly replicas?: number;

  /**
   * Provides access to the underlying pod template spec.
   *
   * You can use this field to apply post instatiation mutations
   * to the spec.
   */
  public readonly podSpecTemplate: PodSpecDefinition;

  /**
   * Template for pod metadata.
   */
  public readonly podMetadataTemplate: ApiObjectMetadataDefinition;

  private readonly _labelSelector: Record<string, string>;

  constructor(props: DeploymentSpec = {}) {
    this.replicas = props.replicas ?? 1;
    this.podSpecTemplate = new PodSpecDefinition(props.podSpecTemplate);
    this.podMetadataTemplate = new ApiObjectMetadataDefinition(props.podMetadataTemplate);

    this._labelSelector = {};
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
   * The labels this deployment will match against in order to select pods.
   *
   * Returns a a copy. Use `selectByLabel()` to add labels.
   */
  public get labelSelector(): Record<string, string> {
    return { ...this._labelSelector };
  }
  
  /**
   * @internal
   */
  public _toKube(): k8s.DeploymentSpec {
    return {
      replicas: this.replicas,
      template: {
        metadata: this.podMetadataTemplate.toJson(),
        spec: this.podSpecTemplate._toKube(),
      },
      selector: {
        matchLabels: this._labelSelector,
      },
    };
  }
}
