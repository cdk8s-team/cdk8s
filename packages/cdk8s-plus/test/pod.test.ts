import * as kplus from '../src';
import { Testing } from 'cdk8s';
import * as k8s from '../src/imports/k8s';

test('Can add container post instantiation', () => {

  const chart = Testing.chart();

  const pod = new kplus.Pod(chart, 'Pod');
  pod.addContainer(new kplus.Container({ image: 'image' }));

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
      new kplus.Container({ image: 'image'}),
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

  const container = new kplus.Container({ image: 'image' });
  container.mount('/path/to/mount', volume);

  pod.addContainer(container);

  const spec = Testing.synth(chart)[0].spec;

  expect(spec.volumes[0].name).toEqual('volume');
  expect(spec.volumes[0].emptyDir).toBeTruthy();

});

test('Supports raw volume mounts', () => {
  const host_vol: Omit<k8s.Volume, 'name'> = {
    hostPath: {
      path: '/data',
      type: 'DirectoryOrCreate',
    },
  };

  const chart = Testing.chart();

  const pod = new kplus.Pod(chart, 'Pod');

  const volume = kplus.Volume.fromVolumeSpec('data-vol', host_vol);

  const container = new kplus.Container({ image: 'image' });
  container.mount('/data', volume);

  pod.addContainer(container);

  const spec = Testing.synth(chart)[0].spec;

  expect(spec.volumes[0].name).toEqual('data-vol');
  expect(spec.volumes[0].hostPath).toBeTruthy();

});


test('Synthesizes spec lazily', () => {

  const chart = Testing.chart();

  const pod = new kplus.Pod(chart, 'Pod', {});

  const container = new kplus.Container({ image: 'image' });
  pod.addContainer(container);

  const spec = Testing.synth(chart)[0].spec;

  expect(spec.containers[0].image).toEqual('image');

});
