import { App, Construct } from '@aws-cdk/core';
import { Chart } from '@awslabs/cdk8s';

// import k8s objects from ./gen like this:
//import { Pod } from './.gen/pod-v1';

class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    // define k8s objects in this chart like this:
    //new Pod(this, 'pod', { spec: ... })
  }
}

const app = new App({ outdir: 'dist' });
new MyChart(app, '{{ cookiecutter.name }}');
app.synth();