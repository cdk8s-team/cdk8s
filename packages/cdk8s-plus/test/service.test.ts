import * as kplus from '../src';
import { Testing } from 'cdk8s';

test('Must be configured with at least one port', () => {

  const chart = Testing.chart();

  new kplus.Service(chart, 'service');

  expect(() => Testing.synth(chart)).toThrowError(
    'A service must be configured with a port',
  );

});

test('Can select by label', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'service', {
    ports: [{ port: 9000 }],
  });

  service.addSelector('key', 'value');

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.selector).toEqual({ key: 'value' });

  // assert the service object has it.
  expect(service.selector).toEqual({ key: 'value' });

});

test('Can serve by port', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'service');

  service.serve(9000, { targetPort: 80, nodePort: 30080 });

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.ports).toEqual([ { port: 9000, targetPort: 80, nodePort: 30080 } ]);

  // assert the service object has it.
  expect(service.ports).toEqual([ { port: 9000, targetPort: 80, nodePort: 30080 } ]);

});

test('Cannot add a deployment if the deployment does not have any containers', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'service');
  const deployment = new kplus.Deployment(chart, 'dep');

  // THEN
  expect(() => service.addDeployment(deployment, 1122))
    .toThrow(/Cannot expose a deployment without containers/);

});

test('Synthesizes spec lazily', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'Service');

  service.addSelector('key', 'value');
  service.serve(9000);

  const spec = Testing.synth(chart)[0].spec;
  expect(spec.selector).toEqual({key: 'value'});
  expect(spec.ports).toEqual([{ port: 9000 }]);

});

test('Can associate a deployment with an existing service', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'service');
  const deployment = new kplus.Deployment(chart, 'dep');
  deployment.podSpec.addContainer(new kplus.Container({ image: 'foo', port: 7777 }));

  service.addDeployment(deployment, 1122);

  const expectedSelector = {'cdk8s.deployment': 'test-dep-b18049c6'};

  const deploymentSpec = Testing.synth(chart)[1].spec;
  const serviceSpec = Testing.synth(chart)[0].spec;
  expect(deploymentSpec.selector.matchLabels).toEqual(expectedSelector);
  expect(deploymentSpec.template.metadata?.labels).toEqual(expectedSelector);
  expect(serviceSpec.selector).toEqual(expectedSelector);

});

test('Cannot add a deployment if it does not have a label selector', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'service');
  const deployment = new kplus.Deployment(chart, 'dep', {
    defaultSelector: false,
    podSpec: {
      containers: [ new kplus.Container({ image: 'foo' }) ],
    },
  });

  expect(() => service.addDeployment(deployment, 1122))
    .toThrow(/deployment does not have a label selector/);

});

test('Cannot add a deployment if a selector is already defined for this service', () => {

  const chart = Testing.chart();
  const service = new kplus.Service(chart, 'service');

  const deployment = new kplus.Deployment(chart, 'dep1', {
    podSpec: {
      containers: [ new kplus.Container({ image: 'foo' }) ],
    },
  });
  service.addSelector('random', 'selector');

  // THEN
  expect(() => service.addDeployment(deployment, 1010))
    .toThrow(/a selector is already defined for this service. cannot add a deployment/);

});
