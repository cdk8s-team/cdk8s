# Namespace

Namespaces provides a mechanism for isolating groups of resources within a single cluster.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-24/typescript.md#namespace)

## Create a `Namespace`

To create a new namespace in the cluster:

```ts
import * as kplus from 'cdk8s-plus-24';
import * as k from 'cdk8s';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const namespace = new kplus.Namespace(chart, 'BackOfficeNamespace');
```

Like any other resource, if you don't specify a name, cdk8s will auto-generate one, which you
can access by `namespace.name`.

## Select namespaces

Namespaces can also be selected by various mechanisms. These selections are often used in other
cdk8s+ API's, such as [pod selection](./pod.md#pod-selection) during scheduling.

### Select namespaces by name

Select a namespace called `backoffice`.

```ts
import * as kplus from 'cdk8s-plus-24';

const backoffice = kplus.Namespaces.select(this, 'Backoffice', { names: ['backoffice'] });
```

### Select namespace by labels

Select all namespaces that have the `processing=batch` label.

```ts
import * as kplus from 'cdk8s-plus-24';

const batch = kplus.Namespaces.select(this, 'Batch', { labels: { processing: 'batch'} });
```

### Select all namespaces

Select all namespaces in the cluster.

```ts
import * as kplus from 'cdk8s-plus-24';

const all = kplus.Namespaces.all();
```
