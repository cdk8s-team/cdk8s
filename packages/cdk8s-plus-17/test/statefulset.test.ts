import { Testing, ApiObject } from 'cdk8s';
import { Node } from 'constructs';
import * as kplus from '../src';

test('defaultChild', () => {

  const chart = Testing.chart();
  
  const service = new kplus.Service(chart, 'test_service', {ports: [{port: 80}] });
  const defaultChild = Node.of(new kplus.StatefulSet(chart, 'StatefulSet', { service })).defaultChild as ApiObject;

  expect(defaultChild.kind).toEqual('StatefulSet');

});

test('A label selector is automatically allocated', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'test_service', {ports: [{port: 80}] });

  const statefulset = new kplus.StatefulSet(chart, 'StatefulSet', { service });
  statefulset.addContainer({ image: 'foobar' });

  const expectedValue = 'test-StatefulSet-c809b559';
  const expectedSelector = { 'cdk8s.statefulset': expectedValue };

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[1].spec;
  expect(spec.selector.matchLabels).toEqual(expectedSelector);
  expect(spec.template.metadata?.labels).toEqual(expectedSelector);

  // assert the statefulset object has it.
  expect(statefulset.labelSelector).toEqual(expectedSelector);

});

test('No selector is generated if "defaultSelector" is false', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'test_service', {ports: [{port: 80}] });
  const statefulset = new kplus.StatefulSet(chart, 'StatefulSet', {
    defaultSelector: false,
    containers: [{ image: 'foobar' }],
    service: service,
  });

  // assert the k8s spec doesnt have it.
  const spec = Testing.synth(chart)[1].spec;
  expect(spec.selector.matchLabels).toEqual({});
  expect(spec.template.metadata?.labels).toEqual(undefined);

  // assert the statefulset object doesnt have it.
  expect(statefulset.labelSelector).toEqual({});

});

test('Can select by label', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'test_service', {ports: [{port: 80}] });
  const statefulset = new kplus.StatefulSet(chart, 'StatefulSet', {
    containers: [
      {
        image: 'image',
      },
    ],
    defaultSelector: false,
    service,
  });

  const expectedSelector = { foo: 'bar' };

  statefulset.selectByLabel('foo', expectedSelector.foo);

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[1].spec;
  expect(spec.selector.matchLabels).toEqual(expectedSelector);

  // assert the statefulset object has it.
  expect(statefulset.labelSelector).toEqual(expectedSelector);

});

test('StatefulSet gets defaults', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'test_service', {ports: [{port: 80}] });
  new kplus.StatefulSet(chart, 'StatefulSet', {
    containers: [{ image: 'image' }],
    service,
  });

  const resources = Testing.synth(chart);
  const srv_spec = resources[0].spec;
  const set_spec = resources[1].spec;
  expect(set_spec.replicas).toEqual(1);
  expect(set_spec.serviceName).toEqual(resources[0].metadata.name);
  expect(set_spec.podManagementPolicy).toEqual(kplus.PodManagementPolicy.ORDERED_READY);

  expect(srv_spec.type).toEqual(kplus.ServiceType.CLUSTER_IP);
  expect(srv_spec.clusterIP).toBeUndefined();
  expect(srv_spec.ports![0].port).toEqual(80);
});


test('StatefulSet allows overrides', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'test_service', {
    metadata: {name: 'test-srv'},
    type: kplus.ServiceType.NODE_PORT,
    ports: [{port: 9000, targetPort: 9900}] 
  });
  new kplus.StatefulSet(chart, 'StatefulSet', {
    containers: [{ image: 'image' }],
    replicas: 5,
    podManagementPolicy: kplus.PodManagementPolicy.PARALLEL,    
    service
  });

  const resources = Testing.synth(chart);
  const srv_spec = resources[0].spec;
  const set_spec = resources[1].spec;
  expect(set_spec.replicas).toEqual(5);
  expect(set_spec.serviceName).toEqual('test-srv');
  expect(set_spec.podManagementPolicy).toEqual(kplus.PodManagementPolicy.PARALLEL);

  expect(srv_spec.type).toEqual(kplus.ServiceType.NODE_PORT);
  expect(srv_spec.ports![0].port).toEqual(9000);
});


test('Synthesizes spec lazily', () => {

  const chart = Testing.chart();

  const service = new kplus.Service(chart, 'test_service', {ports: [{port: 9300}]});
  const statefulset = new kplus.StatefulSet(chart, 'StatefulSet', { service });
  statefulset.addContainer(
    {
      image: 'image',
      port: 9300,
    },
  );

  const container = Testing.synth(chart)[1].spec.template.spec.containers[0];

  expect(container.image).toEqual('image');
  expect(container.ports[0].containerPort).toEqual(9300);

});
