import { Names } from '../src/names';

describe('toDnsLabel', () => {
  const toDnsName = Names.toDnsLabel;
  test('ignores default children', () => {
    expect(toDnsName('hello/default/foo/world/default')).toEqual('hello-foo-world-5d193db9');
    expect(toDnsName('hello/resource/foo/world/resource')).toEqual('hello-foo-world-f5dd971f');
    expect(toDnsName('hello/resource/foo/world/default')).toEqual('hello-foo-world-2f1cee85');
    expect(toDnsName('hello/Resource/foo/world/Default')).toEqual('hello-foo-world-857189b5');
    expect(toDnsName('hello/default/foo/world/resource')).toEqual('hello-foo-world-e89fdfae');
    expect(toDnsName('resource/default')).toEqual('40b6bcd9');
  });

  test('normalize to dns_name', () => {
    expect(toDnsName(' ')).toEqual('36a9e7f1');
    expect(toDnsName('')).toEqual('e3b0c442');
    expect(toDnsName('Hello')).toEqual('hello-185f8db3');
    expect(toDnsName('hey*')).toEqual('hey-96c05e6c');
    expect(toDnsName('not allowed')).toEqual('notallowed-a26075ed');
  });

  test('maximum length for a single term', () => {
    expect(toDnsName('1234567890abcdef', 15)).toEqual('123456-8e9916c5');
    expect(toDnsName('x' + 'a'.repeat(64))).toEqual('xaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-f69f4ba1');
  });

  test('single term is not decorated with a hash', () => {
    expect(toDnsName('foo')).toEqual('foo');
    expect(toDnsName('foo-bar-123-455')).toEqual('foo-bar-123-455');
    expect(toDnsName('z'.repeat(63))).toEqual('z'.repeat(63));
  });

  test('multiple terms are separated by "." and a hash is appended', () => {
    expect(toDnsName('hello-foo-world')).toEqual('hello-foo-world'); // this is actually a single term
    expect(toDnsName('hello-hello-foo-world')).toEqual('hello-hello-foo-world'); // intentionally duplicated
    expect(toDnsName('hello-foo/world')).toEqual('hello-foo-world-54700203'); // two terms
    expect(toDnsName('hello-foo/foo')).toEqual('hello-foo-foo-e078a973'); // two terms, intentionally duplicated
    expect(toDnsName('hello/foo/world')).toEqual('hello-foo-world-4f6e4fd8'); // three terms
  });

  test('invalid max length (minimum is 8 - for hash)', () => {
    const expected = /minimum max length for object names is 8/;
    expect(() => toDnsName('foo', 4)).toThrow(expected);
    expect(() => toDnsName('foo', 7)).toThrow(expected);

    // these are ok
    expect(toDnsName('foo', 8)).toEqual('foo');
    expect(toDnsName('foo', 9)).toEqual('foo');
  });

  test('omit duplicate components in names', () => {
    expect(toDnsName('hello/hello/foo/world')).toEqual('hello-foo-world-1d4999d0');
    expect(toDnsName('hello/hello/hello/foo/world')).toEqual('hello-foo-world-d3ebcda3');
    expect(toDnsName('hello/hello/hello/hello/hello')).toEqual('hello-456bb9d7');
    expect(toDnsName('hello/cool/cool/cool/cool')).toEqual('hello-cool-83150e81');
    expect(toDnsName('hello/world/world/world/cool')).toEqual('hello-world-cool-0148a798');
  });

  test('trimming (prioritize last component)', () => {
    expect(toDnsName('hello/world', 8)).toEqual('761e91eb');
    expect(toDnsName('hello/world/this/is/cool', 8)).toEqual('a7c39f00');
    expect(toDnsName('hello/world/this/is/cool', 12)).toEqual('coo-a7c39f00');
    expect(toDnsName('hello/hello/this/is/cool', 12)).toEqual('coo-8751188b');
    expect(toDnsName('hello/cool/cool/cool/cool', 15)).toEqual('h-cool-83150e81');
    expect(toDnsName('hello/world/this/is/cool', 14)).toEqual('cool-a7c39f00');
    expect(toDnsName('hello/world/this/is/cool', 15)).toEqual('i-cool-a7c39f00');
    expect(toDnsName('hello/world/this/is/cool', 25)).toEqual('wor-this-is-cool-a7c39f00');
  });

  test('filter empty components', () => {
    expect(toDnsName('hello//world---this-is-cool---')).toEqual('hello-world-this-is-cool-52f679f4');
    expect(toDnsName('hello-world-this-is-cool')).toEqual('hello-world-this-is-cool');
    expect(toDnsName('hello/world-this//is-cool')).toEqual('hello-world-this-is-cool-b6e3e997');
  });
});

