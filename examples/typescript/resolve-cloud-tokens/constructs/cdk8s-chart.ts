import { Construct } from 'constructs';

import * as k8s from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';

export interface MyChartProps extends k8s.ChartProps {

  readonly bucketName: string;
  readonly roleName: string;
  readonly queueName: string;
  readonly topicName: string;
  readonly batchSchedulingPolicyArn: string;
  readonly stageName?: string;

}

export class MyChart extends k8s.Chart {

  constructor(scope: Construct, id: string, props: MyChartProps) {
    super(scope, id, props);

    const deployment = new kplus.Deployment(this, 'Deployment');

    const container = deployment.addContainer({ image: 'image' });
    container.env.addVariable('BUCKET_NAME', kplus.EnvValue.fromValue(props.bucketName));
    container.env.addVariable('ROLE_NAME', kplus.EnvValue.fromValue(props.roleName));
    container.env.addVariable('QUEUE_NAME', kplus.EnvValue.fromValue(props.queueName));
    container.env.addVariable('TOPIC_NAME', kplus.EnvValue.fromValue(props.topicName));
    container.env.addVariable('BATCH_SCHEDULING_POLICY_ARN', kplus.EnvValue.fromValue(props.batchSchedulingPolicyArn));
    container.env.addVariable('STAGE_NAME', kplus.EnvValue.fromValue(props.stageName ?? 'N/A'));

    new kplus.k8s.KubeService(this, 'Job', {
      spec: {
        type: 'LoadBalancer',
      }
    });
  }
}
