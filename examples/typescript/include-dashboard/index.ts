import { App, Chart, Include } from 'cdk8s';
import { Construct } from 'constructs';

export class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    new Include(this, 'dashboard', {
      url: `${__dirname}/dashboard.yaml`
    });
  }
}

const app = new App();
new MyChart(app, 'my-chart');
app.synth();