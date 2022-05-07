# Pod

A pod is essentially a collection of containers. It is the most fundamental computation unit that can be provisioned.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-22/typescript.md#pod)

### Adding Containers/Volumes

Containers and volumes can be added to pod definition like so:

```typescript
import * as kplus from 'cdk8s-plus-22';

const pod = new kplus.Pod(chart, 'Pod');

const container = pod.addContainer({
  image: 'node',
});

const storage = kplus.Volume.fromEmptyDir('storage');

container.mount('/data', storage);

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

// this will automatically add the volume as well.
pod.addContainer(container);

// but if you want to explicitly add it, simply use:
pod.addVolume(storage);

```

### Applying a restart policy

```typescript
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const pod = new kplus.Pod(chart, 'Pod', {
  restartPolicy: kplus.RestartPolicy.NEVER,
});
```

### Assigning a ServiceAccount

```typescript
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const pod = new kplus.Pod(chart, 'Pod', {
  serviceAccount: kplus.ServiceAccount.fromServiceAccountName('aws'),
});
```

## Scheduling

Kubernetes offers a few properties for controlling how pods are scheduled onto nodes.

- [`nodeName`](https://kubernetes.io/docs/concepts/scheduling-eviction/assign-pod-node/#nodename)
- [`nodeSelector`](https://kubernetes.io/docs/concepts/scheduling-eviction/assign-pod-node/#nodeselector)
- [`nodeAffinity`](https://kubernetes.io/docs/concepts/scheduling-eviction/assign-pod-node/#node-affinity)
- [`podAffinity`](https://kubernetes.io/docs/concepts/scheduling-eviction/assign-pod-node/#inter-pod-affinity-and-anti-affinity)
- [`podAntiAffinity`](https://kubernetes.io/docs/concepts/scheduling-eviction/assign-pod-node/#inter-pod-affinity-and-anti-affinity)
- [`tolearations`](https://kubernetes.io/docs/concepts/scheduling-eviction/taint-and-toleration/)

CDK8s+ collapses all these different features and exposes them under one unified API we refer to as `Scheduling`. This API is available on a `Pod` via the `scheduling` property.

> The same API is also available on all workload resources (i.e `Deployment`, `StatefulSet`, `Job`, `DaemonSet`).

### Node Assignment

You can statically assign a pod to a specific node, by using the node's name.

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis' }]
});
redis.scheduling.assign(kplus.Node.named('node1'));
```

This example will cause the `Redis` pod to be scheduled on a node with name `node1`.

### Node Attraction

Pods can attract themselves to nodes. As opposed to an assignment,
an attraction can be made to a **set** of nodes, specified by node selectors.
An attraction can be either required, or preferred.

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis' }]
});
const highMemoryNodes = kplus.Node.labeled(kplus.NodeLabelQuery.is('memory', 'high'));
redis.scheduling.attract(highMemoryNodes);
```

This example will **require** the `Redis` pod be scheduled on a
node that has the `memory=high` label. To request a **preference**, specify the [`weight`](https://kubernetes.io/docs/concepts/scheduling-eviction/assign-pod-node/#node-affinity-weight) property:

```ts
redis.scheduling.attract(highMemoryNodes, { weight: 50 });
```

### Node Toleration

While attractions is a property of Pods that attracts them to a set of nodes,
taints are the opposite -- they allow a node to repel a set of pods.

Tolerations are applied to pods, and allow (but do not require) the pods to
schedule onto nodes with matching taints.

Taints and tolerations work together to ensure that pods are not scheduled onto inappropriate nodes. One or more taints are applied to a node; this marks that the node should not accept any pods that do not tolerate the taints.

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis' }]
});

const node = kplus.Node.tainted(kplus.NodeTaintQuery.is('key1', 'value1', {
  effect: kplus.TainEffect.NO_SCHEDULE
}));
redis.scheduling.tolerate(node);
```

This example says the the `Redis` pod is able to tolerate
nodes tainted with `key1=value1:NoSchedule`.

### Pod Co-location

Pod co-location is a way to tell the scheduler to place a pod in a *topology*
that already hosts other pods that meet some criteria.

A topology is expressed via the `topology` property, and
represents a failure domain that Kubernetes is aware of. It can be one of:

- `kplus.Topology.HOSTNAME`: A single node. This is the default value.
- `kplus.Topology.ZONE`: Multiple nodes in a single availability zone.
- `kplus.Topology.REGION`: Multiple nodes in a single region.
- `kplus.Topology.custom`: Any other configurable value.

Similarly to node attractions, co-location can also be either required, or preferred.

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis' }]
});
const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }]
});

web.scheduling.colocate(redis);
```

This example will require the `Web` pod to be scheduled on the same node as
the `Redis` pod. To request a **preference**, specify the [`weight`](https://kubernetes.io/docs/concepts/scheduling-eviction/assign-pod-node/#node-affinity-weight) property:

```ts
web.scheduling.colocate(redis, { weight: 50 });
```

To use a different topology, specify the `topology` property:

```ts
web.scheduling.colocate(redis, { weight: 50, topology: kplus.Topology.ZONE });
```

This scenario configures co-location between two pods that are defined and managed
in the same cdk8s application. You can also co-locate with an externally
managed pod, by specifying a pod selector:

```ts
const redis = kplus.Pod.select({
  labelSelector: [kplus.PodLabelQuery.is('app', 'cache')]
});
web.scheduling.colocate(redis);
```

This will co-locate the `Web` pod with pods that have the `app=cache` label, regardless of
whether they are defined in the cdk8s app or not.

> **Under the hood**: Co-location with managed pods will automatically
> extract its labels and form the appropriate pod selector.

### Pod Separation

Pod separation (e.g anti co-location) is a way to tell the scheduler **not to** place a
pod in a *topology* that already hosts other pods that meet some criteria.
Similarly to co-location, separation can also be either required, or preferred.

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis' }]
});
const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }]
});

web.scheduling.separate(redis);
```

This example will require the `Web` pod to **not be** scheduled on the same
node (because the default value of the topology is `HOSTNAME`) as the `Redis` pod.
To request a **preference**, specify the [`weight`](https://kubernetes.io/docs/concepts/scheduling-eviction/assign-pod-node/#node-affinity-weight) property:

```ts
web.scheduling.separate(redis, { weight: 50 });
```

To use a different topology, specify the `topology` property:

```ts
web.scheduling.separate(redis, { weight: 50, topology: kplus.Topology.ZONE });
```

This scenario configures separation between two pods that are defined and managed
in the same cdk8s application. You can also separate with an externally
managed pod, by specifying a pod selector:

```ts
const redis = kplus.Pod.select({
  labelSelector: [kplus.PodLabelQuery.is('app', 'cache')]
});
web.scheduling.separate(redis);
```

This will separate the `Web` pod from pods that have the `app=cache` label, regardless of
whether they are defined in the cdk8s app or not.

> **Under the hood**: Co-location with managed pods will automatically
> extract its labels and form the appropriate pod selector.
