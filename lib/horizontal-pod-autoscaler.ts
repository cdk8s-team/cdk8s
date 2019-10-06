import { KubResource } from './resource';
import { Construct } from '@aws-cdk/core';
import { HorizontalpodautoscalerAutoscalingV2Beta1 } from './.generated/horizontalpodautoscaler-autoscaling-v2beta1';
import { ObjectmetaMetaV1 } from './.generated/objectmeta-meta-v1';

export interface KubHorizontalPodAutoscalerOptions {
  readonly spec: HorizontalpodautoscalerAutoscalingV2Beta1;
  readonly metadata?: ObjectmetaMetaV1;
}

export class KubHorizontalPodAutoscaler extends KubResource {
  constructor(scope: Construct, ns: string, options: KubHorizontalPodAutoscalerOptions) {
    super(scope, ns, {
      apiVersion: 'apps/v1',
      kind: 'Deployment',
      spec: options.spec,
      metadata: options.metadata
    });
  }
}
