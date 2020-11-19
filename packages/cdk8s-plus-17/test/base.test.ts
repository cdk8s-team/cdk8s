import { Testing, ApiObject } from 'cdk8s';
import { Construct } from 'constructs';
import { Resource, ResourceProps } from '../src/base';
import { KubeConfigMap } from '../src/imports/k8s';

test('Can mutate metadata', () => {

  interface CustomProps extends ResourceProps {

  }

  class Custom extends Resource {

    public readonly apiObject: ApiObject;

    constructor(scope: Construct, id: string, props: CustomProps) {
      super(scope, id, props);

      this.apiObject = new KubeConfigMap(this, 'ConfigMap', {
        metadata: props.metadata,
      });
    }
  }

  const chart = Testing.chart();

  const custom = new Custom(chart, 'Custom', {});

  custom.metadata.addLabel('key', 'value');

  expect(Testing.synth(chart)).toStrictEqual([{
    apiVersion: 'v1',
    kind: 'ConfigMap',
    metadata: {
      labels: {
        key: 'value',
      },
      name: 'test-custom-configmap-c8a1da6c',
    },
  }]);

});