import { NameOptions, Names } from '../src/names';
import { createTree } from './util';

const toDnsName = (path: string, options: NameOptions = { }) => Names.toDnsLabel(createTree(path), options);
const toLabelValue = (path: string, options: NameOptions = { }) => Names.toLabelValue(createTree(path), options);

describe('toDnsLabel', () => {
  test('ignores default children', () => {
    expect(toDnsName('hello/default/foo/world/default')).toEqual('hello-foo-world-c8ceb89a');
    expect(toDnsName('hello/resource/foo/world/resource')).toEqual('hello-foo-world-c8c051a2');
    expect(toDnsName('hello/resource/foo/world/default')).toEqual('hello-foo-world-c8285558');
    expect(toDnsName('hello/Resource/foo/world/Default')).toEqual('hello-foo-world-c8455d08');
    expect(toDnsName('hello/default/foo/world/resource')).toEqual('hello-foo-world-c83a0f50');
    expect(toDnsName('resource/default')).toEqual('c818ce2d');
  });

  test('normalize to dns_name', () => {
    expect(toDnsName('Hello')).toEqual('hello-c8a347e4');
    expect(toDnsName('hey*')).toEqual('hey-c808ed9e');
    expect(toDnsName('not allowed')).toEqual('notallowed-c82fed05');
  });

  test('maximum length for a single term', () => {
    expect(toDnsName('1234567890abcdef', { maxLen: 15 })).toEqual('123456-c85fab94');
    expect(toDnsName('x' + 'a'.repeat(64))).toEqual('xaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-c86953f2');
  });

  test('single term is not decorated with a hash', () => {
    expect(toDnsName('foo')).toEqual('foo');
    expect(toDnsName('foo-bar-123-455')).toEqual('foo-bar-123-455');
    expect(toDnsName('z'.repeat(63))).toEqual('z'.repeat(63));
  });

  test('multiple terms are separated by "." and a hash is appended', () => {
    expect(toDnsName('hello-foo-world')).toEqual('hello-foo-world'); // this is actually a single term
    expect(toDnsName('hello-hello-foo-world')).toEqual('hello-hello-foo-world'); // intentionally duplicated
    expect(toDnsName('hello-foo/world')).toEqual('hello-foo-world-c83c4a8a'); // two terms
    expect(toDnsName('hello-foo/foo')).toEqual('hello-foo-foo-c884a60a'); // two terms, intentionally duplicated
    expect(toDnsName('hello/foo/world')).toEqual('hello-foo-world-c89b166b'); // three terms
  });

  test('invalid max length (minimum is 8 - for hash)', () => {
    const expected = /minimum max length for object names is 8/;
    expect(() => toDnsName('foo', { maxLen: 4 })).toThrow(expected);
    expect(() => toDnsName('foo', { maxLen: 7 })).toThrow(expected);

    // these are ok
    expect(toDnsName('foo', { maxLen: 8 })).toEqual('foo');
    expect(toDnsName('foo', { maxLen: 9 })).toEqual('foo');
  });

  test('omit duplicate components in names', () => {
    expect(toDnsName('hello/hello/foo/world')).toEqual('hello-foo-world-c8538d75');
    expect(toDnsName('hello/hello/hello/foo/world')).toEqual('hello-foo-world-c815bea4');
    expect(toDnsName('hello/hello/hello/hello/hello')).toEqual('hello-c830c284');
    expect(toDnsName('hello/cool/cool/cool/cool')).toEqual('hello-cool-c816948a');
    expect(toDnsName('hello/world/world/world/cool')).toEqual('hello-world-cool-c8e259cb');
  });

  test('trimming (prioritize last component)', () => {
    expect(toDnsName('hello/world', { maxLen: 8 })).toEqual('c85bc96a');
    expect(toDnsName('hello/world/this/is/cool', { maxLen: 8 })).toEqual('c80ec725');
    expect(toDnsName('hello/world/this/is/cool', { maxLen: 12 })).toEqual('coo-c80ec725');
    expect(toDnsName('hello/hello/this/is/cool', { maxLen: 12 })).toEqual('coo-c812c430');
    expect(toDnsName('hello/cool/cool/cool/cool', { maxLen: 15 })).toEqual('h-cool-c816948a');
    expect(toDnsName('hello/world/this/is/cool', { maxLen: 14 })).toEqual('cool-c80ec725');
    expect(toDnsName('hello/world/this/is/cool', { maxLen: 15 })).toEqual('i-cool-c80ec725');
    expect(toDnsName('hello/world/this/is/cool', { maxLen: 25 })).toEqual('wor-this-is-cool-c80ec725');
  });

  test('filter empty components', () => {
    expect(toDnsName('hello/world---this-is-cool---')).toEqual('hello-world-this-is-cool-c88665d5');
    expect(toDnsName('hello-world-this-is-cool')).toEqual('hello-world-this-is-cool');
    expect(toDnsName('hello/world-this/is-cool')).toEqual('hello-world-this-is-cool-c81c7478');
  });

  test('optional hash', () => {
    expect(toDnsName('hello/default/foo/world/resource', { includeHash: false })).toEqual('hello-foo-world');
    expect(toDnsName('hello/world/this/is/cool', { includeHash: false, maxLen: 8 })).toEqual('is-cool');
  });
});

