import { App, Construct } from "@aws-cdk/core";
import { Chart } from "../../../lib";
import { Deployment, Service } from "../lib";
import { PodinfoContainer } from "./podinfo";

class MyChart extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    const dep = new Deployment(this, 'Deployment', {
      autoScaling: false
    });

    new Service(this, 'Service', {
      selector: dep.podSelector,
      ingress: true
    });

    dep.addContainer(new PodinfoContainer({
      message: 'Hello, podinfo!',
    }));

    new Service(this, 'Service', {
      selector: dep.podSelector,
      ingress: true,
    });
  }
}

const app = new App({ outdir: 'cdk.out' });
new MyChart(app, 'podinfo');
app.synth();