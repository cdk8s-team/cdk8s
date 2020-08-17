import * as kplus from '../src';
import * as cdk from '@aws-cdk/core';
import * as eks from '@aws-cdk/aws-eks';
import { Testing } from 'cdk8s';
import '@aws-cdk/assert/jest';
import { Lazy } from 'constructs-tokens-staging';

test('ignores aws-cdk tokens during synth', () => {

  const awsApp = new cdk.App();
  const awsStack = new cdk.Stack(awsApp, 'AwsStack');

  const eksCluster = new eks.Cluster(awsStack, 'KubernetesCluster', {
    version: eks.KubernetesVersion.V1_17,
  })

  const kubeChart = Testing.chart();
  const configMap = new kplus.ConfigMap(kubeChart, 'ConfigMap');
  configMap.addData('clusterArn', eksCluster.clusterArn)
  configMap.addData('tokenAsString', Lazy.stringValue({ produce: () => 'hello' }))

  const manifest = kubeChart.toJson();
  console.log(JSON.stringify(manifest));

  eksCluster.addManifest('Configuration', manifest);

  expect(awsStack).toHaveResource('Custom::AWSCDK-EKS-KubernetesResource', {
    Manifest: {
      'Fn::Join': [
        '',
        [
          '[[{"apiVersion":"v1","data":{"clusterArn":"',
          {
            'Fn::GetAtt': [
              'KubernetesCluster7A22671B',
              'Arn',
            ],
          },
          '"},"kind":"ConfigMap","metadata":{"name":"test-configmap-d0275d6b"}}]]',
        ],
      ],
    },
  });

});