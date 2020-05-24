import { Yaml } from "../lib/yaml";

describe('load', () => {
  test('from file', () => {
    expect(Yaml.load(`${__dirname}/fixtures/sample.yaml`)).toMatchSnapshot();
    expect(Yaml.load(`file://${__dirname}/fixtures/sample.yaml`)).toMatchSnapshot();
  });

  test('from url', () => {
    expect(Yaml.load(`https://raw.githubusercontent.com/kubernetes/examples/52158f68ddc508eac9f15a9bb7260b838e644c9f/guestbook/all-in-one/guestbook-all-in-one.yaml`)).toMatchSnapshot();
  });
});
