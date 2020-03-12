import { ApiObject, Chart, Testing } from '../lib';
import { Construct } from '@aws-cdk/core';

test('minimal configuration', () => {
  const app = Testing.app();
  const stack = new Chart(app, 'test');

  new ApiObject(stack, 'my-resource', {
    apiVersion: 'v1',
    kind: 'MyResource'
  });

  expect(Testing.synth(stack)).toMatchSnapshot();
});

test('synthesized resource name is based on path', () => {
  // GIVEN
  const app = Testing.app();
  const stack = new Chart(app, 'test');
  new ApiObject(stack, 'my-resource', {
    apiVersion: 'v1',
    kind: 'MyResource'
  });

  // WHEN
  // now create another resource with the same namespace but within a sub-scope
  const scope = new Construct(stack, 'scope');
  new ApiObject(scope, 'my-resource', {
    apiVersion: 'v1',
    kind: 'MyResource'
  });

  // THEN
  expect(Testing.synth(stack)).toMatchSnapshot();
});

test('if name is explicitly specified it will be respected', () => {
  // GIVEN
  const app = Testing.app();
  const stack = new Chart(app, 'test');

  // WHEN
  new ApiObject(stack, 'my-resource', {
    kind: 'MyResource',
    apiVersion: 'v1',
    metadata: {
      name: 'boom'
    }
  });

  // THEN
  expect(Testing.synth(stack)).toMatchSnapshot();
});

test('"spec" is synthesized as-is', () => {
  // GIVEN
  const app = Testing.app();
  const stack = new Chart(app, 'test');

  // WHEN
  new ApiObject(stack, 'resource', {
    kind: 'ResourceType',
    apiVersion: 'v1',
    spec: {
      prop1: 'hello',
      prop2: {
        world: 123
      }
    }
  });

  // THEN
  expect(Testing.synth(stack)).toMatchSnapshot();
});

test('"data" can be used to specify resource data', () => {
  // GIVEN
  const app = Testing.app();
  const stack = new Chart(app, 'test');

  // WHEN
  new ApiObject(stack, 'resource', {
    kind: 'ResourceType',
    apiVersion: 'v1',
    data: {
      boom: 123
    }
  });

  // THEN
  expect(Testing.synth(stack)).toMatchSnapshot();
});

test('object naming logic can be overridden at the chart level', () => {
  class MyChart extends Chart {
    generateObjectName() {
      return 'fixed!';
    }
  }

  // GIVEN
  const app = Testing.app();
  const chart = new MyChart(app, 'my-chart');

  // WHEN
  const object = new ApiObject(chart, 'my-object', {
    apiVersion: 'v1',
    kind: 'MyKind'
  });

  // THEN
  expect(object.name).toEqual('fixed!');
  expect(Testing.synth(chart)).toStrictEqual([{
    "apiVersion": "v1",
    "kind": "MyKind",
    "metadata": { "name": "fixed!" }
  }]);
});

test('default namespace can be defined at the chart level', () => {
  // GIVEN
  const app = Testing.app();
  const chart = new Chart(app, 'chart', { namespace: 'ns1' });
  const group1 = new Construct(chart, 'group1');

  // WHEN
  new ApiObject(group1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
  new ApiObject(group1, 'obj2', { apiVersion: 'v2', kind: 'Kind2', metadata: { namespace: 'foobar' } });

  // THEN
  expect(Testing.synth(chart)).toStrictEqual([{ 
    "apiVersion": "v1", 
    "kind": 
    "Kind1", 
    "metadata": { 
      "name": "chart-group1-obj1-b4b7a9d0", 
      "namespace": "ns1" 
    } 
  }, { 
    "apiVersion": "v2", 
    "kind": "Kind2", 
    "metadata": { 
      "name": "chart-group1-obj2-3cdc9d22", 
      "namespace": "foobar" 
    } 
  }]);
});