import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';

import { Pod } from './imports/k8s';

class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    // define resources here

    new Pod(this, 'pod', {
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
