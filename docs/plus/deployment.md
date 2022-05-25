# Deployment

Create a deployment to govern the lifecycle and orchestration of a set of identical pods.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-24/typescript.md#deployment)

## Automatic pod selection

When you specify pods in a deployment, you normally have to configure the appropriate labels and selectors to
make the deployment control the relevant pods. This construct does this automatically.

```typescript
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

new kplus.Deployment(chart, 'FrontEnds', {
  containers: [ { image: 'node' } ],
});
```

Note the resulting manifest contains a special `cdk8s.deployment` label that is applied to the pods, and is used as
the selector for the deployment.

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  annotations: {}
  labels: {}
  name: chart-frontends-pod-a48e7f2e
spec:
  replicas: 1
  selector:
    matchLabels:
      cdk8s.deployment: ChartFrontEndsDD8A97CE
  template:
    metadata:
      annotations: {}
      labels:
        cdk8s.deployment: ChartFrontEndsDD8A97CE
```

## Exposing via a service

Following up on pod selection, you can also easily create a service that will select the pods relevant to the deployment.

```typescript

// store the deployment to created in a constant
const frontends = new kplus.Deployment(chart, 'FrontEnds');

// create a ClusterIP service that listens on port 9000 and redirects to port 9000 on the containers.
frontends.expose(9000)
```

Notice the resulting manifest, will have the same `cdk8s.deployment` magic label as the selector.
This will cause the service to attach to the pods that were configured as part of the said deployment.

```yaml
apiVersion: v1
kind: Service
metadata:
  annotations: {}
  labels: {}
  name: chart-frontends-service-pod-1f70150b
spec:
  externalIPs: []
  ports:
    - port: 9000
  selector:
    cdk8s.deployment: ChartFrontEndsDD8A97CE
  type: ClusterIP
```

## Scheduling

In addition to the scheduling capabilities provided by [pod scheduling](./pod.md#scheduling),
a Deployment offers the following:

### Spreading

A spread is a [separation](./pod.md#pod-separation) of pods from themselves.
It can be used to ensure replicas of the same workload are scheduled on different topologies.

> The same API is also available on all workload resources (i.e `Deployment`, `StatefulSet`, `Job`, `DaemonSet`).

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const redis = new kplus.Deployment(chart, 'Redis', {
  containers: [{ image: 'redis' }],
  replicas: 3,
});

deployment.scheduling.spread(kplus.Topology.HOSTNAME);
```

This example ensures that each replica of the `Redis` deployment
will be scheduled on a different node.

Take, for [example](https://kubernetes.io/docs/concepts/scheduling-eviction/assign-pod-node/#more-practical-use-cases), a three-node cluster running a web application with an in-memory cache like redis. You'd like to co-locate the web servers with the cache as much as possible, while still maintaining node failure resistance. (i.e not all pods are on the same node).

Here is how you can accomplish that:

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const redis = new kplus.Deployment(chart, 'Redis', {
  containers: [{ image: 'redis' }],
  replicas: 3,
});
const web = new kplus.Deployment(chart, 'Web', {
  containers: [{ image: 'web' }],
  replicas: 3,
});

// ensure redis is spread across all nodes
redis.scheduling.spread(kplus.Topology.HOSTNAME);

// ensure web app is spread across all nodes
web.scheduling.spread(kplus.Topology.HOSTNAME);

// ensure a web app pod always runs along side a cache instance
web.scheduling.colocate(redis);
```
