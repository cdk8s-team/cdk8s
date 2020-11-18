import { Testing, ApiObject } from 'cdk8s';
import { Node } from 'constructs';
import * as kplus from '../src';

test('defaultChild', () => {
  const chart = Testing.chart();

  const defaultChild = Node.of(new kplus.Secret(chart, 'Secret')).defaultChild as ApiObject;

  expect(defaultChild.kind).toEqual('Secret');

});

test('Can be imported from secret name', () => {
  const secret = kplus.Secret.fromSecretName('secret');

  expect(secret.name).toEqual('secret');
});

test('Can add data to new secrets', () => {
  const chart = Testing.chart();

  const secret = new kplus.Secret(chart, 'Secret');
  secret.addStringData('key', 'value');

  expect(Testing.synth(chart)).toMatchInlineSnapshot(`
    Array [
      Object {
        "apiVersion": "v1",
        "kind": "Secret",
        "metadata": Object {
          "name": "test-secret-17f996fa",
        },
        "stringData": Object {
          "key": "value",
        },
      },
    ]
  `);
});
