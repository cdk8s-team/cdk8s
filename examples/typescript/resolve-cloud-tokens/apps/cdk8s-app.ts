import * as k8s from 'cdk8s';
import * as awscdk from 'aws-cdk-lib';

import * as cdktf from 'cdktf';
import { AWSCDKStack } from '../constructs/awscdk-stack';
import { CDKTFStack } from '../constructs/cdktf-stack';
import { AwsCdkTokenResolver } from '../resolvers/aws-cdk-resolver';
import { CdkTfTokenResolver } from '../resolvers/cdktf-resolver';
import { MyChart } from '../constructs/cdk8s-chart';

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

cdk8sApp.synth();