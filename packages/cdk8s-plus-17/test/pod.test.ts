import { Testing, ApiObject } from 'cdk8s';
import { Node } from 'constructs';
import * as kplus from '../src';

test('multiple mounts per volume', () => {

  const chart = Testing.chart();

  const configMap = new kplus.ConfigMap(chart, 'Config', {
    data: {
      f1: 'f1-content',
      f2: 'f2-content',
    },
  });

  const volume = kplus.Volume.fromConfigMap(configMap);

  new kplus.Pod(chart, 'Pod', {
    containers: [
      {
        image: 'image',
        volumeMounts: [
          {
            volume: volume,
            path: 'f1',
            subPath: 'f1',
          },
          {
            volume: volume,
            path: 'f2',
            subPath: 'f2',
          },
        ],
      },
    ],
  });

  const podSpec = Testing.synth(chart).filter(r => r.kind === 'Pod')[0].spec;

  expect(podSpec.volumes).toEqual([{
    configMap: {
      name: 'test-config-c8c927dd',
    },
    name: 'configmap-test-config-c8c927dd',
  }]);

});

test('defaultChild', () => {

  const chart = Testing.chart();

  const defaultChild = Node.of(new kplus.Pod(chart, 'Pod')).defaultChild as ApiObject;

  expect(defaultChild.kind).toEqual('Pod');

});

test('Can add container post instantiation', () => {

  const chart = Testing.chart();

  const pod = new kplus.Pod(chart, 'Pod');
  pod.addContainer({ image: 'image' });

  const spec = Testing.synth(chart)[0].spec;

  expect(spec.containers[0].image).toEqual('image');

});

test('Must have at least one container', () => {

  const chart = Testing.chart();

  new kplus.Pod(chart, 'Pod');

  expect(() => Testing.synth(chart)).toThrow(
    'PodSpec must have at least 1 container',
  );

});

test('Can add volume post instantiation', () => {

  const chart = Testing.chart();

  const pod = new kplus.Pod(chart, 'Pod', {
    containers: [
      { image: 'image' },
    ],
  });

  const volume = kplus.Volume.fromEmptyDir('volume');
  pod.addVolume(volume);

  const spec = Testing.synth(chart)[0].spec;

  expect(spec.volumes[0].name).toEqual('volume');
  expect(spec.volumes[0].emptyDir).toBeTruthy();
});

test('Automatically adds volumes from container mounts', () => {

  const chart = Testing.chart();

  const pod = new kplus.Pod(chart, 'Pod');

  const volume = kplus.Volume.fromEmptyDir('volume');

  const container = pod.addContainer({ image: 'image' });
  container.mount('/path/to/mount', volume);

  const spec = Testing.synth(chart)[0].spec;

  expect(spec.volumes[0].name).toEqual('volume');
  expect(spec.volumes[0].emptyDir).toBeTruthy();

});

test('Synthesizes spec lazily', () => {

  const chart = Testing.chart();

  const pod = new kplus.Pod(chart, 'Pod', {});

  pod.addContainer({ image: 'image' });

  const spec = Testing.synth(chart)[0].spec;

  expect(spec.containers[0].image).toEqual('image');

});
