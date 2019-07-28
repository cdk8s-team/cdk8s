import { KubResource, Stack } from '../lib';
import { App, Construct } from '@aws-cdk/core';
import { synth } from './util';

test('minimal configuration', () => {
  const app = new App();
  const stack = new Stack(app, 'test');

  new KubResource(stack, 'MyResource', {
    apiVersion: 'v1',
    kind: 'MyResource'
  });

  expect(synth(stack)).toMatchSnapshot();
});

test('synthesized resource name is based on path', () => {
  // GIVEN
  const app = new App();
  const stack = new Stack(app, 'test');
  new KubResource(stack, 'MyResource', {
    apiVersion: 'v1',
    kind: 'MyResource'
  });

  // WHEN
  // now create another resource with the same namespace but within a sub-scope
  const scope = new Construct(stack, 'Scope');
  new KubResource(scope, 'MyResource', {
    apiVersion: 'v1',
    kind: 'MyResource'
  });

  // THEN
  expect(synth(stack)).toMatchSnapshot();
});

test('if name is explicitly specified it will be respected', () => {
  // GIVEN
  const app = new App();
  const stack = new Stack(app, 'test');

  // WHEN
  new KubResource(stack, 'MyResource', {
    kind: 'MyResource',
    apiVersion: 'v1',
    metadata: {
      name: 'boom'
    }
  });

  // THEN
  expect(synth(stack)).toMatchSnapshot();
});

test('"spec" is synthesized as-is', () => {
  // GIVEN
  const app = new App();
  const stack = new Stack(app, 'test');

  // WHEN
  new KubResource(stack, 'resource', {
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
  expect(synth(stack)).toMatchSnapshot();
});

test('"data" can be used to specify resource data', () => {
  // GIVEN
  const app = new App();
  const stack = new Stack(app, 'test');

  // WHEN
  new KubResource(stack, 'resource', {
    kind: 'ResourceType',
    apiVersion: 'v1',
    data: {
      boom: 123
    }
  });

  // THEN
  expect(synth(stack)).toMatchSnapshot();
});