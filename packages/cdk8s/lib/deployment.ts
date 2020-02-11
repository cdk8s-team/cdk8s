import { ApiObject } from './api-object';
import { Construct } from '@aws-cdk/core';
import { DeploymentspecAppsV1 } from './.generated/deploymentspec-apps-v1';
import { ObjectmetaMetaV1 } from './.generated/objectmeta-meta-v1';

export interface DeploymentObjectOptions {
  readonly spec: DeploymentspecAppsV1;
  readonly metadata?: ObjectmetaMetaV1;
}

export class DeploymentObject extends ApiObject {
  constructor(scope: Construct, ns: string, options: DeploymentObjectOptions) {
    super(scope, ns, {
      apiVersion: 'apps/v1',
      kind: 'Deployment',
      spec: options.spec,
      metadata: options.metadata
    });
  }
}
