import { JsonPatch } from '../src';

describe('operation factories', () => {
  test('add()', () => {
    expect(JsonPatch.add('/foo', { hello: 1234 })._toJson()).toStrictEqual({ op: 'add', path: '/foo', value: { hello: 1234 } });
    expect(JsonPatch.add('/foo/bar', 123)._toJson()).toStrictEqual({ op: 'add', path: '/foo/bar', value: 123 });
  });

  test('remove()', () => {
    expect(JsonPatch.remove('/foo/hello/0')._toJson()).toStrictEqual({ op: 'remove', path: '/foo/hello/0' });
  });

  test('replace()', () => {
    expect(JsonPatch.replace('/foo/hello/0', { value: 1234 })._toJson()).toStrictEqual({ op: 'replace', path: '/foo/hello/0', value: { value: 1234 } });
  });

  test('copy()', () => {
    expect(JsonPatch.copy('/from', '/to')._toJson()).toStrictEqual({ op: 'copy', from: '/from', path: '/to' });
  });

  test('move()', () => {
    expect(JsonPatch.move('/from', '/to')._toJson()).toStrictEqual({ op: 'move', from: '/from', path: '/to' });
  });

  test('test()', () => {
    expect(JsonPatch.test('/path', 'value')._toJson()).toStrictEqual({ op: 'test', path: '/path', value: 'value' });
  });
});

test('apply()', () => {
  const input = {
    hello: 123,
    world: {
      foo: ['bar', 'baz'],
      hi: {
        there: 'hello-again',
      },
    },
  };

  const output = JsonPatch.apply(input,
    JsonPatch.replace('/world/hi/there', 'goodbye'),
    JsonPatch.add('/world/foo/', 'boom'),
    JsonPatch.remove('/hello'));

  expect(output).toStrictEqual({
    world: {
      foo: ['boom', 'bar', 'baz'],
      hi: {
        there: 'goodbye',
      },
    },
  });
});
