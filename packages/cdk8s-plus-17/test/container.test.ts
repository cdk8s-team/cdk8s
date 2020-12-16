import * as cdk8s from 'cdk8s';
import * as kplus from '../src';
import * as k8s from '../src/imports/k8s';

describe('EnvValue', () => {

  test('Can be created from value', () => {

    const actual = kplus.EnvValue.fromValue('value');

    expect(actual.value).toEqual('value');
    expect(actual.valueFrom).toBeUndefined();

  });

  test('Can be created from config map name', () => {

    const actual = kplus.EnvValue.fromConfigMap(kplus.ConfigMap.fromConfigMapName('ConfigMap'), 'key');

    expect(actual.value).toBeUndefined();
    expect(actual.valueFrom).toEqual({
      configMapKeyRef: {
        key: 'key',
        name: 'ConfigMap',
      },
    });

  });

  test('Can be created from secret value', () => {
    const secretValue = {
      secret: kplus.Secret.fromSecretName('Secret'),
      key: 'my-key',
    };

    const actual = kplus.EnvValue.fromSecretValue(secretValue);

    expect(actual.value).toBeUndefined();
    expect(actual.valueFrom).toEqual({
      secretKeyRef: {
        key: 'my-key',
        name: 'Secret',
      },
    });
  });

  test('Cannot be created from missing required process env', () => {

    const key = 'cdk8s-plus.tests.container.env.fromProcess';
    expect(() => kplus.EnvValue.fromProcess(key, { required: true })).toThrowError(`Missing ${key} env variable`);

  });

  test('Can be created from missing optional process env', () => {

    const key = 'cdk8s-plus.tests.container.env.fromProcess';
    const actual = kplus.EnvValue.fromProcess(key);

    expect(actual.value).toBeUndefined();
    expect(actual.valueFrom).toBeUndefined();

  });

  test('Can be created from existing process env', () => {

    const key = 'cdk8s-plus.tests.container.env.fromProcess';
    try {
      process.env[key] = 'value';
      const actual = kplus.EnvValue.fromProcess(key);

      expect(actual.value).toEqual('value');
      expect(actual.valueFrom).toBeUndefined();

    } finally {
      delete process.env[key];
    }

  });

});

describe('Container', () => {

  test('Instantiation properties are all respected', () => {

    const container = new kplus.Container({
      image: 'image',
      name: 'name',
      imagePullPolicy: kplus.ImagePullPolicy.NEVER,
      workingDir: 'workingDir',
      port: 9000,
      command: ['command'],
      env: {
        key: kplus.EnvValue.fromValue('value'),
      },
    });

    const actual: k8s.Container = container._toKube();

    const expected: k8s.Container = {
      name: 'name',
      imagePullPolicy: kplus.ImagePullPolicy.NEVER,
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
    };

    expect(actual).toEqual(expected);

  });

  test('Must use container props', () => {

    const container = new kplus.Container({
      image: 'image',
    });
    expect(() => {
      new kplus.Container(container);
    }).toThrow();

  });

  test('Can add environment variable', () => {

    const container = new kplus.Container({
      image: 'image',
    });

    container.addEnv('key', kplus.EnvValue.fromValue('value'));

    const actual: k8s.EnvVar[] = container._toKube().env!;
    const expected: k8s.EnvVar[] = [{
      name: 'key',
      value: 'value',
      valueFrom: undefined,
    }];

    expect(actual).toEqual(expected);

  });

  test('Can mount container to volume', () => {

    const container = new kplus.Container({
      image: 'image',
    });

    const volume = kplus.Volume.fromConfigMap(kplus.ConfigMap.fromConfigMapName('ConfigMap'));

    container.mount('/path/to/mount', volume);

    const expected: k8s.VolumeMount = {
      mountPath: '/path/to/mount',
      name: volume.name,
    };

    expect(container._toKube().volumeMounts).toEqual([expected]);
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

  test('"readiness", "liveness", and "startup" can be used to define probes', () => {
    // GIVEN
    const container = new kplus.Container({
      image: 'foo',
      readiness: kplus.Probe.fromHttpGet('/ping', {
        timeoutSeconds: cdk8s.Duration.minutes(2),
      }),
      liveness: kplus.Probe.fromHttpGet('/live', {
        timeoutSeconds: cdk8s.Duration.minutes(3),
      }),
      startup: kplus.Probe.fromHttpGet('/startup', {
        timeoutSeconds: cdk8s.Duration.minutes(4),
      }),
    });

    // THEN
    expect(container._toKube().readinessProbe).toEqual({
      failureThreshold: 3,
      httpGet: { path: '/ping', port: 80 },
      initialDelaySeconds: undefined,
      periodSeconds: undefined,
      successThreshold: undefined,
      timeoutSeconds: 120,
    });
    expect(container._toKube().livenessProbe).toEqual({
      failureThreshold: 3,
      httpGet: { path: '/live', port: 80 },
      initialDelaySeconds: undefined,
      periodSeconds: undefined,
      successThreshold: undefined,
      timeoutSeconds: 180,
    });
    expect(container._toKube().startupProbe).toEqual({
      failureThreshold: 3,
      httpGet: { path: '/startup', port: 80 },
      initialDelaySeconds: undefined,
      periodSeconds: undefined,
      successThreshold: undefined,
      timeoutSeconds: 240,
    });
  });

});