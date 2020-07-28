import { Duration } from '../src';
import { Lazy } from 'constructs-tokens-staging';

test('negative amount', () => {
  expect(() => Duration.seconds(-1)).toThrow(/negative/);
});

test('Duration in seconds', () => {
  const duration = Duration.seconds(300);
  expect(duration.toSeconds()).toBe(300);
  expect(duration.toMinutes()).toBe(5);
  expect(() => duration.toDays()).toThrow(/'300 seconds' cannot be converted into a whole number of days/);
  expect(duration.toDays({ integral: false })).toBeCloseTo(300 / 86_400);
  expect(Duration.seconds(60 * 60 * 24).toDays()).toBe(1);
});

test('Duration in minutes', () => {
  const duration = Duration.minutes(5);

  expect(duration.toSeconds()).toBe(300);
  expect(duration.toMinutes()).toBe(5);
  expect(() => duration.toDays()).toThrow(/'5 minutes' cannot be converted into a whole number of days/);
  expect(duration.toDays({ integral: false })).toBeCloseTo(300 / 86_400);
  expect(Duration.minutes(60 * 24).toDays()).toBe(1);
});

test('Duration in hours', () => {
  const duration = Duration.hours(5);

  expect(duration.toSeconds()).toBe(18_000);
  expect(duration.toMinutes()).toBe(300);
  expect(() => duration.toDays()).toThrow(/'5 hours' cannot be converted into a whole number of days/);
  expect(duration.toDays({ integral: false })).toBeCloseTo(5 / 24);
  expect(Duration.hours(24).toDays()).toBe(1);
});

test('seconds to milliseconds', () => {
  const duration = Duration.seconds(5);
  expect(duration.toMilliseconds()).toBe(5_000);
});

test('Duration in days', () => {
  const duration = Duration.days(1);
  expect(duration.toSeconds()).toBe(86_400);
  expect(duration.toMinutes()).toBe(1_440);
  expect(duration.toDays()).toBe(1);
});

test('toISOString', () => {
  expect(Duration.seconds(0).toISOString()).toBe('PT0S');
  expect(Duration.minutes(0).toISOString()).toBe('PT0S');
  expect(Duration.hours(0).toISOString()).toBe('PT0S');
  expect(Duration.days(0).toISOString()).toBe('PT0S');

  expect(Duration.seconds(5).toISOString()).toBe('PT5S');
  expect(Duration.minutes(5).toISOString()).toBe('PT5M');
  expect(Duration.hours(5).toISOString()).toBe('PT5H');
  expect(Duration.days(5).toISOString()).toBe('PT5D');

  expect(Duration.seconds(1 + 60 * (1 + 60 * (1 + 24))).toISOString()).toBe('PT1D1H1M1S');
});

test('toIsoString', () => {
  expect(Duration.seconds(0).toIsoString()).toBe('PT0S');
  expect(Duration.minutes(0).toIsoString()).toBe('PT0S');
  expect(Duration.hours(0).toIsoString()).toBe('PT0S');
  expect(Duration.days(0).toIsoString()).toBe('PT0S');

  expect(Duration.seconds(5).toIsoString()).toBe('PT5S');
  expect(Duration.minutes(5).toIsoString()).toBe('PT5M');
  expect(Duration.hours(5).toIsoString()).toBe('PT5H');
  expect(Duration.days(5).toIsoString()).toBe('PT5D');

  expect(Duration.seconds(1 + 60 * (1 + 60 * (1 + 24))).toIsoString()).toBe('PT1D1H1M1S');
});

test('parse', () => {
  expect(Duration.parse('PT0S').toSeconds()).toBe(0);
  expect(Duration.parse('PT0M').toSeconds()).toBe(0);
  expect(Duration.parse('PT0H').toSeconds()).toBe(0);
  expect(Duration.parse('PT0D').toSeconds()).toBe(0);

  expect(Duration.parse('PT5S').toSeconds()).toBe(5);
  expect(Duration.parse('PT5M').toSeconds()).toBe(300);
  expect(Duration.parse('PT5H').toSeconds()).toBe(18_000);
  expect(Duration.parse('PT5D').toSeconds()).toBe(432_000);

  expect(Duration.parse('PT1D1H1M1S').toSeconds()).toBe(1 + 60 * (1 + 60 * (1 + 24)));
});

test('to human string', () => {
  expect(Duration.minutes(0).toHumanString()).toBe('0 minutes');
  expect(Duration.minutes(Lazy.numberValue({ produce: () => 5 })).toHumanString()).toBe('<token> minutes');

  expect(Duration.minutes(10).toHumanString()).toBe('10 minutes');
  expect(Duration.minutes(1).toHumanString()).toBe('1 minute');

  expect(Duration.minutes(62).toHumanString()).toBe('1 hour 2 minutes');

  expect(Duration.seconds(3666).toHumanString()).toBe('1 hour 1 minute');

  expect(Duration.millis(3000).toHumanString()).toBe('3 seconds');
  expect(Duration.millis(3666).toHumanString()).toBe('3 seconds 666 millis');

  expect(Duration.millis(3.6).toHumanString()).toBe('3.6 millis');
});
