import { removeEmpty } from "../lib/util";

test('removeEmpty', () => {

  expect(removeEmpty(null)).toBe(undefined);
  expect(removeEmpty(undefined)).toBe(undefined);
  expect(removeEmpty({ })).toBe(undefined);
  expect(removeEmpty([ ])).toBe(undefined);
  expect(removeEmpty(1)).toBe(1);
  expect(removeEmpty({ hello: 123 })).toStrictEqual({ hello: 123 });
  expect(removeEmpty([ 1, 2, 3 ])).toStrictEqual([ 1, 2, 3 ]);
  expect(removeEmpty({ xoo: 123, foo: [] })).toStrictEqual({ xoo: 123 });
  expect(removeEmpty({ xoo: { }, foo: { bar: { zoo: undefined, hey: { }, me: 123 }} })).toStrictEqual({ foo: { bar: { me: 123 } } });
  expect(removeEmpty({ xoo: 123, foo: [ 1, 2, { foo: 123, bar: undefined, zoo: [] }, 3 ] })).toStrictEqual({ xoo: 123, foo: [ 1, 2, { foo: 123 }, 3 ] });
  expect(removeEmpty([ 1, 2, 3, [ ], { }, 4 ])).toStrictEqual([ 1, 2, 3, [ ], { }, 4 ]); // special case

});