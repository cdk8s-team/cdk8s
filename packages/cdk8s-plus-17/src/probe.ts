import { Duration } from 'cdk8s';
import { Container } from './container';
import { ContainerPort } from './container-port';
import * as k8s from './imports/k8s';

/**
 * Probe options.
 */
export interface ProbeOptions {
  /**
   * Minimum consecutive failures for the probe to be considered failed after
   * having succeeded.
   *
   * Defaults to 3. Minimum value is 1.
   *
   * @default 3
   */
  readonly failureThreshold?: number;

  /**
   * Number of seconds after the container has started before liveness probes
   * are initiated.
   *
   * @see https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @default - immediate
   */
  readonly initialDelaySeconds?: Duration;

  /**
   * How often (in seconds) to perform the probe.
   *
   * Default to 10 seconds. Minimum value is 1.
   *
   * @default Duration.seconds(10) Minimum value is 1.
   */
  readonly periodSeconds?: Duration;

  /**
   * Minimum consecutive successes for the probe to be considered successful
   * after having failed. Defaults to 1.
   *
   * Must be 1 for liveness and startup. Minimum value is 1.
   *
   * @default 1 Must be 1 for liveness and startup. Minimum value is 1.
   */
  readonly successThreshold?: number;

  /**
   * Number of seconds after which the probe times out.
   *
   * Defaults to 1 second. Minimum value is 1.
   *
   * @see https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @default Duration.seconds(1)
   */
  readonly timeoutSeconds?: Duration;
}

/**
 * Options for `Probe.fromHttpGet()`.
 */
export interface HttpGetProbeOptions extends ProbeOptions {
  /**
   * The TCP port to use when sending the GET request.
   *
   * @default - defaults to `container.port`.
   */
  readonly port?: number | string | ContainerPort;
}

/**
 * Options for `Probe.fromCommand()`.
 */
export interface CommandProbeOptions extends ProbeOptions {

}

/**
 * Probe describes a health check to be performed against a container to
 * determine whether it is alive or ready to receive traffic.
 */
export abstract class Probe {

  /**
   * Defines a probe based on an HTTP GET request to the IP address of the container.
   *
   * @param path The URL path to hit
   * @param options Options
   */
  public static fromHttpGet(path: string, options: HttpGetProbeOptions = { }): Probe {
    return {
      _toKube(container) {
        let port: number | string;
        if (options.port !== undefined) {
          port = container.lookupPort(options.port, true).nameOrPort();
        } else {
          port = container.ports[0]?.nameOrPort() ?? 80;
        }
        return {
          ...parseProbeOptions(options),
          httpGet: { path, port },
        };
      },
    };
  }

  /**
   * Defines a probe based on a command which is executed within the container.
   *
   * @param command The command to execute
   * @param options Options
   */
  public static fromCommand(command: string[], options: CommandProbeOptions = { }): Probe {
    return {
      _toKube: _ => ({
        ...parseProbeOptions(options),
        exec: { command },
      }),
    };
  }

  /**
   * @internal
   */
  public abstract _toKube(container: Container): k8s.Probe;
}

function parseProbeOptions(options: ProbeOptions = {}): k8s.Probe {
  return {
    failureThreshold: options.failureThreshold ?? 3,
    initialDelaySeconds: options.initialDelaySeconds ? options.initialDelaySeconds.toSeconds() : undefined,
    periodSeconds: options.periodSeconds ? options.periodSeconds.toSeconds() : undefined,
    successThreshold: options.successThreshold,
    timeoutSeconds: options.timeoutSeconds ? options.timeoutSeconds.toSeconds() : undefined,
  };
}