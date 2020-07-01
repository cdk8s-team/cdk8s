import * as kplus from '../src';
import { Testing } from 'cdk8s';

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
          "name": "test-secret-081177f7",
        },
        "stringData": Object {
          "key": "value",
        },
      },
    ]
  `);
});
