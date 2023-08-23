import { Construct } from 'constructs';

import * as k8s from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';

export interface MyChartProps extends k8s.ChartProps {
  readonly queueName: string;
}

export class MyChart extends k8s.Chart {

  constructor(scope: Construct, id: string, props: MyChartProps) {
    super(scope, id, props);

    const deployment = new kplus.Deployment(this, 'Deployment');

    const container = deployment.addContainer({ image: 'image' });
    container.env.addVariable('QUEUE_NAME', kplus.EnvValue.fromValue(props.queueName));

    new kplus.k8s.KubeService(this, 'Job', {
      spec: {
        type: 'LoadBalancer',
      }
    });
  }
}
