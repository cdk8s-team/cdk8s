import { Resource, ResourceProps, IResource } from './base';
import { Construct } from 'constructs';
import * as k8s from './imports/k8s';
import { ApiObject } from 'cdk8s';
import { ISecret } from './secret';
import { lazy, undefinedIfEmpty } from './utils';


/**
 * Properties for initialization of `ServiceAccount`.
 */
export interface ServiceAccountProps extends ResourceProps {

}

export interface IServiceAccount extends IResource {

}

/**
 * Properties for initialization of `ServiceAccount`.
 */
export interface ServiceAccountProps {
  /**
   * List of secrets allowed to be used by pods running using this
   * ServiceAccount.
   *
   * @see https://kubernetes.io/docs/concepts/configuration/secret
   */
  readonly secrets?: ISecret[];
}

/**
 * A service account provides an identity for processes that run in a Pod.
 *
 * When you (a human) access the cluster (for example, using kubectl), you are
 * authenticated by the apiserver as a particular User Account (currently this
 * is usually admin, unless your cluster administrator has customized your
 * cluster). Processes in containers inside pods can also contact the apiserver.
 * When they do, they are authenticated as a particular Service Account (for
 * example, default).
 *
 * @see https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account
 */
export class ServiceAccount extends Resource implements IServiceAccount {

  /**
   * Imports a service account from the cluster as a reference.
   * @param name The name of the service account resource.
   */
  public static fromServiceAccountName(name: string): IServiceAccount {
    return { name: name }
  }

  protected readonly apiObject: ApiObject;

  /**
   * List of secrets allowed to be used by pods running using this
   * ServiceAccount.
   */
  public readonly secrets: ISecret[];

  constructor(scope: Construct, id: string, props: ServiceAccountProps = { }) {
    super(scope, id, props);

    this.secrets = props.secrets ?? [];

    this.apiObject = new k8s.ServiceAccount(this, 'Resource', {
      metadata: props.metadata,
      secrets: lazy(() => undefinedIfEmpty(this.secrets.map(s => ({ name: s.name })))),
    });
  }

  /**
   * Allow a secret to be accessed by pods using this service account.
   * @param secret The secret
   */
  public addSecret(secret: ISecret) {
    this.secrets.push(secret);
  }
}