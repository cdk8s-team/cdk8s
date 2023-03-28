import * as k8s from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';
import { cdkStack, cdktfStack } from './aws';
import { Construct } from 'constructs';

export interface MyChartProps extends k8s.ChartProps {

  readonly bucketName: string;
  readonly roleName: string;
  readonly queueName: string;
  readonly topicName: string;

}

export class MyChart extends k8s.Chart {

  constructor(scope: Construct, id: string, props: MyChartProps) {
    super(scope as any, id, props);

    const deployment = new kplus.Deployment(this as any, 'Deployment');

    const container = deployment.addContainer({ image: 'image' });
    container.env.addVariable('BUCKET_NAME', kplus.EnvValue.fromValue(props.bucketName));
    container.env.addVariable('ROLE_NAME', kplus.EnvValue.fromValue(props.roleName));
    container.env.addVariable('QUEUE_NAME', kplus.EnvValue.fromValue(props.queueName));
    container.env.addVariable('TOPIC_NAME', kplus.EnvValue.fromValue(props.topicName));

  } 

}

const app = new k8s.App({ awscdkStack: cdkStack, cdktfStack: cdktfStack });

new MyChart(app as any, 'k8s-with-awscdk', { 
  bucketName: cdkStack.bucketName,
  queueName: cdkStack.queueName,
  roleName: cdkStack.roleName,
  topicName: cdkStack.topicName,
});

new MyChart(app as any, 'k8s-with-cdktf', { 
  bucketName: cdktfStack.bucketName,
  queueName: cdktfStack.queueName,
  roleName: cdktfStack.roleName,
  topicName: cdktfStack.topicName,
});

app.synth();