import { IResource, Resource } from './base';
import * as cdk8s from 'cdk8s';
import { Construct } from 'constructs';
import * as k8s from './imports/k8s';

export interface SecretProps {

}

export interface ISecret extends IResource {

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

  public readonly apiObject: cdk8s.ApiObject;

  private readonly stringData: { [key: string]: string };

  public constructor(scope: Construct, id: string, props: SecretProps = { }) {
    super(scope, id, props);

    this.stringData = {};

    this.apiObject = new k8s.Secret(this, 'Secret', {
      metadata: this.metadata._toKube(),
      stringData: this.stringData,
    })
  }

  public addStringData(key: string, value: string) {
    this.stringData[key] = value;
  }

}


