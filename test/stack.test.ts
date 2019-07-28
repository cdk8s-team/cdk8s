import { Stack, KubResource } from '../lib';
import { App, Construct } from '@aws-cdk/core';
import { synth } from './util';

test('empty stack', () => {
  // GIVEN
  const app = new App();

  // WHEN
  const stack = new Stack(app, 'empty');

  // THEN
  expect(synth(stack)).toMatchSnapshot();
});

test('output includes all synthesized resources', () => {
  // GIVEN
  const app = new App();
  const stack = new Stack(app, 'test');

  // WHEN
  new KubResource(stack, 'Resource1', { kind: 'Resource1', apiVersion: 'v1' });
  new KubResource(stack, 'Resource2', { kind: 'Resource2', apiVersion: 'v1' });
  new KubResource(stack, 'Resource3', { kind: 'Resource3', apiVersion: 'v1' });

  // also, subscopes
  const scope = new Construct(stack, 'scope');
  new KubResource(scope, 'Resource1', { kind: 'Resource1', apiVersion: 'v1' });
  new KubResource(scope, 'Resource2', { kind: 'Resource2', apiVersion: 'v1' });

  // THEN
  expect(synth(stack)).toMatchSnapshot();
});