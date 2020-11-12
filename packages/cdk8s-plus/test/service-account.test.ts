import { Testing } from 'cdk8s';
import { Secret, ServiceAccount } from '../src';

test('minimal definition', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  new ServiceAccount(chart, 'my-service-account');

  // THEN
  expect(Testing.synth(chart)).toMatchInlineSnapshot(`
    Array [
      Object {
        "apiVersion": "v1",
        "kind": "ServiceAccount",
        "metadata": Object {
          "name": "test-my-service-account-resource-a5be5a3b",
        },
      },
    ]
  `);
});

test('secrets can be added to the service account', () => {
  // GIVEN
  const chart = Testing.chart();
  const secret1 = Secret.fromSecretName('my-secret-1');
  const secret2 = Secret.fromSecretName('my-secret-2');

  // WHEN
  const sa = new ServiceAccount(chart, 'my-service-account', {
    secrets: [secret1],
  });

  sa.addSecret(secret2);

  // THEN
  const manifest = Testing.synth(chart);
  expect(manifest[0]?.secrets[0]).toStrictEqual({ name: 'my-secret-1' });
  expect(manifest[0]?.secrets[1]).toStrictEqual({ name: 'my-secret-2' });
});
