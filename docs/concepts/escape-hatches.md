# Escape Hatches

An "escape hatch" is an intentional _leak_ in the abstraction layer. It allows
users to "escape the abstraction" and reach out to a lower layer.

Similarly, in CDKs, escape hatches are mechanisms that allow users to tweak the
synthesized output when the abstraction they use does not "hold water".

You may need to use an escape hatch in the following cases:

1. You are using an imported API object (e.g. `KubeDeployment`) and there is an
   issue with the schema or a bug in "import" which results in an invalid
   manifest or missing fields (as an example see
   [issue #140](https://github.com/cdk8s-team/cdk8s/issues/140)).
2. You are using a high-level API (e.g. cdk8s+) which does not expose some
   functionality which exists in the lower-level resources.

## Patching API objects directly

The [`ApiObject`](./api-object.md) class, which is the base of all objects
synthesized into a Kubernetes manifest offers an API for patching the
synthesized output at the wire level using JSON Patch
([RFC-6902](http://tools.ietf.org/html/rfc6902)):

```ts
import { JsonPatch } from 'cdk8s';
apiObject.addJsonPatch(JsonPatch.replace('/foo', 'bar'));
apiObject.addJsonPatch(JsonPatch.add('/foo/bar/0', { bar: 123 }));
```

During synthesis, patches are applied in-order after the API object synthesized
itself.

All classes generated using the CLI [import](../cli/import.md) command extend
`ApiObject`, and therefore include the `addJsonPatch()` method.

## Patching API objects behind higher-level APIs

The second use case for using escape hatches is when you are working against a
higher-level construct which, for some reason, does not allow you to achieve
what you need.

For example, let's say you are using the `Pod` class from cdk8s+ and you wish to
set [`enableServiceLinks`] to `true`. This feature is currently not supported in
the cdk8s+ `Pod` API, so you'll want to patch the underlying `KubePod` and set
this value.

[`enableServiceLinks`]: https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.19/#podspec-v1-core

To do that, you will need to "peak" into the construct tree and find the underlying
API object, so you can apply the patch to it:

```ts
import { Pod } from 'cdk8s-plus-24';
import { ApiObject } from 'cdk8s';

const pod = new Pod(...);
const kubePod = ApiObject.of(pod);
kubePod.addJsonPatch(...);
```

The `ApiObject.of()` method uses capabilities of the [constructs programming
model](./constructs.md) to find the "default child" of a construct
(`Node.of(c).defaultChild`). When a construct is initialized, it can either
explicitly assign the value of `Node.of(this).defaultChild = xxx` or it can use
the identity `Default` for one of its child constructs. This will automatically
identify it as the default child.

!!! tip
    The `ApiObject.of()` method recursively searches down the construct tree
    through child constructs called `Default` until it finds a child of type
    `ApiObject`. This means, for example, that `ApiObject.of(apiObject)` returns
    the same object.

There could be situations where a default child is not recorded by a high-level
construct. This still does not mean you are blocked from patching the underlying
API objects. You can still use `Node.of(x)` to traverse the construct tree to
obtain the child. For example, you can use `Node.of(x).findChild(id)` to
retrieve any child by its ID.
