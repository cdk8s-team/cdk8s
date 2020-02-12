import { App } from '@aws-cdk/core';
import { HelloKube } from './hello';
import { Testing } from '@awslabs/cdk8s';

test('snapshot', () => {
  const app = new App();
  const chart = new HelloKube(app, 'hello');

  expect(Testing.synth(chart)).toMatchSnapshot();
});