import * as fs from 'fs';
import { Node } from 'constructs';
import * as yaml from 'yaml';
import { Testing, Include, Yaml } from '../src';

test('Include can be used to load from YAML', () => {
  // GIVEN
  const chart = Testing.chart();
  const source = `${__dirname}/fixtures/guestbook-all-in-one.yaml`;

  // WHEN
  new Include(chart, 'guestbook', { url: source });

  // THEN
  const expected = yaml.parseAllDocuments(fs.readFileSync(source, 'utf-8')).map(x => x.toJSON());
  const actual = Testing.synth(chart);
  expect(actual).toStrictEqual(expected);
});

test('skips empty documents', () => {
  // GIVEN
  const chart = Testing.chart();
  const file = Yaml.tmp([{ }]);

  // WHEN
  const inc = new Include(chart, 'empty', { url: file });

  // THEN
  expect(Node.of(inc).children.length).toEqual(0);
});

test('multiple resources with the same k8s name can be included so long as their kind is different', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  const file = Yaml.tmp([
    {
      apiVersion: 'v1',
      kind: 'Foo',
      metadata: {
        name: 'resource1',
      },
    },
    { },
    {
      apiVersion: 'v1',
      kind: 'Bar',
      metadata: {
        name: 'resource1',
      },
    },
  ]);

  const inc = new Include(chart, 'foo', { url: file });
  const ids = Node.of(inc).children.map(x => Node.of(x).id);
  expect(ids).toStrictEqual(['resource1-foo', 'resource1-bar']);
});

test('apiObjects returns all the API objects', () => {
  // GIVEN
  const chart = Testing.chart();

  // WHEN
  const file = Yaml.tmp([
    {
      apiVersion: 'v1',
      kind: 'Foo',
      metadata: {
        name: 'resource1',
      },
    },
    { },
    {
      apiVersion: 'v1',
      kind: 'Bar',
      metadata: {
        name: 'resource1',
      },
    },
  ]);

  const inc = new Include(chart, 'foo', { url: file });
  expect(inc.apiObjects.map(x => x.kind).sort()).toEqual(['Bar', 'Foo']);
});