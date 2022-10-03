# HorizontalPodAutoscaler

HorizontalPodAutoscaler allows your services to scale up when demand is high and scale down when they are no longer needed.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-24/typescript.md#horizontalpodautoscaler)

## Using a HorizontalPodAutoscaler

The example below creates a HorizontalPodAutoscaler that scales the number of replicas of a Deployment based on the average CPU utilization of the pods.

```typescript
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

// Lets create a deployment for our web server
const bookstoreWebsite = new kplus.Deployment(chart, 'BookstoreWebsite', {
  containers: [ { image: 'node' } ],
});

// Now define a HorizontalPodAutoscaler
const hpa = new kplus.HorizontalPodAutoscaler(chart, 'BookstoreWebsiteHpa', {
  target: bookstoreWebsite,
  maxReplicas: 10,
  metrics: [
     kplus.Metric.resourceCpu(kplus.MetricTarget.averageUtilization(70)),
  ],
 });
// This will scale our website deployment up when the average CPU utilization
// is 70% or higher up to a maximum of 10 replicas.
```

Using the example above, if our web server passes 70% CPU utilization the autoscaler will try and figure out the number of replicas to scale.

The autoscaler uses the following formula:

> desiredReplicas = ceil[currentReplicas * ( currentMetricValue / desiredMetricValue )]

Based on this formula we can find out how many replicas will be scaled. For example if we have 1 replica and the CPU utilization is at 70%.

> desiredReplicas = ceil[1 * ( 70 / 70 )] = 1

The autoscaler will try and add 1 replica, meaning we'll have 2 web servers running, the original and the new replica.

If the CPU utilization is 140% the autoscaler will try and provision 2 replicas. Scaling us up to 3 web servers total.

> desiredReplicas = ceil[1 * ( 140 / 70 )] = 2

This works the same way when scaling down.

For example if our target CPU utilization is 70% and we have 3 replicas running and the CPU utilization is at 50%.

> desiredReplicas = ceil[3 * ( 50 / 70 )] = 2

The autoscaler will try and remove 1 replica, meaning we'll have 2 web servers running, the original and the new replica.


## Metrics

The HorizontalPodAutoscaler supports the following metrics:

### Resource Metrics

Resource metrics are used to scale on a resource like CPU or memory.

```typescript
import * as kplus from 'cdk8s-plus-24';


const hpa = new kplus.HorizontalPodAutoscaler(chart, 'BookstoreWebsiteHpa', {
  target: bookstoreWebsite,
  maxReplicas: 10,
  metrics: [
     kplus.Metric.resourceCpu(kplus.MetricTarget.averageUtilization(70)),
  ],
 });
```

### Pods Metrics

Pods metrics are used to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second).

```typescript
import * as kplus from 'cdk8s-plus-24';


const hpa = new kplus.HorizontalPodAutoscaler(chart, 'BookstoreWebsiteHpa', {
  target: bookstoreWebsite,
  maxReplicas: 10,
  metrics: [
     kplus.Metric.pods(kplus.MetricTarget.averageValue(70)),
  ],
 });
```

### Object Metrics

Object metrics are used to scale on a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).

```typescript
import * as kplus from 'cdk8s-plus-24';


const hpa = new kplus.HorizontalPodAutoscaler(chart, 'BookstoreWebsiteHpa', {
  target: bookstoreWebsite,
  maxReplicas: 10,
  metrics: [
     kplus.Metric.object(kplus.MetricTarget.averageValue(70)),
  ],
 });
```

### External Metrics

External metrics are used to scale on a metric not associated with any Kubernetes object (for example, QPS on an external database server).

```typescript
import * as kplus from 'cdk8s-plus-24';


const hpa = new kplus.HorizontalPodAutoscaler(chart, 'BookstoreWebsiteHpa', {
  target: bookstoreWebsite,
  maxReplicas: 10,
  metrics: [
     kplus.Metric.external(kplus.MetricTarget.averageValue(70)),
  ],
 });
```

## Scaling behavior

The HorizontalPodAutoscaler has a few options to control the scaling behavior.

### scaleUp /scaleDown

The `scaleUp` / `scaleDown` options controls how fast the HorizontalPodAutoscaler scales up and down. They share the same options but have slightly different defaults.

```typescript
const hpa = new kplus.HorizontalPodAutoscaler(chart, 'BookstoreWebsiteHpa', {
  target: bookstoreWebsite,
  maxReplicas: 10,
  scaleUp: {
    stabilizationWindow: 60,
    policies: [
      kplus.PolicyType.pods(4),
      kplus.PolicyType.percent(200),
    ],
  },
  scaleDown: {
    stabilizationWindow: 60,
    policies: [
      kplus.PolicyType.pods(2),
      kplus.PolicyType.percent(100),
    ],
  },
 });
```

| Option                | Description                                                                                                                     | `scaleUp` Default                                                                         | `scaleDown` Default                                                                        |
| --------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| `stabilizationWindow` | Defines the window of past metrics that the autoscaler should consider when calculating wether or not autoscaling should occur. | 5 minutes                                                                                 | 0 (no stabilization is performed)                                                          |
| `strategy`            | Determines if the the Autoscaler should scale as much or as little as possible.                                                 | `ScalingStrategy.MAX_CHANGE` Choose the scaling policy that will scale the most replicas. | `ScalingStrategy.MIN_CHANGE` Choose the scaling policy that will scale the least replicas. |
| `policies`            | Defines how many replicas are scaled. Can be an absolute number or a percentage of the current replica count.                   | * Increase no more than 4 pods per 60 seconds  * Double the number of pods per 60 seconds | * Decrease to `minReplica` count (default 1)                                               |

Check out the example below. We have a `scaleUp` policy that will scale up by 4 pods or double the current number of pods per 60 seconds. Because the `strategy` has been configured to `ScalingStrategy.MAX_CHANGE` the autoscaler will choose the policy that will make the most replicas.

```typescript
const hpa = new kplus.HorizontalPodAutoscaler(chart, 'BookstoreWebsiteHpa', {
  target: bookstoreWebsite,
  maxReplicas: 10,
  metrics: [
     kplus.Metric.resourceCpu(kplus.MetricTarget.averageUtilization(70)),
  ],
  scaleUp: {
    strategy: kplus.ScalingStrategy.MAX_CHANGE,
    stabilizationWindow: 60,
    policies: [
      kplus.PolicyType.pods(4),
      kplus.PolicyType.percent(200),
    ],
  },
 });
```

This means that if we currently have 3 web server pods, and the CPU utilization is at 72% the autoscaler will try and add 6 pods every 60 seconds.

This will result in a total of 9 web server pods. If after 60 seconds the CPU utilization is still at 72% the autoscaler will only be allowed to add one more replica because `maxReplicas` has been configured to 10.

For more information on HorizontalPodAutoscaler check out the [API Reference](../reference/cdk8s-plus-24/typescript.md#horizontalpodautoscaler).
