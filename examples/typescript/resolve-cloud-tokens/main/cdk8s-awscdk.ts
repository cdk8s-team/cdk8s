import * as k8s from 'cdk8s';

import { AwsCdkOutputResolver } from '../resolvers/aws-cdk-resolver';
import { MyChart } from '../constructs/cdk8s-chart';
import { awscdkStack } from '../apps/awscdk-app';

const awscdkResolver = new AwsCdkOutputResolver();

const cdk8sApp = new k8s.App({ resolver: awscdkResolver });

new MyChart(cdk8sApp, 'cdk8s-with-awscdk', {
  queueName: awscdkStack.queueName,
});


cdk8sApp.synth();