import { Lazy } from '../src';
import { resolve } from '../src/lazy';

test('lazy', () => {

  const hello = {
    number: Lazy.number({ produce: () => 1234 }),
    string: Lazy.string({ produce: () => 'hello' }),
    stringList: Lazy.stringList({ produce: () => ['1', '2'] }),
    any: Lazy.any({ produce: () => { return {foo: 'bar'}} }),
  };

  expect(resolve(hello)).toStrictEqual({
    number: 1234,
    string: 'hello',
    stringList: ['1', '2'],
    any: { foo: 'bar' },
  });
});
