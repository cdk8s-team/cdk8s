import * as kplus from '../src';
import * as k8s from '../src/imports/k8s';
import * as cdk from '@aws-cdk/core';
import * as eks from '@aws-cdk/aws-eks';
import * as cdk8s from 'cdk8s';
import '@aws-cdk/assert/jest';

test('ignores aws-cdk tokens during synth', () => {

  const awsApp = new cdk.App();
  const awsStack = new cdk.Stack(awsApp, 'AwsStack');

  const eksCluster = new eks.Cluster(awsStack, 'KubernetesCluster', {
    version: eks.KubernetesVersion.V1_17,
  })

  const kubeApp = new cdk8s.App();
  const kubeChart = new cdk8s.Chart(kubeApp, 'Chart');

  new k8s.ConfigMap(kubeChart, 'ConfigMap', {
    data: {
      brokerUrl: kafka.brokerUrl,
    },
  })

  eksCluster.addManifest('config', kubeChart.toJson());

  eksCluster.addManifest('kafka-config', {
    kind: 'ConfigMap',
    apiVersion: 'v1',
    metadata: {
      name: 'kafka-config',
    },
    data: {
      brokerUrl: query.getResponseField('BootstrapBrokerStringTls'),
    },
  })
  const configMap = new kplus.ConfigMap(kubeChart, 'ConfigMap');
  configMap.addData('clusterArn', eksCluster.clusterArn)

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