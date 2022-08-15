# Pod

A pod is essentially a collection of containers. It is the most fundamental computation unit that can be provisioned.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-24/typescript.md#pod)

## Create a `Pod`

To create a new pod in the cluster:

```ts
import * as kplus from 'cdk8s-plus-24';
import * as k from 'cdk8s';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const pod = new kplus.Pod(chart, 'Pod');
```

### Adding Containers

Every `Pod` must have at least one container before you synthesize the application.
You can add containers either during, or post instantiation:

```ts
const pod = new kplus.Pod(chart, 'Pod', {
  containers: [{ image: 'image' }],
});

pod.addContainer({ image: 'another-image' });
```

### Adding Volumes

Volumes can be added to pod definition either during, or post instantiation:

```typescript
import * as kplus from 'cdk8s-plus-24';

const data1 = kplus.Volume.fromEmptyDir('data1');
const data2 = kplus.Volume.fromEmptyDir('data2');

const pod = new kplus.Pod(chart, 'Pod', {
  volumes: [data1],
});

pod.addVolume(data2);
```

Note that adding a volume to a pod doesn't actually make the volume available
to its containers. For that, you also need to mount the volume onto a container.

```ts
import * as kplus from 'cdk8s-plus-24';

const data = kplus.Volume.fromEmptyDir('data');

const pod = new kplus.Pod(chart, 'Pod');
const container = pod.addContainer({ image: 'image' });

// mount the volume onto the container. this is actually enough, and you
// don't need to explicitly add the volume to the pod -- cdk8s+ will do that for you.
container.mount('/data', data);
```

### Applying a restart policy

A restart policy can only be specified at instantiation time:

```typescript
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const pod = new kplus.Pod(chart, 'Pod', {
  restartPolicy: kplus.RestartPolicy.NEVER,
});
```

### Assigning a ServiceAccount

A service account can only be specified at instantiation time:

```typescript
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const pod = new kplus.Pod(chart, 'Pod', {
  serviceAccount: kplus.ServiceAccount.fromServiceAccountName('aws'),
});
```

## Select pods

Pods can also be selected by various mechanisms. These selections are often used in other
cdk8s+ API's, such as [pod selection](./pod.md#pod-selection) during scheduling.

### Select pods with labels

Selects all pods that have the `app=store` label.

```ts
import * as kplus from 'cdk8s-plus-24';

const pods = kplus.Pods.select(this, 'Store', { labels: { app: 'store' }});
```

### Select pods with expressions

Selects all pods that have the `app` label, regardless of the value.

```ts
import * as kplus from 'cdk8s-plus-24';

const pods = kplus.Pods.select(this, 'App', {
  expressions: [kplus.LabelExpression.exists('app')]
});
```

### Select pods with labels in a particular namespace

