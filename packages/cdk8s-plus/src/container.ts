import { IConfigMap } from './config-map';
import { ISecret } from './secret';
import * as k8s from './imports/k8s';
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

    const source: k8s.EnvVarSource = {
      configMapKeyRef: {
        name: configMap.name,
        key,
        optional: options.optional,
      },
    };
    return new EnvValue(undefined, source);
  }

  /**
   * Create a by reading a specific key inside a secret.
   *
   * @param secret - The secret.
   * @param key - The key.
   * @param options - Additional options.
   */
  public static fromSecret(secret: ISecret, key: string, options: EnvValueFromSecretOptions = {}): EnvValue {

    const source: k8s.EnvVarSource = {
      secretKeyRef: {
        name: secret.name,
        key,
        optional: options.optional,
      },
    };

    return new EnvValue(undefined, source);
  }

  /**
   * Create a value from the given argument.
   *
   * @param value - The value.
   */
  public static fromValue(value: string): EnvValue {
    return new EnvValue(value);
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

  private constructor(public readonly value?: any, public readonly valueFrom?: any) {}
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
  readonly env?: { [name: string]: EnvValue };

  /**
   * Pod volumes to mount into the container's filesystem. Cannot be updated.
   */
  readonly volumeMounts?: VolumeMount[];
}

/**
 * A single application container that you want to run within a pod.
 */
export class Container {

  /**
   * The port this container exposes.
   */
  public readonly port?: number;

  /**
   * Volume mounts configured for this container.
   */
  public readonly mounts: VolumeMount[];

  /**
   * The container image.
   */
  public readonly image: string;

  /**
   * The name of the container.
   */
  public readonly name: string;

  /**
   * The working directory inside the container.
   */
  public readonly workingDir?: string;

  private readonly _command?: readonly string[];
  private readonly _env: { [name: string]: EnvValue };

  constructor(props: ContainerProps) {
    this.name = props.name ?? 'main';
    this.image = props.image;
    this.port = props.port;
    this._command = props.command;
    this._env = props.env ?? { };
    this.workingDir = props.workingDir;
    this.mounts = props.volumeMounts ?? [];
  }

  /**
   * Entrypoint array (the command to execute when the container starts).
   * @returns a copy of the entrypoint array, cannot be modified
   */
  public get command(): string[] | undefined {
    return this._command ? [ ...this._command ] : undefined;
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
    this._env[name] = value;
  }

  /**
   * The environment variables for this container.
   *
   * Returns a copy. To add environment variables use `addEnv()`.
   */
  public get env(): Record<string, EnvValue> {
    return { ...this._env };
  }

  /**
   * Mount a volume to a specific path so that it is accessible by the container.
   * Every pod that is configured to use this container will autmoatically have access to the volume.
   *
   * @param path - The desired path in the container.
   * @param volume - The volume to mount.
   */
  public mount(path: string, volume: Volume, options: MountOptions = { }) {
    this.mounts.push({ path, volume, ...options });
  }

  /**
   * @internal
   */
  public _toKube(): k8s.Container {
    const volumeMounts: k8s.VolumeMount[] = [];

    for (const mount of this.mounts) {
      volumeMounts.push({
        name: mount.volume.name,
        mountPath: mount.path,
        readOnly: mount.readOnly,
        mountPropagation: mount.propagation,
        subPath: mount.subPath,
        subPathExpr: mount.subPathExpr,
      });
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
      ports,
      volumeMounts,
      command: this.command,
      workingDir: this.workingDir,
      env: renderEnv(this._env),
    };
  }
}

/**
 * Options for mounts.
 */
export interface MountOptions {
  /**
   * Determines how mounts are propagated from the host to container and the
   * other way around. When not set, MountPropagationNone is used.
   *
   * Mount propagation allows for sharing volumes mounted by a Container to
   * other Containers in the same Pod, or even to other Pods on the same node.
   *
   * This field is beta in 1.10.
   *
   * @default MountPropagation.NONE
   */
  readonly propagation?: MountPropagation;

  /**
   * Mounted read-only if true, read-write otherwise (false or unspecified).
   * Defaults to false.
   *
   * @default false
   */
  readonly readOnly?: boolean;

  /**
   * Path within the volume from which the container's volume should be mounted.).
   *
   * @default "" the volume's root
   */
  readonly subPath?: string;

  /**
   * Expanded path within the volume from which the container's volume should be
   * mounted. Behaves similarly to SubPath but environment variable references
   * $(VAR_NAME) are expanded using the container's environment. Defaults to ""
   * (volume's root). SubPathExpr and SubPath are mutually exclusive. This field
   * is beta in 1.15.
   *
   * `subPathExpr` and `subPath` are mutually exclusive. This field is beta in
   * 1.15.
   *
   * @default "" volume's root.
   */
  readonly subPathExpr?: string;
}

/**
 * Mount a volume from the pod to the container.
 */
export interface VolumeMount extends MountOptions {
  /**
   * The volume to mount.
   */
  readonly volume: Volume;

  /**
   * Path within the container at which the volume should be mounted. Must not
   * contain ':'.
   */
  readonly path: string;
}

export enum MountPropagation {
  /**
   * This volume mount will not receive any subsequent mounts that are mounted
   * to this volume or any of its subdirectories by the host. In similar
   * fashion, no mounts created by the Container will be visible on the host.
   *
   * This is the default mode.
   *
   * This mode is equal to `private` mount propagation as described in the Linux
   * kernel documentation
   */
  NONE = 'None',

  /**
   * This volume mount will receive all subsequent mounts that are mounted to
   * this volume or any of its subdirectories.
   *
   * In other words, if the host mounts anything inside the volume mount, the
   * Container will see it mounted there.
   *
   * Similarly, if any Pod with Bidirectional mount propagation to the same
   * volume mounts anything there, the Container with HostToContainer mount
   * propagation will see it.
   *
   * This mode is equal to `rslave` mount propagation as described in the Linux
   * kernel documentation
   */
  HOST_TO_CONTAINER = 'HostToContainer',

  /**
   * This volume mount behaves the same the HostToContainer mount. In addition,
   * all volume mounts created by the Container will be propagated back to the
   * host and to all Containers of all Pods that use the same volume
   *
   * A typical use case for this mode is a Pod with a FlexVolume or CSI driver
   * or a Pod that needs to mount something on the host using a hostPath volume.
   *
   * This mode is equal to `rshared` mount propagation as described in the Linux
   * kernel documentation
   *
   * Caution: Bidirectional mount propagation can be dangerous. It can damage
   * the host operating system and therefore it is allowed only in privileged
   * Containers. Familiarity with Linux kernel behavior is strongly recommended.
   * In addition, any volume mounts created by Containers in Pods must be
   * destroyed (unmounted) by the Containers on termination.
   *
   */
  BIDIRECTIONAL = 'Bidirectional',
}

function renderEnv(env: { [name: string]: EnvValue }): k8s.EnvVar[] {
  const result = new Array<k8s.EnvVar>();
  for (const [name, v] of Object.entries(env)) {
    result.push({
      name,
      value: v.value,
      valueFrom: v.valueFrom,
    });
  }
  return result;
}
