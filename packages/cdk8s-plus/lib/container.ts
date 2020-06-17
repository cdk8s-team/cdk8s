import { IConfigMap } from './config-map';
import { ISecret } from './secret';
import * as k8s from '../imports/k8s';
import { VolumeMount } from './volume-mount';
import { Volume } from './volume';

/**
 * Options to specify an envionment variable value from a ConfigMap key.
 */
export interface EnvValueFromConfigMapOptions {

  /**
   * Specify whether the ConfigMap or its key must be defined.
   *
   * @default false
   */
  readonly optional?: boolean;
}

/**
 * Options to specify an environment variable value from a Secret.
 */
export interface EnvValueFromSecretOptions {

  /**
   * Specify whether the Secret or its key must be defined.
   *
   * @default false
   */
  readonly optional?: boolean;

}

/**
 * Options to specify an environment variable value from the process environment.
 */
export interface EnvValueFromProcessOptions {

  /**
   * Specify whether the key must exist in the environment.
   * If this is set to true, and the key does not exist, an error will thrown.
   *
   * @default false
   */
  readonly required?: boolean;
}


/**
 * Utility class for creating reading env values from various sources.
 */
export class EnvValue {

  /**
   * Create a value by reading a specific key inside a config map.
   *
   * @param configMap - The config map.
   * @param key - The key to extract the value from.
   * @param options - Additional options.
   */
  public static fromConfigMap(configMap: IConfigMap, key: string, options: EnvValueFromConfigMapOptions = { }): EnvValue {
    return {
      valueFrom: {
        configMapKeyRef: {
          name: configMap.name,
          key,
          optional: options.optional,
        },
      } as k8s.EnvVarSource,
    };
  }

  /**
   * Create a by reading a specific key inside a secret.
   *
   * @param secret - The secret.
   * @param key - The key.
   * @param options - Additional options.
   */
  public static fromSecret(secret: ISecret, key: string, options: EnvValueFromSecretOptions = {}): EnvValue {
    return {
      valueFrom: {
        secretKeyRef: {
          name: secret.name,
          key,
          optional: options.optional,
        },
      } as k8s.EnvVarSource,
    };

  }

  /**
   * Create a value from the given argument.
   *
   * @param value - The value.
   */
  public static fromValue(value: string): EnvValue {
    return {
      value: value,
    };
  }

  /**
   * Create a value from a key in the current process environment.
   *
   * @param key - The key to read.
   * @param options - Additional options.
   */
  public static fromProcess(key: string, options: EnvValueFromProcessOptions = {}): EnvValue {

    const value = process.env[key];

    if (options.required && !value) {
      throw new Error(`Missing ${key} env variable`);
    }

    return EnvValue.fromValue(value!);
  }

  private constructor(public readonly value?: any, public readonly valueFrom?: any) {

  }
}

/**
 * Properties for creating a container.
 */
export interface ContainerProps {

  /**
   * Docker image name.
   */
  readonly image: string;

  /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
   *
   * @default 'main'
   */
  readonly name?: string;

  /**
   * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
   *
   * @default - No port is exposed.
   */
  readonly port?: number

  /**
   * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment.
   * If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
   * Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated.
   * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   *
   * @default - The docker image's ENTRYPOINT.
   */
  readonly command?: string[];

  /**
   * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
   *
   * @default - The container runtime's default.
   */
  readonly workingDir?: string;

  /**
   * List of environment variables to set in the container. Cannot be updated.
   *
   * @default - No environment variables.
   */
  readonly env?: { [name: string]: EnvValue }
}

/**
 * A single application container that you want to run within a pod.
 */
export class Container {

  /**
   * The port this conainer exposes.
   */
  public readonly port?: number;

  private readonly volumeMounts: VolumeMount[] = [];
  private readonly name: string;
  private readonly image: string;
  private readonly command?: string[];
  private readonly workingDir?: string;
  private readonly env: { [name: string]: EnvValue };

  constructor(props: ContainerProps) {
    this.name = props.name ?? 'main';
    this.image = props.image;
    this.port = props.port;
    this.command = props.command;
    this.env = props.env ?? { };
    this.workingDir = props.workingDir;
  }

  /**
   * Add an environment value to the container. The variable value can come
   * from various dynamic sources such a secrets of config maps.
   *
   * @see EnvValue.fromXXX
   *
   * @param name - The variable name.
   * @param value - The variable value.
   */
  public addEnv(name: string, value: EnvValue) {
    this.env[name] = value;
  }

  /**
   * Mount a volume to a specific path so that it is accessible by the container.
   * Every pod that is configured to use this container will autmoatically have access to the volume.
   *
   * @param path - The desired path in the container.
   * @param volume - The volume to mount.
   */
  public mount(path: string, volume: Volume) {
    this.volumeMounts.push({
      path: path,
      volume: volume,
    });
  }

  /**
   * @internal
   */
  public _toKube(): k8s.Container {

    const volumeMounts: k8s.VolumeMount[] = [];

    for (const volumeMount of this.volumeMounts) {
      volumeMounts.push({
        name: volumeMount.volume.name,
        mountPath: volumeMount.path,
      })
    }

    const ports = new Array<k8s.ContainerPort>();

    if (this.port) {
      ports.push({
        containerPort: this.port,
      });
    }

    return {
      name: this.name,
      image: this.image,
      ports: ports,
      volumeMounts: volumeMounts,
      command: this.command,
      workingDir: this.workingDir,
      env: renderEnv(this.env),
    }
  }

}

function renderEnv(env?: { [name: string]: EnvValue }): k8s.EnvVar[] {
  const result = new Array<k8s.EnvVar>();
  for (const [name, v] of Object.entries(env ?? {})) {
    result.push({
      name,
      value: v.value,
      valueFrom: v.valueFrom,
    });
  }
  return result;
}
