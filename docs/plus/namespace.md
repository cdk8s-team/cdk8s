# Namespace

Namespaces provides a mechanism for isolating groups of resources within a single cluster.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-22/typescript.md#namespace)

## Create a `Namespace`

To create a new namespace in the cluster:

```ts
import * as kplus from 'cdk8s-plus-22';
import * as k from 'cdk8s';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const namespace = new kplus.Namespace(chart, 'BackOfficeNamespace');
```

Like any other resource, if you don't specify a name, cdk8s will auto-generate one, which you
can access by `namespace.name`.

## Select a namespace(s)

Namespaces can also be selected by various mechanisms. These selections are often used in other
cdk8s+ API's, such as [pod selection](./pod.md#pod-selection) during scheduling.

### Select a namespace by name

This mechanism selects a **single** namespace by specifying its name.

```ts
import * as kplus from 'cdk8s-plus-22';

const backoffice = kplus.Namespace.named('backoffice');
```

### Select a namespace by labels

This mechanism can select **multiple** namespaces, by querying its labels.

```ts
import * as kplus from 'cdk8s-plus-22';

// select all namespaces that have the 'processing=batch' label.
const batch = kplus.Namespace.labeled(kplus.LabelQuery.is('processing', 'batch'));
```

### Select all namespaces

This mechanism simply selects **all** namespaces in the cluster.

```ts
import * as kplus from 'cdk8s-plus-22';

const all = kplus.Namespace.all();
```
