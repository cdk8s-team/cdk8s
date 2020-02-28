import { Names } from "../lib/names";

const toDnsName = Names.toDnsLabel;

test('allowed characters', () => {
  const expected = /is not a valid object name/;
  expect(() => toDnsName(' ')).toThrow(expected);
  expect(() => toDnsName('')).toThrow(expected);
  expect(() => toDnsName('Hello')).toThrow(expected);
  expect(() => toDnsName('hey*')).toThrow(expected);
  expect(() => toDnsName('not allowed')).toThrow(expected);
});

test('maximum length for a single term', () => {
  expect(() => toDnsName('1234567890a', 10)).toThrow(/Maximum allowed length is 10/);
  expect(() => toDnsName('a'.repeat(64))).toThrow(/Maximum allowed length is 63/);
});

test('single term is not decorated with a hash', () => {
  expect(toDnsName('foo')).toEqual('foo');
  expect(toDnsName('foo-bar-123-455')).toEqual('foo-bar-123-455');
  expect(toDnsName('z'.repeat(63))).toEqual('z'.repeat(63));
});

test('multiple terms are separated by "." and a hash is appended', () => {
  expect(toDnsName('hello-foo-world')).toEqual('hello-foo-world'); // this is actually a single term
  expect(toDnsName('hello-foo/world')).toEqual('hello-foo-world-54700203'); // two terms
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

test('trimming (prioritize last component)', () => {
  expect(toDnsName('hello/world', 8)).toEqual('761e91eb');
  expect(toDnsName('hello/world/this/is/cool', 8)).toEqual('a7c39f00');
  expect(toDnsName('hello/world/this/is/cool', 12)).toEqual('coo-a7c39f00');
  expect(toDnsName('hello/world/this/is/cool', 14)).toEqual('cool-a7c39f00');
  expect(toDnsName('hello/world/this/is/cool', 15)).toEqual('i-cool-a7c39f00');
  expect(toDnsName('hello/world/this/is/cool', 25)).toEqual('wor-this-is-cool-a7c39f00');
});

