import { Yaml } from "../lib/yaml";
import * as fs from 'fs';

describe('load', () => {
  test('from file', () => {
    expect(Yaml.load(`${__dirname}/fixtures/sample.yaml`)).toMatchSnapshot();
    expect(Yaml.load(`file://${__dirname}/fixtures/sample.yaml`)).toMatchSnapshot();
  });

  test('from url', () => {
    expect(Yaml.load(`https://raw.githubusercontent.com/kubernetes/examples/52158f68ddc508eac9f15a9bb7260b838e644c9f/guestbook/all-in-one/guestbook-all-in-one.yaml`)).toMatchSnapshot();
  });

  test('empty documents are filtered out', () => {
    const file = Yaml.tmp([
      { doc: 1 },
      null,      // filtered
      'str_doc', // not filtered
      { },       // filtered
      '',        // not filtered
      undefined, // filtered
      0,         // not filtered
      [],        // filtered
      { doc: 2 }
    ])

    expect(Yaml.load(file)).toMatchSnapshot();
  });
});

describe('save', () => {
  test('single document', () => {
    const outputFile = Yaml.tmp([ { foo: 'bar', hello: [ 1, 2, 3 ] } ]);
    expect(fs.readFileSync(outputFile, 'utf-8')).toMatchSnapshot();
  });

  test('multiple documents', () => {
    const outputFile = Yaml.tmp([
      { foo: 'bar', hello: [ 1, 2, 3 ] },
      { number: 2 }
    ]);

    expect(fs.readFileSync(outputFile, 'utf-8')).toMatchSnapshot();
  });

  test('empty documents are respected', () => {
    const outputFile = Yaml.tmp([
      {},
      {},
      undefined,
      {empty: true},
      {}
    ]);

    expect(fs.readFileSync(outputFile, 'utf-8')).toMatchSnapshot();
  });

})