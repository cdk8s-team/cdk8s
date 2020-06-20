import * as k8s from './imports/k8s';
import { Construct, Node } from 'constructs';
import { Service, ServiceSpec, ServiceType } from './service';
import { Resource, ResourceProps } from './base';
import * as cdk8s from 'cdk8s';
import { lazy } from './utils';
import { PodTemplateSpec } from './pod-template';


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
   * The port number the service will bind to.
   */
  readonly port: number;

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
   *
   */
  public readonly spec: DeploymentSpec;

  constructor(scope: Construct, id: string, props: DeploymentProps = {}) {
    super(scope, id, props);

    this.spec = props.spec ?? new DeploymentSpec();

    this.apiObject = new k8s.Deployment(this, 'Pod', {
      metadata: this.metadata._toKube(),
      spec: lazy(() => this.spec._toKube(this)),
    })
  }

  /**
   * Expose a deployment via a service.
   *
   * This is equivalent to running `kubectl expose deployment <deployment-name>`.
   *
   * @param options - Options.
   */
  public expose(options: ExposeOptions): Service {

    const containers = this.spec.template.podSpec.containers;

    if (containers.length === 0) {
      throw new Error('Cannot expose a deployment without containers');
    }

    // create a label and attach it to the deployment pods
    const selector = 'cdk8s.deployment'
    const matcher = Node.of(this).uniqueId

    const service = new Service(this, 'Service', {
      spec: new ServiceSpec({
        port: {
          // just a PoC, we assume the first container is the main one.
          // TODO: figure out what the correct thing to do here.
          port: options.port,
          targetPort: containers[0].port,
        },
        type: options.serviceType ?? ServiceType.CLUSTER_IP,
      }),
    })

    service.spec.selectByLabel(selector, matcher);

    return service;
  }

}

/**
 * Properties for initialization of `DeploymentSpec`.
 */
export interface DeploymentSpecProps {

  /**
   * Number of desired pods. This is a pointer to distinguish between explicit zero and not
   * specified. Defaults to 1.
   *
   * @default 1
   */
  readonly replicas?: number;

  /**
   * The PodTemplateSpec that will be used by a deployment to create pods.
   *
   * @see pod-template.PodTemplateSpec
   */
  readonly template?: PodTemplateSpec;

}

/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 */
export class DeploymentSpec {

  private readonly replicas?: number;
  private readonly labelSelectors: Record<string, string>;

  /**
   * Provides access to the underlying pod template spec.
   *
   * You can use this field to apply post instatiation mutations
   * to the spec.
   *
   * @see pod.PodTemplateSpec
   */
  public readonly template: PodTemplateSpec;

  constructor(props: DeploymentSpecProps = {}) {
    this.replicas = props.replicas ?? 1;
    this.template = props.template ?? new PodTemplateSpec();
    this.labelSelectors = {};
  }

  /**
   * Configure a label selector to this deployment.
   * Pods that have the label will be selected by deployments configured with this spec.
   *
   * @param key - The label key.
   * @param value - The label value.
   */
  public selectByLabel(key: string, value: string) {
    this.labelSelectors[key] = value;
  }

  /**
   * @internal
   */
  public _toKube(deployment: Deployment): k8s.DeploymentSpec {

    // automatically select pods in this deployment

    const selector = 'cdk8s.deployment';
    const matcher = Node.of(deployment).uniqueId;

    this.template.metadata.addLabel(selector, matcher);

    this.selectByLabel(selector, matcher);

    return {
      replicas: this.replicas,
      template: this.template._toKube(),
      selector: {
        matchLabels: this.labelSelectors,
      },
    };
  }
}
