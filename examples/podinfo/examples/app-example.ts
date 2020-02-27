import { Construct } from "@aws-cdk/core";
import { App, Chart } from "@awslabs/cdk8s";
import { Deployment, Service } from "../lib";
import { PodinfoContainer } from "./podinfo";

class MyChart extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    const podinfo = new PodinfoContainer({
      message: 'this is my podinfo message!',
      faultError: true
    });

    const deployment = new Deployment(this, 'Deployment', {
      containers: [ podinfo ],
      autoScalingOptions: {
        minReplicas: 2,
        maxReplicas: 100,
        cpu: 80
      }
    });

    new Service(this, 'Service', {
      selector: deployment,
      ingress: true 
    });
  }
}

const app = new App();
new MyChart(app, 'podinfo');
app.synth();