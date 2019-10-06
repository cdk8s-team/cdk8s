import { KubResource } from './resource';
import { Construct } from '@aws-cdk/core';
import { DeploymentspecAppsV1 } from './.generated/deploymentspec-apps-v1';
import { ObjectmetaMetaV1 } from './.generated/objectmeta-meta-v1';

export interface KubDeploymentOptions {
  readonly spec: DeploymentspecAppsV1;
  readonly metadata?: ObjectmetaMetaV1;
}

export class KubDeployment extends KubResource {
  constructor(scope: Construct, ns: string, options: KubDeploymentOptions) {
    super(scope, ns, {
      apiVersion: 'apps/v1',
      kind: 'Deployment',
      spec: options.spec,
      metadata: options.metadata
    });
  }
}
