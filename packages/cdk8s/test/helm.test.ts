import { ApiObject, Helm, Testing } from '../src';
import * as path from 'path';
import { Node } from 'constructs';

const SAMPLE_CHART_PATH = path.join(__dirname, 'fixtures', 'helm-sample');

test('basic usage', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  const helm = new Helm(chart, 'sample', {
    chart: SAMPLE_CHART_PATH
  });

  // THEN
  expect(helm.releaseName).toEqual('test-sample-00742e24');
  expect(Testing.synth(chart)).toMatchSnapshot();
});

test('fails if the helm executable is not found', () => {
  // GIVEN
  const chart = Testing.chart();
  const executable = `foo-${Math.random() * 999999}`;

  // THEN
  expect(() => new Helm(chart, 'sample', {
    chart: SAMPLE_CHART_PATH,
    helmExecutable: executable,
  })).toThrow(`unable to execute '${executable}' to render Helm chart`);
});

test('values can be specified when defining the chart', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  new Helm(chart, 'sample', {
    chart: SAMPLE_CHART_PATH,
    values: {
      replicaCount: 889,
      ingress: {
        enabled: false,
      },
      nodeSelector: {
        selectMe: 'boomboom'
      },
    }
  });

  // THEN
  expect(Testing.synth(chart)).toMatchSnapshot();
});

test('releaseName can be used to specify the release name', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  const helm = new Helm(chart, 'sample', {
    chart: SAMPLE_CHART_PATH,
    releaseName: 'your-release'
  });

  // THEN - all names start with "your-release-"
  expect(helm.releaseName).toEqual('your-release');
  const names: string[] = Testing.synth(chart).map(obj => obj.metadata.name);
  for (const n of names) {
    expect(n.startsWith('your-release-')).toBeTruthy();
  }
});

test('it is possible to interact with api objects in the chart', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  const helm = new Helm(chart, 'sample', {
    chart: SAMPLE_CHART_PATH,
  });

  const service = helm.apiObjects.find(o => o.kind === 'ServiceAccount' && o.name === 'test-sample-00742e24-helm-sample');
  service.metadata.addAnnotation('my.annotation', 'hey-there');

  // THEN
  expect(helm.apiObjects.map(o => `${o.kind}/${o.name}`).sort()).toEqual([
    'Deployment/test-sample-00742e24-helm-sample',
    'Pod/test-sample-00742e24-helm-sample-test-connection',
    'Service/test-sample-00742e24-helm-sample',
    'ServiceAccount/test-sample-00742e24-helm-sample'
  ]);

  expect(service.toJson().metadata.annotations).toEqual({
    'my.annotation': 'hey-there',
  });
});

test('temp', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  const helm = new Helm(chart, 'sample', {
    chart: 'bitnami/redis',
    releaseName: 'foo'
  });

  // THEN
  helm.apiObjects.find(o => o.name === 'foo-redis-master').metadata.addAnnotation('my.annotation', 'yours');
});