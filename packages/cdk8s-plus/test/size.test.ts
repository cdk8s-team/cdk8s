import { Size, SizeRoundingBehavior } from '../src';

test('negative amount', () => {
  expect(() => Size.kibibytes(-1)).toThrow(/negative/);
});

test('Size in kibibytes', () => {
  const size = Size.kibibytes(4_294_967_296);

  expect(size.toKibibytes()).toEqual(4_294_967_296);
  expect(size.toMebibytes()).toEqual(4_194_304);
  expect(size.toGibibytes()).toEqual(4_096);
  expect(size.toTebibytes()).toEqual(4);
  expect(() => size.toPebibytes()).toThrow(/'4294967296 kibibytes' cannot be converted into a whole number/);
  expect(size.toPebibytes({ rounding: SizeRoundingBehavior.NONE })).toBeCloseTo(4_294_967_296 / (1024 * 1024 * 1024 * 1024));

  expect(Size.kibibytes(4 * 1024 * 1024).toGibibytes()).toEqual(4);
});

test('Size in mebibytes', () => {
  const size = Size.mebibytes(4_194_304);

  expect(size.toKibibytes()).toEqual(4_294_967_296);
  expect(size.toMebibytes()).toEqual(4_194_304);
  expect(size.toGibibytes()).toEqual(4_096);
  expect(size.toTebibytes()).toEqual(4);
  expect(() => size.toPebibytes()).toThrow(/'4194304 mebibytes' cannot be converted into a whole number/);
  expect(size.toPebibytes({ rounding: SizeRoundingBehavior.NONE })).toBeCloseTo(4_194_304 / (1024 * 1024 * 1024));

  expect(Size.mebibytes(4 * 1024).toGibibytes()).toEqual(4);
});

test('Size in gibibyte', () => {
  const size = Size.gibibytes(5);

  expect(size.toKibibytes()).toEqual(5_242_880);
  expect(size.toMebibytes()).toEqual(5_120);
  expect(size.toGibibytes()).toEqual(5);
  expect(() => size.toTebibytes()).toThrow(/'5 gibibytes' cannot be converted into a whole number/);
  expect(size.toTebibytes({ rounding: SizeRoundingBehavior.NONE })).toBeCloseTo(5 / 1024);
  expect(() => size.toPebibytes()).toThrow(/'5 gibibytes' cannot be converted into a whole number/);
  expect(size.toPebibytes({ rounding: SizeRoundingBehavior.NONE })).toBeCloseTo(5 / (1024 * 1024));

  expect(Size.gibibytes(4096).toTebibytes()).toEqual(4);
});

test('Size in tebibyte', () => {
  const size = Size.tebibytes(5);

  expect(size.toKibibytes()).toEqual(5_368_709_120);
  expect(size.toMebibytes()).toEqual(5_242_880);
  expect(size.toGibibytes()).toEqual(5_120);
  expect(size.toTebibytes()).toEqual(5);
  expect(() => size.toPebibytes()).toThrow(/'5 tebibytes' cannot be converted into a whole number/);
  expect(size.toPebibytes({ rounding: SizeRoundingBehavior.NONE })).toBeCloseTo(5 / 1024);

  expect(Size.tebibytes(4096).toPebibytes()).toEqual(4);
});

test('Size in pebibyte', () => {
  const size = Size.pebibyte(5);

  expect(size.toKibibytes()).toEqual(5_497_558_138_880);
  expect(size.toMebibytes()).toEqual(5_368_709_120);
  expect(size.toGibibytes()).toEqual(5_242_880);
  expect(size.toTebibytes()).toEqual(5_120);
  expect(size.toPebibytes()).toEqual(5);
});

test('rounding behavior', () => {
  const size = Size.mebibytes(5_200);

  expect(() => size.toGibibytes()).toThrow(/cannot be converted into a whole number/);
  expect(() => size.toGibibytes({ rounding: SizeRoundingBehavior.FAIL })).toThrow(/cannot be converted into a whole number/);

  expect(size.toGibibytes({ rounding: SizeRoundingBehavior.FLOOR })).toEqual(5);
  expect(size.toTebibytes({ rounding: SizeRoundingBehavior.FLOOR })).toEqual(0);
  expect(size.toKibibytes({ rounding: SizeRoundingBehavior.FLOOR })).toBeCloseTo(5_324_800);

  expect(size.toGibibytes({ rounding: SizeRoundingBehavior.NONE })).toEqual(5.078125);
  expect(size.toTebibytes({ rounding: SizeRoundingBehavior.NONE })).toEqual(5200 / (1024 * 1024));
  expect(size.toKibibytes({ rounding: SizeRoundingBehavior.NONE })).toEqual(5_324_800);
});

