import { Construct } from '@aws-cdk/core';
import { KubHorizontalPodAutoscaler } from '../../lib/horizontal-pod-autoscaler';
import { Service } from './service';

export interface AutoscalerOptions {
  /**
   * The service to auto-scale.
   */
  readonly service: Service;

  /**
   * target CPU usage per pod
   */
  readonly cpu?: number;

  /**
   * target memory usage per pod
   */
  readonly memory?: number;

  /**
   * target requests per second per pod
   */
  readonly requests?: number;

  /**
   * @default 10
   */
  readonly maxReplicas?: number;

  /**
   * @default 2
   */
  readonly minReplicas?: number;
}

export class Autoscaler extends Construct {
  constructor(scope: Construct, id: string, options: AutoscalerOptions) {
    super(scope, id);

    new KubHorizontalPodAutoscaler(this, 'Default', {
      spec: {
        scaleTargetRef: options.service.scaleTargetRef,
        minReplicas: options.minReplicas || 2,
        maxReplicas: options.maxReplicas || 10,
        metrics: [
          ...!options.cpu      ? [] : [ { type: 'Resource', resource: { name: 'cpu', targetAverageUtilization: options.cpu } } ],
          ...!options.memory   ? [] : [ { type: 'Resource', resource: { name: 'memory', targetAverageValue: options.memory } } ],
          ...!options.requests ? [] : [ { type: 'Pod', pods: { metricName: 'http_requests', targetAverageValue: options.requests } } ],
        ]
      }
    });
  }
}