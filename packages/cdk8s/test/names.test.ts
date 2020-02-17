import { renderObjectName } from "../lib/names";

test('allowed characters', () => {
  const expected = /is not a valid object name/;
  expect(() => renderObjectName(' ')).toThrow(expected);
  expect(() => renderObjectName('')).toThrow(expected);
  expect(() => renderObjectName('Hello')).toThrow(expected);
  expect(() => renderObjectName('hey*')).toThrow(expected);
  expect(() => renderObjectName('not allowed')).toThrow(expected);
});

test('maximum length for a single term', () => {
  expect(() => renderObjectName('1234567890a', 10)).toThrow(/Maximum allowed length is 10/);
  expect(() => renderObjectName('a'.repeat(254))).toThrow(/Maximum allowed length is 253/);
});

test('single term is not decorated with a hash', () => {
  expect(renderObjectName('foo')).toEqual('foo');
  expect(renderObjectName('foo-bar-123.455')).toEqual('foo-bar-123.455');
  expect(renderObjectName('z'.repeat(253))).toEqual('z'.repeat(253));
});

test('multiple terms are separated by "." and a hash is appended', () => {
  expect(renderObjectName('hello-foo.world')).toEqual('hello-foo.world'); // this is actually a single term
  expect(renderObjectName('hello-foo/world')).toEqual('hello-foo.world.54700203'); // two terms
  expect(renderObjectName('hello/foo/world')).toEqual('hello.foo.world.4f6e4fd8'); // three terms
});

test('invalid max length (minimum is 8 - for hash)', () => {
  const expected = /minimum max length for object names is 8/;
  expect(() => renderObjectName('foo', 4)).toThrow(expected);
  expect(() => renderObjectName('foo', 7)).toThrow(expected);

  // these are ok
  expect(renderObjectName('foo', 8)).toEqual('foo');
  expect(renderObjectName('foo', 9)).toEqual('foo');
});

test('trimming (prioritize last component)', () => {
  expect(renderObjectName('hello/world', 8)).toEqual('761e91eb');
  expect(renderObjectName('hello/world/this/is/cool', 8)).toEqual('a7c39f00');
  expect(renderObjectName('hello/world/this/is/cool', 12)).toEqual('coo.a7c39f00');
  expect(renderObjectName('hello/world/this/is/cool', 14)).toEqual('.cool.a7c39f00');
  expect(renderObjectName('hello/world/this/is/cool', 15)).toEqual('i.cool.a7c39f00');
  expect(renderObjectName('hello/world/this/is/cool', 25)).toEqual('wor.this.is.cool.a7c39f00');
});

