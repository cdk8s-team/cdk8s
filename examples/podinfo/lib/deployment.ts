import { Construct } from '@aws-cdk/core';
import { DeploymentObject as DeploymentObject, ApiObject } from '../../../lib';
import { Autoscaler, AutoscalingOptions } from './autoscaler';
import { Container, ContainerSpec } from './container';

export interface DeploymentOptions {
  /**
   * node/pod affinities
   */
  readonly affinity?: string;

  /**
   * Node labels for pod assignment
   */
  readonly nodeSelector?: any;

  /**
   * Desired number of pods
   * 
   * Cannot be specified if auto-scaling is enabled.
   * 
   * @default 2
   */
  readonly replicaCount?: number;

  /**
   * Indicates whether to enable pod autoscaling.
   * 
   * @default true
   */
  readonly autoScaling?: boolean;

  /**
   * Options for autoscaling. Can only be specified if `autoScaling` is enabled.
   * @default - see default autoscaler options
   */
  readonly autoScalingOptions?: AutoscalingOptions;

  /**
   * The name of the service account to use.
   * 
   * If a name is provided, the specified account will be used. Otherwise, an account will be
   * automatically created.
   * 
   * @default - a service account will automatically be created.
   */
  readonly serviceAccount?: string;

  /**
   * Labels to add to the deployment and to all pods in the deployment.
   */
  readonly labels?: { [key: string]: any };
}

export class Deployment extends Construct {
  private readonly containers = new Array<ContainerSpec>();
  private readonly volumes = new Array<{ name: string, emptyDir: {} }>();
  private readonly annotations: { [key: string]: any } = { };

  /**
   * A list of labels that can be used to select the pods in this deployment.
   */
  public readonly podSelector: { [key: string]: any };

  constructor(scope: Construct, ns: string, options: DeploymentOptions = { }) {
    super(scope, ns);

    const autoScaling = options.autoScaling === undefined ? true : options.autoScaling;

    if (!autoScaling && options.autoScalingOptions) {
      throw new Error(`can't specify "autoScalingOptions" when auto-scaling is disabled`);
    }

    if (autoScaling && options.replicaCount !== undefined) {
      throw new Error('Cannot specify "replicaCount" when auto-scaling is enabled');
    }

    //
    // parse options


    //
    // labels

    this.podSelector = { 
      deploymentId: this.node.uniqueId,
      ...options.labels
    };

    //
    // deployment

    const deployment = new DeploymentObject(this, 'Deployment', {
      metadata: {
        labels: options.labels
      },
      spec: {
        replicas: !autoScaling ? options.replicaCount : undefined,
        strategy: {
          type: 'RollingUpdate',
          rollingUpdate: { maxUnavailable: 1 }
        },
        selector: {
          matchLabels: this.podSelector
        },
        template: {
          metadata: {
            labels: this.podSelector,
            annotations: this.annotations
          },
          spec: {
            terminationGracePeriodSeconds: 30,
            serviceAccountName: this.getCreateServiceAccount(options.serviceAccount, options.labels),
            containers: this.containers,
          },
          nodeSelector: options.nodeSelector,
          affinity: options.affinity,
          volumes: this.volumes
        }
      }
    });

    if (autoScaling) {
      new Autoscaler(this, 'autoscaler', {
        target: deployment,
        ...options.autoScalingOptions
      });
    }
  }

  public addContainer(container: Container) {
    const spec = container.bind(this);
    this.containers.push(spec);

    for (const mount of spec.volumeMounts || []) {
      this.volumes.push({
        name: mount.name,
        emptyDir: {}
      });
    }
  }

  public addAnnotation(key: string, value: any) {
    this.annotations[key] = value;
  }

  private getCreateServiceAccount(serviceAccount: string | undefined, labels: any) {
    if (serviceAccount) {
      return serviceAccount;
    }

    const obj = new ApiObject(this, 'ServiceAccount', {
      apiVersion: 'v1',
      kind: 'ServiceAccount',
      metadata: {
        labels: labels
      }
    });

    return obj.name;
  }
}

export enum ImagePullPolicy {
  IF_NOT_PRESENT = 'IfNotPresent',
  NEVER = 'Never'
}
