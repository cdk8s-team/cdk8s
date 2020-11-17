import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';

import { KubeDeployment, KubeService, IntOrString  } from './imports/k8s';

export class HelloKube extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    const label = { app: 'hello-k8s' };

    new KubeService(this, 'service', {
      spec: {
        type: 'LoadBalancer',
        ports: [ { port: 80, targetPort: IntOrString.fromNumber(8080) } ],
        selector: label
      }
    });

    new KubeDeployment(this, 'deployment', {
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
                image: 'paulbouwer/hello-kubernetes:1.7',
                ports: [ { containerPort: 8080 } ]
              }
            ]
          }
        }
      }
    });
  }
}

const app = new App();
new HelloKube(app, 'hello-k8s');
app.synth();