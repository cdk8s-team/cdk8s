import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';
import { AlbIngressController } from 'cdk8s-aws-alb-ingress-controller';

export class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    new AlbIngressController(this, 'albingresscntroller', {
      clusterName: 'EKScluster',
    });

  }
}

const app = new App();
new MyChart(app, 'aws-alb-ingress-controller');
app.synth();
