import { Construct } from 'constructs';
import { App, Chart, Helm } from 'cdk8s';

export class HelloHelm extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);
    
    new Helm(this, 'redis', {
      chart: 'bitnami/redis',
      values: {
        sentinel: {
          enabled: true
        }
      }
    });
  }
}

const app = new App();
new HelloHelm(app, 'hello-helm');
app.synth();