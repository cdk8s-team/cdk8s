import { HelloHelm } from './index';
import { Testing } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new HelloHelm(app, 'hello-helm');
  expect(Testing.synth(chart)).toMatchSnapshot();
});