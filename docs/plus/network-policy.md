# Network Policy

Network policies control inter-pod traffic flow at the IP address or port level (OSI layer 3 or 4).
By default, a pod is opened in the network (or *non-isolated*). That is, it can initiate any outgoing traffic, and accept any incoming traffic.

When network policies are applied to pods, they loose this default behavior and become restricted, or *isolated*. This means that as soon as a policy in a specific direction
applies to a pod, that pods stops being open in that direction. We refer to such pods as **isolated**. There are two sorts of isolation for a pod: isolation for egress, and isolation for ingress.

Network policies do not conflict; they are additive. If any policy or policies apply to a given pod for a given direction,
the connections allowed in that direction from that pod is the union of what the applicable policies allow.
Thus, order of evaluation does not affect the policy result.

For a connection from a source pod to a destination pod to be allowed, both the egress policy on
the source pod and the ingress policy on the destination pod need to allow the connection.
If either side does not allow the connection, it will not happen.

## Create a `NetworkPolicy`

A network policy is a namespaced resource that applies to specific pods in that namespace.
The pods are specified using the `selector` property, and can accept a few different objects:

### Managed Pod

A managed pod is a pod that is created by the current cdk8s application. That is, its simply an instance of a `Pod`.
You can pass that instance to be used as the selector. The policy will be applied only to that **specific** pod.

> Under the hood, this uses a magic `cdk8s.io/metadata.address` label that uniquely
> identifies pods, and is added automatically by cdk8s.

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }],
});

new kplus.NetworkPolicy(chart, 'Policy', { selector: web });
```

### Managed Workload

Exactly as for a managed `Pod`, you can pass an instance of any workload resource (e.g `Deployment`, `StatefulSet`, ...)

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Deployment(chart, 'Web', {
  containers: [{ image: 'web' }],
});

new kplus.NetworkPolicy(chart, 'Policy', { selector: web });
```

### Selected Pods

If you'd like to create a policy for pods that aren't managed by the current cdk8s application,
you use [selected pods](./pod.md#select-pods).

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = kplus.Pods.select(chart, 'Web', { labels: { app: 'web' }});

new kplus.NetworkPolicy(chart, 'Policy', { selector: web });
```

This policy will apply to **all** pods with label `app=web`.

## Ip Block

An Ip Block defines a range of IP addresses using CIDR notation.
You can define both `ipv4` and `ipv6` ranges:

```ts
import * as kplus from 'cdk8s-plus-24';

// define a specific ipv4 range
kplus.NetworkPolicyIpBlock.ipv4('172.17.0.0/16');

// define a specific ipv6 range
kplus.NetworkPolicyIpBlock.ipv6('2002::1234:abcd:ffff:c0a8:101/64');

// define all ipv4 addresses
kplus.NetworkPolicyIpBlock.anyIpv4();

// define all ipv6 addresses
kplus.NetworkPolicyIpBlock.anyIpv6();
```

Ip blocks can later be used as network policy [peers](#peers).

## Peers

The selector of a policy is defined at construction time and there can only be one per policy.
The peers constitute the second half of the connection -- they are the resources or endpoints that the **selected** resources can communicate with. A policy can define rules for multiple peers, and a peer can be any one of:

- [Ip Block](#ip-block): Will allow a connection with a CIDR range.
- [Managed Pod](#managed-pod): Will establish a connection with specific pod.
- [Managed Workload](#managed-workload): Will establish a connection with the pods of the workload.
- [Selected Pods](#selected-pods): Will establish a connection with the selected pods.
- [Managed Namespace](./namespace.md): Will establish a connection with all pods in a specific namespace.
- [Selected Namespaces](./namespace.md#select-namespaces): Will establish a connection with all pods in the selected namespaces.

> You can also create a custom peer by implementing the `kplus.INetworkPolicyPeer` interface.

## Egress Rule

Isolating pods for egress traffic egress can be done either at, or post construction:

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }],
});

const cache = new kplus.Pod(chart, 'Cache', {
  containers: [{ image: 'cache', portNumber: 6379 }],
});

const db = new kplus.Pod(chart, 'DB', {
  containers: [{ image: 'db', portNumber: 6378 }],
});

// create a policy with an egress rule at instantiation
const webPolicy = new kplus.NetworkPolicy(chart, 'Policy', {
  selector: web,
  egress: { rules: [{ peer: cache, ports: [kplus.NetworkPolicyPort.tcp(6379)]}] },
});

// add an egress rule post instantiation
webPolicy.addEgressRule(db, [kplus.NetworkPolicyPort.tcp(6378)]);
```

## Ingress Rule

Isolating pods for ingress traffic ingress can be done either at, or post construction:

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }],
});

