import { Construct, Node } from 'constructs';
import { Names } from 'cdk8s';
import { KubeDeployment, KubeService, IntOrString } from './imports/k8s';

export interface WebServiceOptions {
  /** The Docker image to use for this service. */
  readonly image: string; // docker image to use for this service

  /**
   * Number of replicas.
   * @default 1
   */
  readonly replicas?: number;

  /**
   * External port.
   * @default 80
   */
  readonly port?: number;

  /**
   * Internal port.
   * @default 8080
   */
  readonly containerPort?: number;
}

export class WebService extends Construct {
  constructor(scope: Construct, ns: string, options: WebServiceOptions) {
    super(scope, ns);

    const port = options.port || 80;
    const containerPort = options.containerPort || 8080;
    const label = { app: Names.toLabelValue(Node.of(this).path) };
    const replicas = options.replicas ?? 1;

    new KubeService(this, 'service', {
      spec: {
        type: 'LoadBalancer',
        ports: [ { port, targetPort: IntOrString.fromNumber(containerPort) } ],
        selector: label
      }
    });

    new KubeDeployment(this, 'deployment', {
      spec: {
        replicas,
        selector: {
          matchLabels: label
        },
        template: {
          metadata: { labels: label },
          spec: {
            containers: [
              {
                name: 'web',
                image: options.image,
                ports: [ { containerPort } ]
              }
            ]
          }
        }
      }
    });
  }
}
