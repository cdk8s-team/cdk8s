import { Construct } from '@aws-cdk/core';
import { HorizontalPodAutoscaler, MetricSpec } from '../../.gen/autoscaling-horizontalpodautoscaler-v2beta2';
import { Quantity } from '../../.gen/apps-deployment-v1';

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

    const metrics = new Array<MetricSpec>();

    if (options.cpu) {
      metrics.push({ 
        type: 'Resource', 
        resource: { 
          name: 'cpu', 
          target: { 
            type: 'Utilization', 
            averageUtilization: options.cpu 
          } 
        } 
      });
    }

    if (options.memory) {
      metrics.push({
        type: 'Resource', 
        resource: { 
          name: 'memory', 
          target: { 
            type: 'AverageValue', 
            averageValue: Quantity.fromNumber(options.memory) 
          } 
        }
      });
    }

    if (options.requests) {
      metrics.push({
        type: 'Pod', 
        pods: { 
          metric: {
            name: 'http_requests'
          }, 
          target: { 
            type: 'AverageValue', 
            averageValue: Quantity.fromNumber(options.requests) 
          } 
        }
      });
    }

    new HorizontalPodAutoscaler(this, 'Default', {
      spec: {
        scaleTargetRef: {
          apiVersion: options.target.apiVersion,
          kind: options.target.kind,
          name: options.target.name
        },
        minReplicas: options.minReplicas || 2,
        maxReplicas: options.maxReplicas || 10,
        metrics
      }
    });
  }
}