describe('toLabel', () => {

  test('ignores default children', () => {
    expect(toLabelValue('hello/default/foo/world/default')).toEqual('hello-foo-world-c8ceb89a');
    expect(toLabelValue('hello/resource/foo/world/resource')).toEqual('hello-foo-world-c8c051a2');
    expect(toLabelValue('hello/resource/foo/world/default')).toEqual('hello-foo-world-c8285558');
    expect(toLabelValue('hello/Resource/foo/world/Default')).toEqual('hello-foo-world-c8455d08');
    expect(toLabelValue('hello/default/foo/world/resource')).toEqual('hello-foo-world-c83a0f50');
    expect(toLabelValue('resource/default')).toEqual('c818ce2d');
  });

  test('normalize to dns_name', () => {
    expect(toLabelValue('Hello')).toEqual('Hello'); // Upper case is allowed for a label
    expect(toLabelValue('hey*')).toEqual('hey-c808ed9e');
    expect(toLabelValue('not allowed')).toEqual('notallowed-c82fed05');
  });

  test('maximum length for a single term', () => {
    expect(toLabelValue('1234567890abcdef', { maxLen: 15, delimiter: '-' })).toEqual('123456-c85fab94');
    expect(toLabelValue('x' + 'a'.repeat(64))).toEqual('xaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-c86953f2');
  });

  test('single term is not decorated with a hash', () => {
    expect(toLabelValue('foo')).toEqual('foo');
    expect(toLabelValue('foo-bar-123-455')).toEqual('foo-bar-123-455');
    expect(toLabelValue('z'.repeat(63))).toEqual('z'.repeat(63));
  });

  test('multiple terms are separated by "." and a hash is appended', () => {
    expect(toLabelValue('hello-foo-world')).toEqual('hello-foo-world'); // this is actually a single term
    expect(toLabelValue('hello-hello-foo-world')).toEqual('hello-hello-foo-world'); // intentionally duplicated
    expect(toLabelValue('hello-foo/world')).toEqual('hello-foo-world-c83c4a8a'); // two terms
    expect(toLabelValue('hello-foo/foo')).toEqual('hello-foo-foo-c884a60a'); // two terms, intentionally duplicated
    expect(toLabelValue('hello/foo/world')).toEqual('hello-foo-world-c89b166b'); // three terms
  });

  test('invalid max length (minimum is 8 - for hash)', () => {
    const expected = /minimum max length for label is 8/;
    expect(() => toLabelValue('foo', { maxLen: 4 })).toThrow(expected);
    expect(() => toLabelValue('foo', { maxLen: 7 })).toThrow(expected);

    // these are ok
    expect(toLabelValue('foo', { maxLen: 8 })).toEqual('foo');
    expect(toLabelValue('foo', { maxLen: 9 })).toEqual('foo');
  });

  test('omit duplicate components in names', () => {
    expect(toLabelValue('hello/hello/foo/world')).toEqual('hello-foo-world-c8538d75');
    expect(toLabelValue('hello/hello/hello/foo/world')).toEqual('hello-foo-world-c815bea4');
    expect(toLabelValue('hello/hello/hello/hello/hello')).toEqual('hello-c830c284');
    expect(toLabelValue('hello/cool/cool/cool/cool')).toEqual('hello-cool-c816948a');
    expect(toLabelValue('hello/world/world/world/cool')).toEqual('hello-world-cool-c8e259cb');
  });

  test('trimming (prioritize last component)', () => {
    expect(toLabelValue('hello/world', { maxLen: 8 })).toEqual('c85bc96a');
    expect(toLabelValue('hello/world/this/is/cool', { maxLen: 8 })).toEqual('c80ec725');
    expect(toLabelValue('hello/world/this/is/cool', { maxLen: 12 })).toEqual('coo-c80ec725');
    expect(toLabelValue('hello/hello/this/is/cool', { maxLen: 12 })).toEqual('coo-c812c430');
    expect(toLabelValue('hello/cool/cool/cool/cool', { maxLen: 15 })).toEqual('h-cool-c816948a');
    expect(toLabelValue('hello/world/this/is/cool', { maxLen: 14 })).toEqual('cool-c80ec725');
    expect(toLabelValue('hello/world/this/is/cool', { maxLen: 15 })).toEqual('i-cool-c80ec725');
    expect(toLabelValue('hello/world/this/is/cool', { maxLen: 25 })).toEqual('wor-this-is-cool-c80ec725');
  });

  test('filter empty components', () => {
    expect(toLabelValue('hello---this/is/cool/-')).toEqual('hello-this-is-cool-c83b900b');
    expect(toLabelValue('hello---this/is---/cool/-')).toEqual('hello-this-is-cool-c82d69dd');
  });

  test('optional hash', () => {
    expect(toLabelValue('hello/default/foo/world/resource', { includeHash: false })).toEqual('hello-foo-world');
    expect(toLabelValue('hello/world/this/is/cool', { includeHash: false, maxLen: 8 })).toEqual('is-cool');
  });
});