import { App, Construct } from '@aws-cdk/core';
import { Stack, KubService, KubDeployment } from '../lib';

export class HelloKube extends Stack {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    const label = { app: 'hello-k8s' };

    new KubService(this, 'service', {
      type: 'LoadBalancer',
      ports: [ { port: 80, targetPort: 8080 } ],
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
              name: 'hello-kubernetes',
              image: 'paulbouwer/hello-kubernetes:1.5',
              ports: [ { containerPort: 8080 } ]
            }
          ]
        }
      }
    });

  }
}

const app = new App({ outdir: 'cdk.out' });
new HelloKube(app, 'hellowwwww');
app.synth();
