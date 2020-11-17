import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';

import { KubePod } from './imports/k8s';

export class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    // define resources here

    new KubePod(this, 'pod', {
      spec: {
        containers: [
          {
            name: 'hello-kubernetes',
            image: 'paulbouwer/hello-kubernetes:1.7',
            ports: [ { containerPort: 8080 } ]
          }
        ]
      }
    });
  }
}

const app = new App();
new MyChart(app, 'test');
app.synth();
