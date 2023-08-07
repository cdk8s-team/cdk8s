import { Construct } from 'constructs';

import * as awscdk from 'aws-cdk-lib';

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
