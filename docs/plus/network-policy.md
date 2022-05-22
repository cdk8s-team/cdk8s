# Network Policy

Network policies control inter-pod traffic flow at the IP address or port level (OSI layer 3 or 4).
By default, a pod is opened in the network (or *non-isolated*). That is, it can initiate any outgoing traffic,
and accept any incoming traffic.

When network policies are applied to pods, they loose this default behavior and become restricted, or *isolated*.
There are two sorts of isolation for a pod: isolation for egress, and isolation for ingress.

Network policies do not conflict; they are additive. If any policy or policies apply to a given pod for a given direction,
the connections allowed in that direction from that pod is the union of what the applicable policies allow.
Thus, order of evaluation does not affect the policy result.

For a connection from a source pod to a destination pod to be allowed, both the egress policy on
the source pod and the ingress policy on the destination pod need to allow the connection.
If either side does not allow the connection, it will not happen.

## Create a `NetworkPolicy`

A network policy is a namespaced resource that applies to specific pods in that namespace.
The pods are specified using the `selector` property, and can accept a few different objects:

### For a managed pod

A managed pod is a pod that is created by the current cdk8s application. That is, its simply an instance of a `Pod`.
You can pass that instance to be used as the selector. The policy will be applied only to that **specific** pod.

> Under the hood, this uses a magic `cdk8s.io/metadata.address` label that uniquely
> identifies pods, and is added automatically by cdk8s.

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }],
});

new kplus.NetworkPolicy(chart, 'Policy', { selector: web });
```

### For a managed workload

Exactly as for a managed `Pod`, you can pass an instance of any workload resource (e.g `Deployment`, `StatefulSet`, ...)

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Deployment(chart, 'Web', {
  containers: [{ image: 'web' }],
});

new kplus.NetworkPolicy(chart, 'Policy', { selector: web });
```

### For selected pods

If you'd like to select external pods (i.e ones not created with cdk8s), or wish to select a group of pods,
you can use a [selected pod](./pod.md#select).

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = kplus.Pod.labeled(kplus.LabelQuery.is('app', 'web'));

new kplus.NetworkPolicy(chart, 'Policy', { selector: web });
```

This policy will apply to **all** pods with label `app=web`. Note that you won't be able
to [select pods in particular namespace](./pod.md#select-pods-with-labels-in-a-particular-namespace) since
the namespace will always be the namespace the policy is created in.

## Peers

The selector of a policy is defined at instantiation time and there can only be one.
It constitutes the first end of the a connection, where peers are the other end.
A policy can define rules for multiple peers, and a peer can be any one of:

- A [managed pod](#for-a-managed-pod).
- A [managed workload](#for-a-managed-workload)
- A [selected pod](#select-a-pods).
- A [managed namespace](./namespace.md). This will establish a connection with all pods in a specific namespace.
- A [selected namespace](./namespace.md#select-a-namespaces). This will establish a connection with all pods in a selected namespace(s).

> You can also create a custom peer by implementing the `kplus.INetworkPolicyPeer` interface.

## Egress Rule

Isolating pods for outgoing traffic (egress) can be done either at or post instantiation:

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }],
});

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis', port: 6379 }],
});

const webPolicy = new kplus.NetworkPolicy(chart, 'Policy', { selector: web });
webPolicy.addEgressRule(redis, [kplus.NetworkPolicyPort.tcp(6379)]);
```

## Ingress Rule

Isolating pods for incoming traffic (ingress) can be done either at or post instantiation:

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-22';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }],
});

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis', port: 6379 }],
});

const redisPolicy = new kplus.NetworkPolicy(chart, 'Policy', { selector: redis });
redis.addIngressRule(web, [kplus.NetworkPolicyPort.tcp(6379)]);
```

## Bi-directional Rule

As mentioned earlier, for a connection from a source pod to a destination pod to be allowed,
both the egress policy on the source pod and the ingress policy on the destination pod need to
allow the connection. Using network policies, this could be tricky, especially if the pods
are in different namespace:

```ts
const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }],
  metadata: { namespace: 'n1' },
});

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis', port: 6379 }],
  metadata: { namespace: 'n2' },
});

const webPolicy = new kplus.NetworkPolicy(chart, 'WebPolicy', {
  selector: web,
  // must be created in the 'web' namespace so it can select it.
  metadata: { namespace: web.metadata.namespace }
});
const redisPolicy = new kplus.NetworkPolicy(chart, 'RedisPolicy', {
  selector: redis,
  // must be created in the 'redis' namespace so it can select it.
  metadata: { namespace: redis.metadata.namespace }
});

// allow the 'web' pod to initiate a connection to the 'redis' pod on port 6379
webPolicy.addEgressRule(redis, [kplus.NetworkPolicyPort.tcp(6379)]);

// allow the 'redis' pod to accept a connection from the 'web' pod on port 6379
redis.addIngressRule(web, [kplus.NetworkPolicyPort.tcp(6379)]);
```

If the source pod of your connection is a [managed pod](#for-a-managed-pod)
(or [managed workload](#for-a-managed-workload)), the same thing can be achieved much easier:

```ts
const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }],
});

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis', port: 6379 }],
});

web.connections.allowTo(redis);
// or
redis.connections.allowFrom(web);
```

See [pod connections](./pod.md#connections) for more details.
