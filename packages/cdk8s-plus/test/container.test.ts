import * as kplus from '../lib';
import * as k8s from '../imports/k8s';
import { EnvValue } from '../lib';

describe('EnvValue', () => {

  test('Can be created from value', () => {

    const container = new kplus.Container({
      image: 'image',
    });

    container.addEnv('key', kplus.EnvValue.fromValue('value'));

    const actual: k8s.EnvVar[] = container._toKube().env!

    const expected: k8s.EnvVar[] = [{
      name: 'key',
      value: 'value',
    }];

    expect(actual).toEqual(expected);

  });

  test('Can be created from config map name', () => {

    const container = new kplus.Container({
      image: 'image',
    });

    container.addEnv('key', kplus.EnvValue.fromConfigMap(kplus.ConfigMap.fromConfigMapName('ConfigMap'), 'key'));

    const actual: k8s.EnvVar[] = container._toKube().env!;

    const expected: k8s.EnvVar[] = [{
      name: 'key',
      valueFrom: {
        configMapKeyRef: {
          key: 'key',
          name: 'ConfigMap',
        },
      },
    }]

    expect(actual).toEqual(expected);

  });

  test('Can be created from secret', () => {

    const container = new kplus.Container({
      image: 'image',
    });

    container.addEnv('key', kplus.EnvValue.fromSecret(kplus.Secret.fromSecretName('Secret'), 'key'));

    const actual: k8s.EnvVar[] = container._toKube().env!;

    const expected: k8s.EnvVar[] = [{
      name: 'key',
      valueFrom: {
        secretKeyRef: {
          key: 'key',
          name: 'Secret',
        },
      },
    }]

    expect(actual).toEqual(expected);

  });

  test('Can be created from process', () => {

    const container = new kplus.Container({
      image: 'image',
    });

    const key = 'cdk8s-plus.tests.container.env.fromProcess'
    try {
      process.env[key] = 'value';
      container.addEnv('key', kplus.EnvValue.fromProcess(key));
    } finally {
      delete process.env[key]
    }

    const actual: k8s.EnvVar[] = container._toKube().env!;

    const expected: k8s.EnvVar[] = [{
      name: 'key',
      value: 'value',
    }]

    expect(actual).toEqual(expected);

  });

});

test('Instantiation properties are all respected', () => {

  const container = new kplus.Container({
    image: 'image',
    name: 'name',
    workingDir: 'workingDir',
    port: 9000,
    command: ['command'],
    env: {
      'key': EnvValue.fromValue('value'),
    },
  });

  const actual: k8s.Container = container._toKube();

  const expected: k8s.Container = {
    name: 'name',
    image: 'image',
    workingDir: 'workingDir',
    ports: [{
      containerPort: 9000,
    }],
    command: ['command'],
    env: [{
      name: 'key',
      value: 'value',
      valueFrom: undefined,
    }],
    volumeMounts: [],
  }

  expect(actual).toEqual(expected);

});

test('Can mount container to volume', () => {

  const container = new kplus.Container({
    image: 'image',
  })

  const volume = kplus.Volume.fromConfigMap(kplus.ConfigMap.fromConfigMapName('ConfigMap'));

  container.mount('/path/to/mount', volume);

  const expected: k8s.VolumeMount = {
    mountPath: '/path/to/mount',
    name: volume.name,
  }

  expect(container._toKube().volumeMounts).toEqual([expected])
});

test('mount options', () => {
  const container = new kplus.Container({
    image: 'image',
  });

  const volume = kplus.Volume.fromConfigMap(kplus.ConfigMap.fromConfigMapName('ConfigMap'));

  container.mount('/path/to/mount', volume, {
    propagation: kplus.MountPropagation.BIDIRECTIONAL,
    readOnly: true,
  });

  const expected: k8s.VolumeMount = {
    mountPath: '/path/to/mount',
    name: volume.name,
    mountPropagation: 'Bidirectional',
    readOnly: true,
  };

  expect(container._toKube().volumeMounts).toEqual([expected]);
});

test('mount from ctor', () => {
  const container = new kplus.Container({
    image: 'image',
    volumeMounts: [
      {
        path: '/foo',
        volume: kplus.Volume.fromEmptyDir('empty'),
        subPath: 'subPath',
      },
    ],
  });

  const expected: k8s.VolumeMount = {
    mountPath: '/foo',
    name: 'empty',
    subPath: 'subPath',
  };

  expect(container._toKube().volumeMounts).toEqual([expected]);
});