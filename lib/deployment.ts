import { KubResource } from './resource';
import { Construct } from '@aws-cdk/core';
import { DeploymentspecAppsV1 } from './.generated/deploymentspec-apps-v1';

export class KubDeployment extends KubResource {
  constructor(scope: Construct, ns: string, spec: DeploymentspecAppsV1) {
    super(scope, ns, {
      apiVersion: 'apps/v1',
      kind: 'Deployment',
      spec: spec
    });
  }
}
