import { Resource, ResourceProps, IResource } from './base';
import { Construct } from 'constructs';
import * as k8s from '../imports/k8s';
import { ApiObject } from 'cdk8s';

export interface ServiceAccountProps extends ResourceProps {

}

export interface IServiceAccount extends IResource {

}

export class ServiceAccount extends Resource implements IServiceAccount {
  public static fromServiceAccountName(serviceAccountName: string): IServiceAccount {
    return {
      name: serviceAccountName,
    };
  }

  public readonly apiObject: ApiObject;

  constructor(scope: Construct, id: string, props: ServiceAccountProps) {
    super(scope, id, props);

    this.apiObject = new k8s.ServiceAccount(this, 'Resource', {
      metadata: this.synthesizeMetadata(),
    });
  }
}