import { MyChart } from './index';
import { Testing, Yaml } from 'cdk8s';

test('snapshot', () => {
  const app = Testing.app();
  const chart = new MyChart(app, 'chart');

  const expected = Yaml.load(`${__dirname}/dashboard.yaml`);
  const actual = Testing.synth(chart);
  expect(actual).toEqual(expected);
});