import * as cdk8s from 'cdk8s';
import { Construct } from 'constructs';
import { IResource, Resource, ResourceProps } from './base';
import * as k8s from './imports/k8s';

export interface SecretProps extends ResourceProps {
  /**
   * stringData allows specifying non-binary secret data in string form. It is
   * provided as a write-only convenience method. All keys and values are merged
   * into the data field on write, overwriting any existing values. It is never
   * output when reading from the API.
   */
  readonly stringData?: { [key: string]: string };

  /**
   * Optional type associated with the secret.  Used to facilitate programmatic
   * handling of secret data by various controllers.
   *
   * @default undefined - Don't set a type.
   */
  readonly type?: string;
}

export interface ISecret extends IResource {

}

/**
 * Represents a specific value in JSON secret.
 */
export interface SecretValue {
  /**
   * The secret
   */
  readonly secret: ISecret;

  /**
   * The JSON key
   */
  readonly key: string;
}

/**
 * Kubernetes Secrets let you store and manage sensitive information, such as
 * passwords, OAuth tokens, and ssh keys. Storing confidential information in a
 * Secret is safer and more flexible than putting it verbatim in a Pod
 * definition or in a container image.
 *
 * @see https://kubernetes.io/docs/concepts/configuration/secret
 */
export class Secret extends Resource implements ISecret {

  /**
   * Imports a secret from the cluster as a reference.
   * @param name The name of the secret to reference.
   */
  public static fromSecretName(name: string): ISecret {
    return { name };
  }

  /**
   * @see base.Resource.apiObject
   */
  protected readonly apiObject: cdk8s.ApiObject;

  private readonly stringData: { [key: string]: string };

  public constructor(scope: Construct, id: string, props: SecretProps = { }) {
    super(scope, id);

    this.stringData = props.stringData ?? {};

    this.apiObject = new k8s.KubeSecret(this, 'Resource', {
      metadata: props.metadata,
      type: props.type,
      stringData: this.stringData,
    });
  }

  /**
   * Adds a string data field to the secert.
   * @param key Key
   * @param value Value
   */
  public addStringData(key: string, value: string) {
    this.stringData[key] = value;
  }

  /**
   * Gets a string data by key or undefined
   * @param key Key
   */
  public getStringData(key: string): string | undefined {
    return this.stringData[key];
  }
}
