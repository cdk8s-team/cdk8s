import { Construct } from '@aws-cdk/core';
import { KubService, KubDeployment } from '../../lib';

export interface WebServiceOptions {
  /**
   * The Docker image to use for this service.
   */
  readonly image: string;

  /**
   * Number of replicas.
   *
   * @default 1
   */
  readonly replicas?: number;

  /**
   * External port.
   *
   * @default 80
   */
  readonly port?: number;

  /**
   * Internal port.
   *
   * @default 8080
   */
  readonly containerPort?: number;
}

export class WebService extends Construct {
  constructor(scope: Construct, ns: string, options: WebServiceOptions) {
    super(scope, ns);

    const port = options.port || 80;
    const containerPort = options.containerPort || 8080;
    const label = { app: this.node.uniqueId };

    new KubService(this, 'service', {
      type: 'LoadBalancer',
      ports: [ { port, targetPort: containerPort } ],
      selector: label
    });

    new KubDeployment(this, 'deployment', {
      replicas: 1,
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
    });
  }
}