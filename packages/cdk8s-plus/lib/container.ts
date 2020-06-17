import { IConfigMap } from './config-map';
import { ISecret } from './secret';
import * as k8s from '../imports/k8s';
import { VolumeMount } from './volume-mount';

export interface ContainerProps {
  readonly image: string;

  /**
   * @default "main"
   */
  readonly name?: string;

  /**
   * // TODO: make this an array of structs (see k8s#ContainerPort)
   * @default - on port is exposed
   */
  readonly port?: number

  /**
   * The command to execute
   */
  readonly command?: string[];

  /**
   * Container's working directory.
   *
   * @default - If not specified, the container runtime's default will be used,
   * which might be configured in the container image. Cannot be updated.
   */
  readonly workingDir?: string;

  readonly env?: { [name: string]: EnvValue }
}

export interface EnvValueFromConfigMapOptions {
  /**
   * Specify whether the ConfigMap or its key must be defined
   * @default false
   */
  readonly optional?: boolean;
}

export interface EnvValueFromSecretOptions {

  /**
   * Specify whether the Secret or its key must be defined
   *
   * @default false
   */
  readonly optional?: boolean;

}

export interface EnvValueFromProcessOptions {

  readonly key: string;

  readonly required?: boolean;
}


export class EnvValue {
  public static of(value: string): EnvValue  {
    return { value };
  }

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

  public static fromValue(value: string): EnvValue {
    return {
      value: value,
    };
  }

  // TODO: not sure about this. lets see how it feels.
  public static fromProcess(options: EnvValueFromProcessOptions): EnvValue {

    const value = process.env[options.key];

    if (options.required && !value) {
      throw new Error(`Missing ${options.key} env variable`);
    }

    return EnvValue.fromValue(value!);
  }

  private constructor(public readonly value?: any, public readonly valueFrom?: any) {

  }
}

export class Container {
  public readonly volumeMounts: VolumeMount[] = [];
  public readonly name: string;
  public readonly image: string;
  public readonly port?: number;
  public readonly command?: string[];
  public readonly workingDir?: string;
  public readonly env: { [name: string]: EnvValue };

  constructor(props: ContainerProps) {
    this.name = props.name ?? 'main';
    this.image = props.image;
    this.port = props.port;
    this.command = props.command;
    this.env = props.env ?? { };
    this.workingDir = props.workingDir;
  }

  public addEnv(name: string, value: EnvValue) {
    this.env[name] = value;
  }

  public mount(options: VolumeMount) {
    this.volumeMounts.push(options);
  }
}