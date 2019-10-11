import { ApiObject } from './api-object';
import { Construct } from '@aws-cdk/core';
import { HorizontalpodautoscalerAutoscalingV2Beta1 } from './.generated/horizontalpodautoscaler-autoscaling-v2beta1';
import { ObjectmetaMetaV1 } from './.generated/objectmeta-meta-v1';

export interface HorizontalPodAutoscalerObjectOptions {
  readonly spec: HorizontalpodautoscalerAutoscalingV2Beta1;
  readonly metadata?: ObjectmetaMetaV1;
}

export class HorizontalPodAutoscalerObject extends ApiObject {
  constructor(scope: Construct, ns: string, options: HorizontalPodAutoscalerObjectOptions) {
    super(scope, ns, {
      apiVersion: 'apps/v1',
      kind: 'HorizontalPodAutoscaler',
      spec: options.spec,
      metadata: options.metadata
    });
  }
}
