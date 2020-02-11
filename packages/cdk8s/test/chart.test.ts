import { Chart, ApiObject } from '../lib';
import { App, Construct } from '@aws-cdk/core';
import { synth } from './util';

test('empty stack', () => {
  // GIVEN
  const app = new App();

  // WHEN
  const stack = new Chart(app, 'empty');

  // THEN
  expect(synth(stack)).toMatchSnapshot();
});

test('output includes all synthesized resources', () => {
  // GIVEN
  const app = new App();
  const stack = new Chart(app, 'test');

  // WHEN
  new ApiObject(stack, 'Resource1', { kind: 'Resource1', apiVersion: 'v1' });
  new ApiObject(stack, 'Resource2', { kind: 'Resource2', apiVersion: 'v1' });
  new ApiObject(stack, 'Resource3', { kind: 'Resource3', apiVersion: 'v1' });

  // also, subscopes
  const scope = new Construct(stack, 'scope');
  new ApiObject(scope, 'Resource1', { kind: 'Resource1', apiVersion: 'v1' });
  new ApiObject(scope, 'Resource2', { kind: 'Resource2', apiVersion: 'v1' });

  // THEN
  expect(synth(stack)).toMatchSnapshot();
});