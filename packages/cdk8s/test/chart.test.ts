import { Chart, ApiObject, Testing } from '../lib';
import { App, Construct } from '@aws-cdk/core';

test('empty stack', () => {
  // GIVEN
  const app = new App();

  // WHEN
  const chart = new Chart(app, 'empty');

  // THEN
  expect(Testing.synth(chart)).toMatchSnapshot();
});

test('output includes all synthesized resources', () => {
  // GIVEN
  const app = new App();
  const chart = new Chart(app, 'test');

  // WHEN
  new ApiObject(chart, 'Resource1', { kind: 'Resource1', apiVersion: 'v1' });
  new ApiObject(chart, 'Resource2', { kind: 'Resource2', apiVersion: 'v1' });
  new ApiObject(chart, 'Resource3', { kind: 'Resource3', apiVersion: 'v1' });

  // also, subscopes
  const scope = new Construct(chart, 'scope');
  new ApiObject(scope, 'Resource1', { kind: 'Resource1', apiVersion: 'v1' });
  new ApiObject(scope, 'Resource2', { kind: 'Resource2', apiVersion: 'v1' });

  // THEN
  expect(Testing.synth(chart)).toMatchSnapshot();
});