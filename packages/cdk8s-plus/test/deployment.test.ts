import * as kplus from '../src';
import { Testing } from 'cdk8s';

test('A label selector is automatically allocated', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment');
  deployment.addContainer(new kplus.Container({ image: 'foobar' }));

  const expectedValue = 'test-Deployment-9e0110cd'
  const expectedSelector = { 'cdk8s.deployment': expectedValue };

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.selector.matchLabels).toEqual(expectedSelector);
  expect(spec.template.metadata?.labels).toEqual(expectedSelector);

  // assert the deployment object has it.
  expect(deployment.labelSelector).toEqual(expectedSelector);
  expect(deployment.podMetadata.getLabel('cdk8s.deployment')).toEqual(expectedValue);

});

test('No selector is generated if "defaultSelector" is false', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment', {
    defaultSelector: false,
    podSpec: {
      containers: [ new kplus.Container({ image: 'foobar' }) ],
    },
  });

  // assert the k8s spec doesnt have it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.selector.matchLabels).toEqual({});
  expect(spec.template.metadata?.labels).toEqual(undefined);

  // assert the deployment object doesnt have it.
  expect(deployment.labelSelector).toEqual({});
  expect(deployment.podMetadata.getLabel('cdk8s.deployment')).toEqual(undefined);

});

test('Can select by label', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment', {
    podSpec: {
      containers: [
        new kplus.Container({
          image: 'image',
        }),
      ],
    },
    defaultSelector: false,
  });

  const expectedSelector = { foo: 'bar' };

  deployment.selectByLabel('foo', expectedSelector['foo']);

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.selector.matchLabels).toEqual(expectedSelector);

  // assert the deployment object has it.
  expect(deployment.labelSelector).toEqual(expectedSelector);

});

test('Can be exposed as via service', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment', {
    podSpec: {
      containers: [
        new kplus.Container({
          image: 'image',
          port: 9300,
        }),
      ],
    },
  });

  deployment.expose(9200, { serviceType: kplus.ServiceType.LOAD_BALANCER});

  const spec = Testing.synth(chart)[1].spec;
  expect(spec.type).toEqual('LoadBalancer');
  expect(spec.selector).toEqual({'cdk8s.deployment': 'test-Deployment-9e0110cd'});
  expect(spec.ports![0].port).toEqual(9200);
  expect(spec.ports![0].targetPort).toEqual(9300);

});

test('Expose uses the correct default values', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment', {
    podSpec: {
      containers: [
        new kplus.Container({
          image: 'image',
          port: 9300,
        }),
      ],
    },
  });

  deployment.expose(9200);

  const spec = Testing.synth(chart)[1].spec;
  expect(spec.type).toEqual('ClusterIP');

});

test('Cannot be exposed if there are no containers in spec', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment');

  expect(() => deployment.expose(9000)).toThrowError(
    'Cannot expose a deployment without containers',
  );
});

test('Synthesizes spec lazily', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment');
  deployment.addContainer(
    new kplus.Container({
      image: 'image',
      port: 9300,
    }),
  );

  const container = Testing.synth(chart)[0].spec.template.spec.containers[0];

  expect(container.image).toEqual('image');
  expect(container.ports[0].containerPort).toEqual(9300);

});
