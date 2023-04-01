import { Construct } from 'constructs';

import * as k8s from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';

import * as awscdk from 'aws-cdk-lib';

import * as cdktf from 'cdktf';
import * as awstf from "@cdktf/provider-aws";
import { AwsCdkTokenResolver } from './aws-cdk-resolver';
import { CdkTfTokenResolver } from './cdktf-resolver';

export class AWSCDKStack extends awscdk.Stack {

  public readonly bucket: awscdk.aws_s3.Bucket;
  public readonly role: awscdk.aws_iam.Role;
  public readonly queue: awscdk.aws_sqs.Queue;
  public readonly topic: awscdk.aws_sns.Topic;

  constructor(scope: Construct, name: string) {
    super(scope, name);

    this.bucket = new awscdk.aws_s3.Bucket(this, 'Bucket', { removalPolicy: awscdk.RemovalPolicy.DESTROY });
    this.role = new awscdk.aws_iam.Role(this, 'Role', { assumedBy: new awscdk.aws_iam.ServicePrincipal('ec2.amazonaws.com') });
    this.queue = new awscdk.aws_sqs.Queue(this, 'Queue');
    this.topic = new awscdk.aws_sns.Topic(this, 'Topic');

  }
}

export class CDKTFStack extends cdktf.TerraformStack {

  public readonly bucket: awstf.s3Bucket.S3Bucket;
  public readonly role: awstf.iamRole.IamRole;
  public readonly queue: awstf.sqsQueue.SqsQueue;
  public readonly topic: awstf.snsTopic.SnsTopic;

  constructor(scope: Construct, id: string) {
    super(scope, id);

    const provider = new awstf.provider.AwsProvider(this, "AWS", {
      region: "us-east-1",
    });

    this.bucket = new awstf.s3Bucket.S3Bucket(this, 'Bucket');
    this.role = new awstf.iamRole.IamRole(this, 'Role', {
      assumeRolePolicy: JSON.stringify({
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
      })
    });
    this.queue = new awstf.sqsQueue.SqsQueue(this, 'Queue');
    this.topic = new awstf.snsTopic.SnsTopic(this, 'Topic');

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
    super(scope, id, props);

    const deployment = new kplus.Deployment(this, 'Deployment');

    const container = deployment.addContainer({ image: 'image' });
    container.env.addVariable('BUCKET_NAME', kplus.EnvValue.fromValue(props.bucketName));
    container.env.addVariable('ROLE_NAME', kplus.EnvValue.fromValue(props.roleName));
    container.env.addVariable('QUEUE_NAME', kplus.EnvValue.fromValue(props.queueName));
    container.env.addVariable('TOPIC_NAME', kplus.EnvValue.fromValue(props.topicName));
  }
}

const cdk8sApp = new k8s.App();
const awscdkApp = new awscdk.App({ outdir: 'cdk.out' });
const cdktfApp = new cdktf.App({ outdir: 'cdktf.out' });
const awscdkStack = new AWSCDKStack(awscdkApp, 'aws');
const cdktfStack = new CDKTFStack(cdktfApp, 'aws');

const awscdkResolver = new AwsCdkTokenResolver(awscdkStack);
const cdktfResolver = new CdkTfTokenResolver(cdktfStack);

new MyChart(cdk8sApp, 'k8s-with-awscdk', {
  bucketName: awscdkStack.bucket.bucketName,
  queueName: awscdkStack.queue.queueName,
  roleName: awscdkStack.role.roleName,
  topicName: awscdkStack.topic.topicName,
  externalTokenResolver: awscdkResolver,
});

new MyChart(cdk8sApp, 'k8s-with-cdktf', {
  bucketName: cdktfStack.bucket.bucket,
  queueName: cdktfStack.queue.name,
  roleName: cdktfStack.role.name,
  topicName: cdktfStack.topic.name,
  externalTokenResolver: cdktfResolver,
});

awscdkApp.synth();
cdktfApp.synth();
cdk8sApp.synth();