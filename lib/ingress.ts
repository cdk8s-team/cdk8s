import { KubResource } from './resource';
import { Construct } from '@aws-cdk/core';
import { IngressExtensionsV1Beta1 } from './.generated/ingress-extensions-v1beta1';
import { ObjectmetaMetaV1 } from './.generated/objectmeta-meta-v1';

export interface KubIngressOptions {
  readonly spec: IngressExtensionsV1Beta1;
  readonly metadata: ObjectmetaMetaV1;
}

export class KubIngress extends KubResource {
  constructor(scope: Construct, id: string, options: KubIngressOptions) {
    super(scope, id, {
      apiVersion: 'extensions/v1beta1',
      kind: 'Ingress',
      spec: options.spec,
      metadata: options.metadata
    });
  }
}