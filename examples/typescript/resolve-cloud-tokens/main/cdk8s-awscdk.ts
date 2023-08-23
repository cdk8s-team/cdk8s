import * as k8s from 'cdk8s';

import { AwsCdkResolver } from '../resolvers/aws-cdk-resolver';
import { MyChart } from '../constructs/cdk8s-chart';
import { awscdkStack } from '../apps/awscdk-app';

const awscdkResolver = new AwsCdkResolver();

const cdk8sApp = new k8s.App({ resolver: awscdkResolver });

new MyChart(cdk8sApp, 'cdk8s-with-awscdk', {
  queueName: awscdkStack.queueName,
});


cdk8sApp.synth();