const cache = new kplus.Pod(chart, 'Cache', {
  containers: [{ image: 'cache', portNumber: 6379 }],
});

const db = new kplus.Pod(chart, 'DB', {
  containers: [{ image: 'db', portNumber: 6378 }],
});

// create a policy with an ingress rule at instantiation
const dbPolicy = new kplus.NetworkPolicy(chart, 'Policy', {
  selector: db,
  ingress: { rule: [{ peer: web, ports: [kplus.NetworkPolicyPort.tcp(6379)]}] },
});

// add an ingress rule post instantiation
redis.addIngressRule(cache, [kplus.NetworkPolicyPort.tcp(6379)]);
```

## Bi-directional Rule

As mentioned earlier, for a connection from a source pod to a destination pod to be allowed,
both the egress policy on the source pod and the ingress policy on the destination pod need to
allow the connection. Using network policies, this could be tricky, especially if the pods
are in different namespace:

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }],
  metadata: { namespace: 'n1' },
});

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis', portNumber: 6379 }],
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

If the source pod of your connection is a [managed pod](#managed-pod)
(or [managed workload](#managed-workload)), the same thing can be achieved much easier:

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const web = new kplus.Pod(chart, 'Web', {
  containers: [{ image: 'web' }],
  metadata: { namespace: 'n1' },
});

const redis = new kplus.Pod(chart, 'Redis', {
  containers: [{ image: 'redis', portNumber: 6379 }],
  metadata: { namespace: 'n2' },
});

web.connections.allowTo(redis);
// or
redis.connections.allowFrom(web);
```

See [pod connections](./pod.md#connections) for more details.

## Default Policies

Every policy can specify what behavior should apply when no rules are specified in
a given direction. You can use that to create default policies that either deny or allow
all traffic.

### Deny All Ingress

> See [default-deny-all-ingress-traffic](https://kubernetes.io/docs/concepts/services-networking/network-policies/#default-deny-all-ingress-traffic)

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

new kplus.NetworkPolicy(chart, 'Policy', {
  ingress: { default: kplus.NetworkPolicyTrafficDefault.DENY },
});
```

This ensures that even pods that aren't selected by any other network policy will still be isolated for ingress. This policy does not affect isolation for egress from any pod.

### Allow All Ingress

> See [allow-all-ingress-traffic](https://kubernetes.io/docs/concepts/services-networking/network-policies/#allow-all-ingress-traffic)

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

new kplus.NetworkPolicy(chart, 'Policy', {
  ingress: { default: kplus.NetworkPolicyTrafficDefault.ALLOW },
});
```

With this policy in place, no additional policy or policies can cause any incoming connection to those pods to be denied. This policy has no effect on isolation for egress from any pod.

!!! tip

    This differs from the default `DENY` isolation behavior, which is effectively disabled
    when other policies are applied.



### Deny All Egress

> See [default-deny-all-egress-traffic](https://kubernetes.io/docs/concepts/services-networking/network-policies/#default-deny-all-egress-traffic)

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

new kplus.NetworkPolicy(chart, 'Policy', {
  egress: { default: kplus.NetworkPolicyTrafficDefault.DENY },
});
```

This ensures that even pods that aren't selected by any other NetworkPolicy will not be allowed egress traffic. This policy does not change the ingress isolation behavior of any pod.

### Allow All Egress

> See [allow-all-egress-traffic](https://kubernetes.io/docs/concepts/services-networking/network-policies/#allow-all-egress-traffic)

```ts
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

new kplus.NetworkPolicy(chart, 'Policy', {
  egress: { default: kplus.NetworkPolicyTrafficDefault.ALLOW },
});
```

With this policy in place, no additional policy or policies can cause any outgoing connection from those pods to be denied. This policy has no effect on isolation for ingress to any pod.

!!! tip

    This differs from the default `DENY` isolation behavior, which is effectively disabled
    when other policies are applied.
