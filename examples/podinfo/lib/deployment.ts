import { Construct } from '@aws-cdk/core';
import { DeploymentObject as DeploymentObject, ApiObject } from '../../../lib';
import { Autoscaler, AutoscalingOptions } from './autoscaler';
import { Container, ContainerSpec } from './container';
import { ISelector } from './service';

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
   * @default - false unless `autoScalingOptions` is set
   */
  readonly autoScaling?: boolean;

  /**
   * Options for autoscaling. If this is used without speci
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

  /**
   * Containers to add to this deployment. You can add additional containers through `addContaienr`.
   */
  readonly containers?: Container[];
}

export class Deployment extends Construct implements ISelector {
  private readonly containers = new Array<ContainerSpec>();
  private readonly volumes = new Array<{ name: string, emptyDir: {} }>();
  private readonly annotations: { [key: string]: any } = { };

  /**
   * A list of labels that can be used to select the pods in this deployment.
   */
  public readonly selector: { [key: string]: any };

  constructor(scope: Construct, ns: string, options: DeploymentOptions = { }) {
    super(scope, ns);

    let autoScaling = options.autoScaling === undefined ? false : options.autoScaling;

    if (!autoScaling && options.autoScalingOptions) {
      autoScaling = true;
    }

    if (autoScaling && options.replicaCount !== undefined) {
      throw new Error('Cannot specify "replicaCount" when auto-scaling is enabled');
    }

    //
    // labels

    this.selector = { 
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
          matchLabels: this.selector
        },
        template: {
          metadata: {
            labels: this.selector,
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

    if (options.containers) {
      for (const c of options.containers) {
        this.addContainer(c);
      }
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
