import { App, Construct } from '@aws-cdk/core';
import { Chart } from '@awslabs/cdk8s';

class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    // define constructs here
  }
}

const app = new App({ outdir: 'dist' });
new MyChart(app, '{{ $base }}');
app.synth();
