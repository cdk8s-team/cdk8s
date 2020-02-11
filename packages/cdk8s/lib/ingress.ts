import { ApiObject } from './api-object';
import { Construct } from '@aws-cdk/core';
import { IngressspecExtensionsV1Beta1 } from './.generated/ingressspec-extensions-v1beta1';
import { ObjectmetaMetaV1 } from './.generated/objectmeta-meta-v1';

export interface IngressObjectOptions {
  readonly spec: IngressspecExtensionsV1Beta1;
  readonly metadata: ObjectmetaMetaV1;
}

export class IngressObject extends ApiObject {
  constructor(scope: Construct, id: string, options: IngressObjectOptions) {
    super(scope, id, {
      apiVersion: 'extensions/v1beta1',
      kind: 'Ingress',
      spec: options.spec,
      metadata: options.metadata
    });
  }
}