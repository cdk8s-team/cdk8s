import { Duration } from 'cdk8s';
import { Container, Probe } from '../src';

describe('fromHttpGet()', () => {
  test('defaults to the container port', () => {
    // GIVEN
    const container = new Container({ image: 'foobar', port: 5555 });

    // WHEN
    const min = Probe.fromHttpGet('/hello');

    // THEN
    expect(min._toKube(container)).toEqual({
      failureThreshold: 3,
      httpGet: {
        path: '/hello',
        port: 5555,
      },
      initialDelaySeconds: undefined,
      periodSeconds: undefined,
      successThreshold: undefined,
      timeoutSeconds: undefined,
    });
  });

  test('specific port', () => {
    // GIVEN
    const container = new Container({ image: 'foobar', port: 5555 });

    // WHEN
    const min = Probe.fromHttpGet('/hello', { port: 5555 });

    // THEN
    expect(min._toKube(container)).toEqual({
      failureThreshold: 3,
      httpGet: {
        path: '/hello',
        port: 5555,
      },
      initialDelaySeconds: undefined,
      periodSeconds: undefined,
      successThreshold: undefined,
      timeoutSeconds: undefined,
    });
  });

  test('specific port by name', () => {
    // GIVEN
    const container = new Container({
      image: 'foobar',
      ports: [{
        port: 5555,
        name: 'port',
      }],
    });

    // WHEN
    const min = Probe.fromHttpGet('/hello', { port: 'port' });

    // THEN
    expect(min._toKube(container)).toEqual({
      failureThreshold: 3,
      httpGet: {
        path: '/hello',
        port: 'port',
      },
      initialDelaySeconds: undefined,
      periodSeconds: undefined,
      successThreshold: undefined,
      timeoutSeconds: undefined,
    });
  });

  test('cannot probe on not exposed port', () => {
    // GIVEN
    const container = new Container({ image: 'foobar', port: 5555 });

    // WHEN
    const min = Probe.fromHttpGet('/hello', { port: 1234 });

    // THEN
    expect(() => min._toKube(container)).toThrow();
  });

  test('options', () => {
    // GIVEN
    const container = new Container({ image: 'foobar', port: 5555 });

    // WHEN
    const min = Probe.fromHttpGet('/hello', {
      failureThreshold: 11,
      initialDelaySeconds: Duration.minutes(1),
      periodSeconds: Duration.seconds(5),
      successThreshold: 3,
      timeoutSeconds: Duration.minutes(2),
    });

    // THEN
    expect(min._toKube(container)).toEqual({
      httpGet: {
        path: '/hello',
        port: 5555,
      },
      failureThreshold: 11,
      initialDelaySeconds: 60,
      periodSeconds: 5,
      successThreshold: 3,
      timeoutSeconds: 120,
    });
  });

});

describe('fromCommand()', () => {

  test('minimal usage', () => {
    // GIVEN
    const container = new Container({ image: 'foobar', port: 5555 });

    // WHEN
    const min = Probe.fromCommand(['foo', 'bar']);

    // THEN
    expect(min._toKube(container)).toEqual({
      exec: { command: ['foo', 'bar'] },
      failureThreshold: 3,
      initialDelaySeconds: undefined,
      periodSeconds: undefined,
      successThreshold: undefined,
      timeoutSeconds: undefined,
    });
  });

  test('options', () => {
    // GIVEN
    const container = new Container({ image: 'foobar', port: 5555 });

    // WHEN
    const min = Probe.fromCommand(['foo', 'bar'], {
      failureThreshold: 11,
      initialDelaySeconds: Duration.minutes(1),
      periodSeconds: Duration.seconds(5),
      successThreshold: 3,
      timeoutSeconds: Duration.minutes(2),
    });

    // THEN
    expect(min._toKube(container)).toEqual({
      exec: { command: ['foo', 'bar'] },
      failureThreshold: 11,
      initialDelaySeconds: 60,
      periodSeconds: 5,
      successThreshold: 3,
      timeoutSeconds: 120,
    });
  });

});