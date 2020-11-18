import { Testing } from 'cdk8s';
import { Node } from 'constructs';
import { ConfigMap } from '../src';

test('defaultChild', () => {

  const chart = Testing.chart();

  expect(Node.of(new ConfigMap(chart, 'ConfigMap')).defaultChild).toBeTruthy();

});

test('minimal', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  new ConfigMap(chart, 'my-config-map');

  // THEN
  expect(Testing.synth(chart)).toStrictEqual([
    {
      apiVersion: 'v1',
      kind: 'ConfigMap',
      metadata: {
        name: 'test-my-config-map-91419662',
      },
    },
  ]);
});

test('with data', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  new ConfigMap(chart, 'my-config-map', {
    data: {
      key1: 'foo',
      key2: 'bar',
    },
  });

  // THEN
  expect(Testing.synth(chart)).toStrictEqual([
    {
      apiVersion: 'v1',
      kind: 'ConfigMap',
      data: {
        key1: 'foo',
        key2: 'bar',
      },
      metadata: {
        name: 'test-my-config-map-91419662',
      },
    },
  ]);
});

test('with binaryData', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  new ConfigMap(chart, 'my-config-map', {
    binaryData: {
      key1: 'foo',
      key2: 'bar',
    },
  });

  // THEN
  expect(Testing.synth(chart)).toStrictEqual([
    {
      apiVersion: 'v1',
      kind: 'ConfigMap',
      binaryData: {
        key1: 'foo',
        key2: 'bar',
      },
      metadata: {
        name: 'test-my-config-map-91419662',
      },
    },
  ]);
});

test('with binaryData and data', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  new ConfigMap(chart, 'my-config-map', {
    data: {
      hello: 'world',
    },
    binaryData: {
      key1: 'foo',
      key2: 'bar',
    },
  });

  // THEN
  expect(Testing.synth(chart)).toStrictEqual([
    {
      apiVersion: 'v1',
      kind: 'ConfigMap',
      data: {
        hello: 'world',
      },
      binaryData: {
        key1: 'foo',
        key2: 'bar',
      },
      metadata: {
        name: 'test-my-config-map-91419662',
      },
    },
  ]);
});

test('"binaryData" and "data" cannot share keys', () => {
  // GIVEN
  const chart = Testing.chart();

  // THEN
  expect(
    () =>
      new ConfigMap(chart, 'my-config-map', {
        data: {
          key1: 'world',
        },
        binaryData: {
          key1: 'foo',
          key2: 'bar',
        },
      }),
  ).toThrow(
    /unable to add a ConfigMap entry with key \"key1\". It is already used/,
  );
});

test('addData()/addBinaryDataq() can be used to add data', () => {
  // GIVEN
  const chart = Testing.chart();
  const cm = new ConfigMap(chart, 'my-config-map', {
    data: {
      hello: 'world',
    },
    binaryData: {
      key1: 'foo',
      key2: 'bar',
    },
  });

  // WHEN
  cm.addData('world', 'oh yeah!');
  cm.addBinaryData('key3', 'baz');

  // THEN
  expect(Testing.synth(chart)).toStrictEqual([
    {
      apiVersion: 'v1',
      binaryData: {
        key1: 'foo',
        key2: 'bar',
        key3: 'baz',
      },
      data: {
        hello: 'world',
        world: 'oh yeah!',
      },
      kind: 'ConfigMap',
      metadata: {
        name: 'test-my-config-map-91419662',
      },
    },
  ]);
});

test('addData() and addBinaryData() throw if key already used', () => {
  // GIVEN
  const chart = Testing.chart();
  const cm = new ConfigMap(chart, 'my-config-map', {
    data: {
      key: 'value',
    },
  });

  // THEN
  expect(() => cm.addData('key', 'value2')).toThrow(
    /unable to add a ConfigMap entry with key \"key\". It is already used/,
  );
  expect(() => cm.addBinaryData('key', 'value2')).toThrow(
    /unable to add a ConfigMap entry with key \"key\". It is already used/,
  );
});

test('addFile() adds local files to the config map', () => {
  // GIVEN
  const chart = Testing.chart();
  const cm = new ConfigMap(chart, 'my-config-map');

  // WHEN
  cm.addFile(`${__dirname}/fixtures/flat-directory/file1.txt`); // defaults to file name
  cm.addFile(`${__dirname}/fixtures/flat-directory/file2.html`, 'hey-there');

  // THEN
  expect(Testing.synth(chart)).toMatchSnapshot();
});

describe('addDirectory() adds all files in a directory to the config map', () => {
  // TODO: support this once this is resolved: https://github.com/kubernetes/kubernetes/pull/63362
  test('sub-directories are skipped', () => {
    // GIVEN
    const chart = Testing.chart();
    const cm = new ConfigMap(chart, 'my-config-map');

    // WHEN
    cm.addDirectory(`${__dirname}/fixtures/nested-directory`);

    // THEN
    expect(Testing.synth(chart)).toMatchSnapshot();
  });

  test('keys are based on file names', () => {
    // GIVEN
    const chart = Testing.chart();
    const cm = new ConfigMap(chart, 'my-config-map');

    // WHEN
    cm.addDirectory(`${__dirname}/fixtures/flat-directory`);

    // THEN
    expect(Testing.synth(chart)).toMatchSnapshot();
  });

  test('"prefix" can be used to prefix keys"', () => {
    // GIVEN
    const chart = Testing.chart();
    const cm = new ConfigMap(chart, 'my-config-map');

    // WHEN
    cm.addDirectory(`${__dirname}/fixtures/flat-directory`, {
      keyPrefix: 'prefix.',
    });

    // THEN
    expect(Testing.synth(chart)).toMatchSnapshot();
  });

  test('"exclude" exclusion via globs', () => {
    // GIVEN
    const chart = Testing.chart();
    const cm = new ConfigMap(chart, 'my-config-map');

    // WHEN
    cm.addDirectory(`${__dirname}/fixtures/flat-directory`, {
      exclude: ['*.html'],
    });

    // THEN
    expect(Testing.synth(chart)).toMatchSnapshot();
  });
});

test('metadata is synthesized', () => {
  const chart = Testing.chart();
  new ConfigMap(chart, 'my-config-map', {
    metadata: {
      name: 'my-name',
    },
  });

  // THEN
  expect(Testing.synth(chart)).toMatchInlineSnapshot(`
    Array [
      Object {
        "apiVersion": "v1",
        "kind": "ConfigMap",
        "metadata": Object {
          "name": "my-name",
        },
      },
    ]
  `);
});
