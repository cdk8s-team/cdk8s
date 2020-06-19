import { Resource, ResourceProps } from '../src/base';
import { Construct } from 'constructs';
import { Testing, ApiObject } from 'cdk8s';
import { ConfigMap } from '../src/imports/k8s';

test('Can mutate metadata', () => {

  interface CustomProps extends ResourceProps {

  }

  class Custom extends Resource {

    public readonly apiObject: ApiObject;

    constructor(scope: Construct, id: string, props: CustomProps) {
      super(scope, id, props);

      this.apiObject = new ConfigMap(this, 'ConfigMap', {
        metadata: this.metadata._toKube(),
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
      annotations: {},
      name: 'test-custom-configmap-4cfa97cc',
    },
  }]);

});