describe('toLabel', () => {
  const toLabelValue = Names.toLabelValue;

  test('normalize to dns_name', () => {
    expect(toLabelValue(' ')).toEqual('36a9e7f1');
    expect(toLabelValue('')).toEqual(''); // Empty label is allowed for a label value
    expect(toLabelValue('Hello')).toEqual('Hello'); // Upper case is allowed for a label
    expect(toLabelValue('hey*')).toEqual('hey-96c05e6c');
    expect(toLabelValue('not allowed')).toEqual('notallowed-a26075ed');
  });

  test('maximum length for a single term', () => {
    expect(toLabelValue('1234567890abcdef', '-', 15)).toEqual('123456-8e9916c5');
    expect(toLabelValue('x' + 'a'.repeat(64))).toEqual('xaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-f69f4ba1');
  });

  test('single term is not decorated with a hash', () => {
    expect(toLabelValue('foo')).toEqual('foo');
    expect(toLabelValue('foo-bar-123-455')).toEqual('foo-bar-123-455');
    expect(toLabelValue('z'.repeat(63))).toEqual('z'.repeat(63));
  });

  test('multiple terms are separated by "." and a hash is appended', () => {
    expect(toLabelValue('hello-foo-world')).toEqual('hello-foo-world'); // this is actually a single term
    expect(toLabelValue('hello-hello-foo-world')).toEqual('hello-hello-foo-world'); // intentionally duplicated
    expect(toLabelValue('hello-foo/world')).toEqual('hello-foo-world-54700203'); // two terms
    expect(toLabelValue('hello-foo/foo')).toEqual('hello-foo-foo-e078a973'); // two terms, intentionally duplicated
    expect(toLabelValue('hello/foo/world')).toEqual('hello-foo-world-4f6e4fd8'); // three terms
  });

  test('invalid max length (minimum is 8 - for hash)', () => {
    const expected = /minimum max length for label is 8/;
    expect(() => toLabelValue('foo', '-', 4)).toThrow(expected);
    expect(() => toLabelValue('foo', '-', 7)).toThrow(expected);

    // these are ok
    expect(toLabelValue('foo', '-', 8)).toEqual('foo');
    expect(toLabelValue('foo', '-', 9)).toEqual('foo');
  });

  test('omit duplicate components in names', () => {
    expect(toLabelValue('hello/hello/foo/world')).toEqual('hello-foo-world-1d4999d0');
    expect(toLabelValue('hello/hello/hello/foo/world')).toEqual('hello-foo-world-d3ebcda3');
    expect(toLabelValue('hello/hello/hello/hello/hello')).toEqual('hello-456bb9d7');
    expect(toLabelValue('hello/cool/cool/cool/cool')).toEqual('hello-cool-83150e81');
    expect(toLabelValue('hello/world/world/world/cool')).toEqual('hello-world-cool-0148a798');
  });

  test('trimming (prioritize last component)', () => {
    expect(toLabelValue('hello/world', '-', 8)).toEqual('761e91eb');
    expect(toLabelValue('hello/world/this/is/cool', '-', 8)).toEqual('a7c39f00');
    expect(toLabelValue('hello/world/this/is/cool', '-', 12)).toEqual('coo-a7c39f00');
    expect(toLabelValue('hello/hello/this/is/cool', '-', 12)).toEqual('coo-8751188b');
    expect(toLabelValue('hello/cool/cool/cool/cool', '-', 15)).toEqual('h-cool-83150e81');
    expect(toLabelValue('hello/world/this/is/cool', '-', 14)).toEqual('cool-a7c39f00');
    expect(toLabelValue('hello/world/this/is/cool', '-', 15)).toEqual('i-cool-a7c39f00');
    expect(toLabelValue('hello/world/this/is/cool', '-', 25)).toEqual('wor-this-is-cool-a7c39f00');
  });

  test('filter empty components', () => {
    expect(toLabelValue('hello---this/is//cool//-')).toEqual('hello-this-is-cool-dfb4c573');
    expect(toLabelValue('hello---this/is---//cool////-')).toEqual('hello-this-is-cool-84d02267');
  });
});