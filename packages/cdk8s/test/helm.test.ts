import * as child_process from 'child_process';
import * as path from 'path';
import { Helm, Testing } from '../src';

const SAMPLE_CHART_PATH = path.join(__dirname, 'fixtures', 'helm-sample');

beforeEach(() => jest.restoreAllMocks());

test('basic usage', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  const helm = new Helm(chart, 'sample', {
    chart: SAMPLE_CHART_PATH,
  });

  // THEN
  expect(helm.releaseName).toEqual('test-sample-c8e2763d');
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
        selectMe: 'boomboom',
      },
    },
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
    releaseName: 'your-release',
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

  const service = helm.apiObjects.find(o => o.kind === 'ServiceAccount' && o.name === 'test-sample-c8e2763d-helm-sample');
  service?.metadata.addAnnotation('my.annotation', 'hey-there');

  // THEN
  expect(helm.apiObjects.map(o => `${o.kind}/${o.name}`).sort()).toEqual([
    'Deployment/test-sample-c8e2763d-helm-sample',
    'Service/test-sample-c8e2763d-helm-sample',
    'ServiceAccount/test-sample-c8e2763d-helm-sample',
  ]);

  expect(service?.toJson().metadata.annotations).toEqual({
    'my.annotation': 'hey-there',
  });
});

test('helmFlags can be used to specify additional helm options', () => {
  // GIVEN
  const spawnMock = jest.spyOn(child_process, 'spawnSync').mockReturnValue({
    status: 0,
    stderr: Buffer.from(''),
    stdout: Buffer.from(''),
    pid: 123,
    output: ['stdout', 'stderr'],
    signal: null,
  });

  const chart = Testing.chart();

  // WHEN
  new Helm(chart, 'sample', {
    chart: SAMPLE_CHART_PATH,
    helmFlags: [
      '--description', 'my custom description',
      '--no-hooks',
    ],
  });

  // THEN
  const expectedArgs: string[] = [
    'template',
    '--description', 'my custom description',
    '--no-hooks',
    'test-sample-c8e2763d',
    SAMPLE_CHART_PATH,
  ];

  expect(spawnMock).toHaveBeenCalledTimes(1);
  expect(spawnMock).toHaveBeenCalledWith('helm', expectedArgs);
});

test('propagates helm failures', () => {
  // GIVEN
  const chart = Testing.chart();

  // THEN
  expect(() => new Helm(chart, 'my-chart', {
    chart: SAMPLE_CHART_PATH,
    helmFlags: ['--invalid-argument-not-found-boom-boom'],
  })).toThrow(/unknown flag/);
});