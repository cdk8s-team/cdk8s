import * as k8s from 'cdk8s';

import { MyChart } from '../constructs/cdk8s-chart';
import { cdktfStack } from '../apps/cdktf-app';
import { CdkTfResolver } from '../resolvers/cdktf-resolver';

const cdktfResolver = new CdkTfResolver(cdktfStack);

const cdk8sApp = new k8s.App({ resolver: cdktfResolver });

new MyChart(cdk8sApp, 'cdk8s-with-cdktf', {
  queueName: cdktfStack.queue.name,
});

cdk8sApp.synth();