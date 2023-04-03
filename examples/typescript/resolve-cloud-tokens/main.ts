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

  // a resources that isn't supported by cloud control?
  // see https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/supported-resources.html
  public readonly topic: awscdk.aws_sns.Topic;

  // a resource who's Ref attribute returns the Arn
  public readonly batchSchedulingPolicy: awscdk.aws_batch.CfnSchedulingPolicy;

  // resources that have a composite primary identifier and `Ref`
  // doesn't corresponds to it.
  public readonly stage: awscdk.aws_apigateway.Stage;

  constructor(scope: Construct, name: string) {
    super(scope, name);

    this.bucket = new awscdk.aws_s3.Bucket(this, 'Bucket', { removalPolicy: awscdk.RemovalPolicy.DESTROY });
    this.role = new awscdk.aws_iam.Role(this, 'Role', { assumedBy: new awscdk.aws_iam.ServicePrincipal('ec2.amazonaws.com') });
    this.queue = new awscdk.aws_sqs.Queue(this, 'Queue');
    this.topic = new awscdk.aws_sns.Topic(this, 'Topic');
    this.batchSchedulingPolicy = new awscdk.aws_batch.CfnSchedulingPolicy(this, 'BatchSchedulingPolicy');

    new awscdk.CfnOutput(this, 'BucketName', {
      value: this.bucket.bucketName,
    });

    const api = new awscdk.aws_apigateway.RestApi(this, 'Api');
    api.root.addMethod('GET', new awscdk.aws_apigateway.MockIntegration());
    this.stage = api.deploymentStage;

  }
}

export class CDKTFStack extends cdktf.TerraformStack {

  public readonly bucket: awstf.s3Bucket.S3Bucket;
  public readonly role: awstf.iamRole.IamRole;
  public readonly queue: awstf.sqsQueue.SqsQueue;
  public readonly topic: awstf.snsTopic.SnsTopic;
  public readonly batchSchedulingPolicy: awstf.batchSchedulingPolicy.BatchSchedulingPolicy;

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
    this.batchSchedulingPolicy = new awstf.batchSchedulingPolicy.BatchSchedulingPolicy(this, 'BatchSchedulingPolicy', {
      name: 'why-is-this-required'
    });

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
  batchSchedulingPolicyArn: awscdkStack.batchSchedulingPolicy.ref,
  stageName: awscdkStack.stage.stageName,
  externalTokenResolver: awscdkResolver,
});

new MyChart(cdk8sApp, 'k8s-with-cdktf', {
  bucketName: cdktfStack.bucket.bucket,
  queueName: cdktfStack.queue.name,
  roleName: cdktfStack.role.name,
  topicName: cdktfStack.topic.name,
  batchSchedulingPolicyArn: cdktfStack.batchSchedulingPolicy.arn,
  externalTokenResolver: cdktfResolver,
});

awscdkApp.synth();
cdktfApp.synth();
cdk8sApp.synth();