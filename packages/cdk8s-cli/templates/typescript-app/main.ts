import { Construct } from '@aws-cdk/core';
import { App, Chart } from '@awslabs/cdk8s';

class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    // define constructs here
  }
}

const app = new App();
new MyChart(app, '{{ $base }}');
app.synth();
