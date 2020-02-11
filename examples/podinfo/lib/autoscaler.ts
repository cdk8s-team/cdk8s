import { Construct } from '@aws-cdk/core';
import { HorizontalPodAutoscalerObject } from '@awslabs/cdk8s';

export interface ScaleTarget {
  readonly apiVersion: string;
  readonly kind: string;
  readonly name: string;
}

export interface AutoscalingOptions {
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

export interface AutoscalerOptions extends AutoscalingOptions {
  /**
   * The scaling target.
   */
  readonly target: ScaleTarget;
}

export class Autoscaler extends Construct {
  constructor(scope: Construct, id: string, options: AutoscalerOptions) {
    super(scope, id);

    new HorizontalPodAutoscalerObject(this, 'Default', {
      spec: {
        scaleTargetRef: {
          apiVersion: options.target.apiVersion,
          kind: options.target.kind,
          name: options.target.name
        },
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