Pod selection can also be scoped to specific namespaces.
This is done using the `namespaces` property, which can accept any [namespace selector](./namespace.md#select-namespaces).

For example, select all pods that have the `app=store` label in the `backoffice` namespace:

```ts
import * as kplus from 'cdk8s-plus-24';

const pods = kplus.Pods.select(this, 'Pods', {
  labels: { app: 'store' },
  namespaces: kplus.Namespaces.select(this, 'Backoffice', { names: ['backoffice'] }),
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

Scheduling is comprised of two different types:

- [Node Selection](#node-selection)
- [Pod Selection](#pod-selection)

### Node Selection

Node selection is the process of directly selecting which
nodes should pods be scheduled on, by selecting node attributes.

#### Node Assignment

You can statically assign a pod to a specific node, by using the node's name.

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis' }]
});
redis.scheduling.assign(kplus.Node.named('node1'));
```

This example will cause the `Redis` pod to be scheduled on a node with name `node1`.

#### Node Attraction

Pods can attract themselves to nodes. As opposed to an assignment,
an attraction can be made to a **set** of nodes, specified by node labels.
An attraction can be either required, or preferred.

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

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

#### Node Toleration

While attractions is a property of Pods that attracts them to a set of nodes,
taints are the opposite -- they allow a node to repel a set of pods.

Tolerations are applied to pods, and allow (but do not require) the pods to
schedule onto nodes with matching taints.

Taints and tolerations work together to ensure that pods are not scheduled onto inappropriate nodes. One or more taints are applied to a node; this marks that the node should not accept any pods that do not tolerate the taints.

A toleration can be made to a **set** of nodes, specified by node taints.

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

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

### Pod Selection

Pod selection is the process of selecting which **nodes** should pods be scheduled on,
by looking at which other **pods** are already scheduled on those nodes.

The API's presented here interact either with specific pods,
i.e instances of `Pod` or `Workload` (e.g `Deployment`, `StatefulSet`, `Job`, ...), or with a group of pods, i.e ones that are identified by a set of [selectors](#select-pods).

#### Pod Co-location

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
import * as kplus from 'cdk8s-plus-24';

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
const redis = kplus.Pods.select(this, 'Cache', {
  labels: { app: 'cache' },
});
web.scheduling.colocate(redis);
```

This will co-locate the `Web` pod with pods that have the `app=cache` label, regardless of
whether they are defined in the cdk8s app or not.

> **Under the hood**: Co-location with managed pods will automatically
> extract its labels and form the appropriate pod selector.

#### Pod Separation

Pod separation (e.g anti co-location) is a way to tell the scheduler **not to** place a
pod in a *topology* that already hosts other pods that meet some criteria.
Similarly to co-location, separation can also be either required, or preferred.

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

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
const redis = kplus.Pods.select(this, 'Cache', {
  labels: { app: 'cache' },
});
web.scheduling.separate(redis);
```

This will separate the `Web` pod from pods that have the `app=cache` label, regardless of
whether they are defined in the cdk8s app or not.

> **Under the hood**: Co-location with managed pods will automatically
> extract its labels and form the appropriate pod selector.

## Connections

Pod connections offer a simplified API to automatically create [network policies](./network-policy.md) on
both ends of a connection. Accessing this API is done via the `connections` property
of a specific `Pod`, which serves as one end of the connection.
The other end is a network policy [peer](./network-policy.md#peers).

### Allow To

To allow connections from a `Pod` to a [peer](./network-policy.md#peers):

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis', port: 6379 }]
});
const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }]
});

web.connections.allowTo(redis);
```

This will allow the `web` pod to connect to the `redis` port on port 6379,
and will allow the `redis` pod to accept connections from the `web` pod on port 6379.
Note that the port is not specified in the `allowTo` invocation, it is automatically
extracted from the `redis` pod definition.

You can also pass ports explicitly, overriding this extraction:

```ts
web.connections.allowTo(redis, { ports: [kplus.NetworkPolicyPort.tcp(4444)] });
```

### Allow From

To allow connections from a [peer](./network-policy.md#peers) to a `Pod`:

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis', port: 6379 }]
});
const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }]
});

redis.connections.allowFrom(web);
```

This will allow the `redis` pod to accept connection from the `web` pod on port 6379,
and will allow the `web` pod to connect to the `redis` pod on port 6379.
Note that the port is not specified in the `allowFrom` invocation, it is automatically
extracted from the `redis` pod definition.

### Isolation

By default, the `allowXXX` methods will create both an egress policy on the initiating end,
as well as an ingress policy on the accepting end of the connection.

This means that, if no other policies apply, both sides of the connection will be *isolated*,
each in the corresponding direction. In the above [example](#allow-to), if the `redis` pod
needs to be accessed from any pod other than `web`, an explicit policy needs to be applied,
because the default *non-isolated* behavior is now disabled.

To control the isolation this API incurs, you can use the `isolation` option. It accepts two
possible values:

- `PodConnectionsIsolation.POD`: Only isolate the pod that offers the `connections` API.
- `PodConnectionsIsolation.PEER`: Only isolate the peer the pod needs to communicate with.

```ts
// this will only create an egress policy on the 'web' pod.
web.connections.allowTo(redis, { isolation: PodConnectionsIsolation.POD });

// this will only create an ingress policy on the 'redis' pod.
web.connections.allowTo(redis, { isolation: PodConnectionsIsolation.PEER });
```
