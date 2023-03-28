import { Construct } from 'constructs';

import * as k8s from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';

import * as awscdk from 'aws-cdk-lib';

import * as cdktf from 'cdktf';
import * as awstf from "@cdktf/provider-aws";

export class AWSCDKStack extends awscdk.Stack {

  public readonly bucketName: string;
  public readonly roleName: string;
  public readonly queueName: string;
  public readonly topicName: string;

  constructor(scope: Construct, name: string) {
    super(scope as any, name);

    this.bucketName = new awscdk.aws_s3.Bucket(this, 'Bucket', { removalPolicy: awscdk.RemovalPolicy.DESTROY }).bucketName;
    this.roleName = new awscdk.aws_iam.Role(this, 'Role', { assumedBy: new awscdk.aws_iam.AnyPrincipal() }).roleName;
    this.queueName = new awscdk.aws_sqs.Queue(this, 'Queue').queueName;
    this.topicName = new awscdk.aws_sns.Topic(this, 'Topic').topicName;
  }
}

export class CDKTFStack extends cdktf.TerraformStack {

  public readonly bucketName: string;
  public readonly roleName: string;
  public readonly queueName: string;
  public readonly topicName: string;

  constructor(scope: Construct, id: string) {
    super(scope as any, id);

    const provider = new awstf.provider.AwsProvider(this as any, "AWS", {
      region: "us-east-1",
    });

    this.bucketName = new awstf.s3Bucket.S3Bucket(this as any, 'Bucket').bucket;
    this.roleName = new awstf.iamRole.IamRole(this as any, 'Role', { assumeRolePolicy: JSON.stringify({
      Version: "2012-10-17",
      Statement: [
        {
          Action: "sts:AssumeRole",
          Principal: {
            Service: 'ec2.amazonaws.com',
          },
          Effect: "Allow",
        },
      ],
    })}).name;
    this.queueName = new awstf.sqsQueue.SqsQueue(this as any, 'Queue').name;
    this.topicName = new awstf.snsTopic.SnsTopic(this as any, 'Topic').name;

    new cdktf.S3Backend(this, {
      bucket: 'epolon-us-east-1-terraform',
      key: 'tf.state',
      region: provider.region,
    });
  }
}

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

const cdkApp = new awscdk.App({ outdir: 'cdk.out' });
const cdktfApp = new cdktf.App({ outdir: 'cdktf.out' });
const cdkStack = new AWSCDKStack(cdkApp as any, 'aws');
const cdktfStack = new CDKTFStack(cdktfApp as any, 'aws');
const cdk8sApp = new k8s.App({ awscdkStack: cdkStack, cdktfStack: cdktfStack });

new MyChart(cdk8sApp as any, 'k8s-with-awscdk', { 
  bucketName: cdkStack.bucketName,
  queueName: cdkStack.queueName,
  roleName: cdkStack.roleName,
  topicName: cdkStack.topicName,
});

new MyChart(cdk8sApp as any, 'k8s-with-cdktf', { 
  bucketName: cdktfStack.bucketName,
  queueName: cdktfStack.queueName,
  roleName: cdktfStack.roleName,
  topicName: cdktfStack.topicName,
});

cdkApp.synth();
cdktfApp.synth();
cdk8sApp.synth();