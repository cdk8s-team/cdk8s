import { sanitizeValue } from '../src/_util';

describe('sanitizeValue', () => {

  test('default options', () => {
    expect(sanitizeValue(null)).toBe(undefined);
    expect(sanitizeValue(undefined)).toBe(undefined);
    expect(sanitizeValue({ })).toStrictEqual({ });
    expect(sanitizeValue([])).toStrictEqual([]);
    expect(sanitizeValue(1)).toBe(1);
    expect(sanitizeValue({ hello: 123 })).toStrictEqual({ hello: 123 });
    expect(sanitizeValue([1, 2, 3])).toStrictEqual([1, 2, 3]);
    expect(sanitizeValue({ xoo: 123, foo: [] })).toStrictEqual({ xoo: 123, foo: [] });
    expect(sanitizeValue({ xoo: { }, foo: { bar: { zoo: undefined, hey: { }, me: 123 } } }))
      .toStrictEqual({ xoo: { }, foo: { bar: { hey: { }, me: 123 } } });
    expect(sanitizeValue({ xoo: 123, foo: [1, 2, { foo: 123, bar: undefined, zoo: [] }, 3] }))
      .toStrictEqual({ xoo: 123, foo: [1, 2, { foo: 123, zoo: [] }, 3] });
    expect(sanitizeValue([1, 2, 3, [], { }, 4])).toStrictEqual([1, 2, 3, [], { }, 4]); // special case

    expect(() => sanitizeValue(new Dummy())).toThrow(/can't render non-simple object of type 'Dummy'/);
  });

  test('filterEmptyArrays', () => {
    const options = {
      filterEmptyArrays: true,
    };

    expect(sanitizeValue([], options)).toBe(undefined);
    expect(sanitizeValue({ foo: [], bar: [1, 2] }, options)).toStrictEqual({ bar: [1, 2] });
    expect(sanitizeValue({ foo: { bar: [] } }, options)).toStrictEqual({ foo: { } });
  });

  test('filterEmptyObjects', () => {
    const options = {
      filterEmptyObjects: true,
    };

    expect(sanitizeValue({ }, options)).toBe(undefined);
    expect(sanitizeValue({ foo: { }, bar: { hey: 'there' } }, options)).toStrictEqual({ bar: { hey: 'there' } });
    expect(sanitizeValue({ foo: { bar: { } } }, options)).toStrictEqual(undefined);
  });

  test('sortKeys', () => {
    const input = { zzz: 999, aaa: 111, nested: { foo: { zag: [1, 2, 3], bar: '1111' } } };
    expect(str(sanitizeValue(input))).toMatchSnapshot();
    expect(str(sanitizeValue(input, { sortKeys: false }))).toMatchSnapshot();
  });

  class Dummy { }
});

function str(obj: any) {
  return JSON.stringify(obj, undefined, 2);
}