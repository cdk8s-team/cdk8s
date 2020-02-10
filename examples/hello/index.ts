import { App, Construct } from '@aws-cdk/core';
import { Chart } from '../../lib';
import { Deployment } from '../../.gen/apps-deployment-v1'
import { Service, IntOrString } from '../../.gen/service-v1';

export class HelloKube extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    const label = { app: 'hello-k8s' };

    new Service(this, 'service', {
      spec: {
        type: 'LoadBalancer',
        ports: [ { port: 80, targetPort: IntOrString.fromNumber(8080) } ],
        selector: label
      }
    });

    new Deployment(this, 'deployment', {
      spec: {
        replicas: 1,
        selector: {
          matchLabels: label
        },
        template: {
          metadata: { labels: label },
          spec: {
            containers: [
              {
                name: 'hello-kubernetes',
                image: 'paulbouwer/hello-kubernetes:1.5',
                ports: [ { containerPort: 8080 } ]
              }
            ]
          }
        }
      }
    });
  }
}

const app = new App({ outdir: 'cdk.out' });
new HelloKube(app, 'hello-example');
app.synth();
