import * as kplus from '../lib';
import * as k8s from '../imports/k8s';

describe('env', () => {

  test('fromValue', () => {

    const container = new kplus.Container({
      image: 'image',
    });

    container.addEnv('key', kplus.EnvValue.fromValue('value'));

    const spec: k8s.Container = container._toKube();

    expect(spec.env![0].name).toEqual('key');
    expect(spec.env![0].value).toEqual('value');

  });

  test('fromConfigMapName', () => {

    const container = new kplus.Container({
      image: 'image',
    });

    container.addEnv('key', kplus.EnvValue.fromConfigMap(kplus.ConfigMap.fromConfigMapName('ConfigMap'), 'key'));

    const spec: k8s.Container = container._toKube();

    const expected: k8s.EnvVarSource = {
      configMapKeyRef: {
        key: 'key',
        name: 'ConfigMap',
      },
    }

    expect(spec.env![0].name).toEqual('key');
    expect(spec.env![0].value).toBeUndefined();
    expect(spec.env![0].valueFrom).toEqual(expected);

  });

  test('fromSecret', () => {

    const container = new kplus.Container({
      image: 'image',
    });

    container.addEnv('key', kplus.EnvValue.fromSecret(kplus.Secret.fromSecretName('Secret'), 'key'));

    const spec: k8s.Container = container._toKube();

    const expected: k8s.EnvVarSource = {
      secretKeyRef: {
        key: 'key',
        name: 'Secret',
      },
    }

    expect(spec.env![0].name).toEqual('key');
    expect(spec.env![0].value).toBeUndefined();
    expect(spec.env![0].valueFrom).toEqual(expected);

  });

  test('fromProcess', () => {

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

    const spec: k8s.Container = container._toKube();

    expect(spec.env![0].name).toEqual('key');
    expect(spec.env![0].value).toEqual('value')
    expect(spec.env![0].valueFrom).toBeUndefined();

  });

});

test('image', () => {

  const container = new kplus.Container({
    image: 'image',
  });

  expect(container._toKube().image).toEqual('image');

});

test('name', () => {

  const container = new kplus.Container({
    image: 'image',
    name: 'name',
  });

  expect(container._toKube().name).toEqual('name');

});

test('workingDir', () => {

  const container = new kplus.Container({
    image: 'image',
    workingDir: 'workingDir',
  });

  expect(container._toKube().workingDir).toEqual('workingDir');

});

test('port', () => {

  const container = new kplus.Container({
    image: 'image',
    port: 9000,
  });

  const expected: k8s.ContainerPort = {
    containerPort: 9000,
  }

  expect(container._toKube().ports).toEqual([expected]);

});

test('mount', () => {

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
