import { KubResource } from './resource';
import { Construct } from '@aws-cdk/core';
import { ServicespecV1 } from './.generated/servicespec-v1';
import { ObjectmetaMetaV1 } from './.generated/objectmeta-meta-v1';

export interface KubeServiceOptions {
  readonly metadata?: ObjectmetaMetaV1;
  readonly spec: ServicespecV1;
}

export class KubService extends KubResource {
  constructor(scope: Construct, ns: string, options: KubeServiceOptions) {
    super(scope, ns, {
      apiVersion: 'v1',
      kind: 'Service',
      spec: options.spec,
      metadata: options.metadata
    });
  }
}