import * as k8s from '../imports/k8s';
import { Construct, Node } from 'constructs';
import { Service, ServiceSpec } from './service';
import { Resource, ResourceProps } from './base';
import * as cdk8s from 'cdk8s';
import { lazy } from './utils';
import { PodTemplateSpec } from './pod-template';

export interface DeploymentProps extends ResourceProps {

  readonly spec?: DeploymentSpec;

}

export interface ExposeOptions {

  readonly port: number;
}

export class Deployment extends Resource {

  public readonly apiObject: cdk8s.ApiObject;

  public readonly spec: DeploymentSpec;

  constructor(scope: Construct, id: string, props: DeploymentProps = {}) {
    super(scope, id, props);

    this.spec = props.spec ?? new DeploymentSpec();

    this.apiObject = new k8s.Deployment(this, 'Pod', {
      metadata: this.metadata._toKube(),
      spec: lazy(() => this.spec._toKube(Node.of(this))),
    })
  }

  public expose(options: ExposeOptions): Service {

    // just a PoC, we assume the first container is the main one.
    // TODO: figure out what the correct thing to do here.
    const containerPort = this.spec.template.podSpec.containers[0].port;

    // create a label and attach it to the deployment pods
    const labelKey = 'cdk8s.deployment'
    const labelValue = Node.of(this).uniqueId

    // TODO: what are the implications of using 'this' as the scope? should we accept as argument?
    const service = new Service(this, 'Service', {
      spec: new ServiceSpec({
        port: {
          port: options.port,
          targetPort: containerPort,
        },
      }),
    })

    service.spec.selectByLabel(labelKey, labelValue);

    return service;
  }

}

export interface DeploymentSpecProps {

  readonly replicas?: number;

  readonly template?: PodTemplateSpec;

}

export class DeploymentSpec {

  private readonly replicas?: number;

  public readonly template: PodTemplateSpec;
  public readonly labels: Record<string, string>;

  constructor(props: DeploymentSpecProps = {}) {
    this.replicas = props.replicas;
    this.template = props.template ?? new PodTemplateSpec();
    this.labels = {};
  }

  public selectByLabel(key: string, value: string) {
    this.labels[key] = value;
  }

  /**
   * @internal
   */
  public _toKube(node: Node): k8s.DeploymentSpec {

    // automatically select pods in this deployment

    const selector = 'cdk8s.deployment';
    const matcher = node.uniqueId;

    this.template.metadata.addLabel(selector, matcher);

    this.selectByLabel(selector, matcher);

    return {
      replicas: this.replicas,
      template: this.template._toKube(),
      selector: {
        matchLabels: this.labels,
      },
    };
  }
}
