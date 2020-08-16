import * as kplus from '../src';
import * as cdk from '@aws-cdk/core';
import * as eks from '@aws-cdk/aws-eks';
import { Testing } from 'cdk8s';
import '@aws-cdk/assert/jest';

test('ignores aws-cdk tokens during synth', () => {

  const awsApp = new cdk.App();
  const awsStack = new cdk.Stack(awsApp, 'AwsStack');

  const eksCluster = new eks.Cluster(awsStack, 'KubernetesCluster', {
    version: eks.KubernetesVersion.V1_17,
  })

  const kubeChart = Testing.chart();
  new kplus.ConfigMap(kubeChart, 'ConfigMap', {
    data: {
      clusterArn: eksCluster.clusterArn,
    },
  });

  const manifest = kubeChart.toJson();

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