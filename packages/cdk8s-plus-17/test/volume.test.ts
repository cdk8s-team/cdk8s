import { Testing, Size } from 'cdk8s';
import { Volume, ConfigMap, EmptyDirMedium } from '../src';

describe('fromConfigMap', () => {
  test('minimal definition', () => {
    // GIVEN
    const chart = Testing.chart();
    const configMap = new ConfigMap(chart, 'my-config-map');

    // WHEN
    const vol = Volume.fromConfigMap(configMap);

    // THEN
    expect(vol._toKube()).toMatchInlineSnapshot(`
      Object {
        "configMap": Object {
          "defaultMode": undefined,
          "items": undefined,
          "name": "test-my-config-map-c8eaefa4",
          "optional": undefined,
        },
        "name": "configmap-test-my-config-map-c8eaefa4",
      }
    `);
  });

  test('custom volume name', () => {
    // GIVEN
    const chart = Testing.chart();
    const configMap = new ConfigMap(chart, 'my-config-map');

    // WHEN
    const vol = Volume.fromConfigMap(configMap, {
      name: 'filesystem',
    });

    // THEN
    expect(vol._toKube().name).toBe('filesystem');
    expect(vol._toKube().configMap?.name).toBe('test-my-config-map-c8eaefa4');
  });

  test('default mode', () => {
    // GIVEN
    const chart = Testing.chart();
    const configMap = new ConfigMap(chart, 'my-config-map');

    // WHEN
    const vol = Volume.fromConfigMap(configMap, {
      defaultMode: 0o777,
    });

    // THEN
    expect(vol._toKube().configMap?.defaultMode).toBe(0o777);
  });

  test('optional', () => {
    // GIVEN
    const chart = Testing.chart();
    const configMap = new ConfigMap(chart, 'my-config-map');

    // WHEN
    const vol0 = Volume.fromConfigMap(configMap);
    const vol1 = Volume.fromConfigMap(configMap, { optional: true });
    const vol2 = Volume.fromConfigMap(configMap, { optional: false });

    // THEN
    expect(vol0._toKube().configMap?.optional).toBe(undefined);
    expect(vol1._toKube().configMap?.optional).toBe(true);
    expect(vol2._toKube().configMap?.optional).toBe(false);
  });

  test('items', () => {
    // GIVEN
    const chart = Testing.chart();
    const configMap = new ConfigMap(chart, 'my-config-map');

    // WHEN
    const vol = Volume.fromConfigMap(configMap, {
      items: {
        key1: { path: 'path/to/key1' },
        key2: { path: 'path/key2', mode: 0o100 },
      },
    });

    // THEN
    expect(vol._toKube().configMap?.items?.[0]).toStrictEqual({
      key: 'key1',
      mode: undefined,
      path: 'path/to/key1',
    });
    expect(vol._toKube().configMap?.items?.[1]).toStrictEqual({
      key: 'key2',
      mode: 0o100,
      path: 'path/key2',
    });
  });

  test('items are sorted by key for determinstic synthesis', () => {
    // GIVEN
    const chart = Testing.chart();
    const configMap = new ConfigMap(chart, 'my-config-map');

    // WHEN
    const vol = Volume.fromConfigMap(configMap, {
      items: {
        key2: { path: 'path2' },
        key1: { path: 'path1' },
      },
    });

    // THEN
    expect(vol._toKube().configMap?.items?.[0]).toStrictEqual({
      key: 'key1',
      mode: undefined,
      path: 'path1',
    });
    expect(vol._toKube().configMap?.items?.[1]).toStrictEqual({
      key: 'key2',
      mode: undefined,
      path: 'path2',
    });
  });
});

describe('fromEmptyDir', () => {
  test('minimal definition', () => {
    // GIVEN
    const vol = Volume.fromEmptyDir('main');

    // THEN
    expect(vol._toKube()).toStrictEqual({
      name: 'main',
      emptyDir: {
        medium: undefined,
        sizeLimit: undefined,
      },
    });
  });

  test('default medium', () => {
    const vol = Volume.fromEmptyDir('main', { medium: EmptyDirMedium.DEFAULT });
    expect(vol._toKube().emptyDir?.medium).toEqual('');
  });

  test('memory medium', () => {
    const vol = Volume.fromEmptyDir('main', { medium: EmptyDirMedium.MEMORY });
    expect(vol._toKube().emptyDir?.medium).toEqual('Memory');
  });

  test('size limit', () => {
    const vol = Volume.fromEmptyDir('main', { sizeLimit: Size.gibibytes(20) });
    expect(vol._toKube().emptyDir?.sizeLimit).toEqual('20480Mi');
  });
});
