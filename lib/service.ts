import { KubResource } from './resource';
import { Construct } from '@aws-cdk/core';
import { ServicespecV1 } from './.generated/servicespec-v1';

export class KubService extends KubResource {
  constructor(scope: Construct, ns: string, spec: ServicespecV1) {
    super(scope, ns, {
      apiVersion: 'v1',
      kind: 'Service',
      spec: spec
    });
  }
}