import { Lazy } from '../src';
import { resolve } from '../src/_tokens';

test('lazy', () => {

  const hello = {
    number: Lazy.numberValue(() => 1234),
    string: Lazy.stringValue(() => 'hello'),
  };

  expect(resolve(hello)).toStrictEqual({
    number: 1234,
    string: 'hello',
  });
});
