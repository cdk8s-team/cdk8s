import { Testing, ApiObject } from 'cdk8s';
import { Node } from 'constructs';
import * as kplus from '../src';

test('defaultChild', () => {
  const chart = Testing.chart();

  const defaultChild = Node.of(
    new kplus.ServiceAccount(chart, 'ServiceAccount'),
  ).defaultChild as ApiObject;

  expect(defaultChild.kind).toEqual('ServiceAccount');
});

test('minimal definition', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  new kplus.ServiceAccount(chart, 'my-service-account');

  // THEN
  expect(Testing.synth(chart)).toMatchInlineSnapshot(`
    Array [
      Object {
        "apiVersion": "v1",
        "kind": "ServiceAccount",
        "metadata": Object {
          "name": "test-my-service-account-c84bb46b",
        },
      },
    ]
  `);
});

test('secrets can be added to the service account', () => {
  // GIVEN
  const chart = Testing.chart();
  const secret1 = kplus.Secret.fromSecretName('my-secret-1');
  const secret2 = kplus.Secret.fromSecretName('my-secret-2');

  // WHEN
  const sa = new kplus.ServiceAccount(chart, 'my-service-account', {
    secrets: [secret1],
  });

  sa.addSecret(secret2);

  // THEN
  const manifest = Testing.synth(chart);
  expect(manifest[0]?.secrets[0]).toStrictEqual({ name: 'my-secret-1' });
  expect(manifest[0]?.secrets[1]).toStrictEqual({ name: 'my-secret-2' });
});
