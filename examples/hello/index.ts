import { App, Construct } from '@aws-cdk/core';
import { Chart, ServiceObject, DeploymentObject } from '@awslabs/cdk8s';

export class HelloKube extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    const label = { app: 'hello-k8s' };

    new ServiceObject(this, 'service', {
      spec: {
        type: 'LoadBalancer',
        ports: [ { port: 80, targetPort: 8080 } ],
        selector: label
      }
    });

    new DeploymentObject(this, 'deployment', {
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
