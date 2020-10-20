# cdk8s

> Cloud Development Kit for Kubernetes

**cdk8s** is a software development framework for defining Kubernetes
applications using rich object-oriented APIs. It allows developers to leverage
the full power of software in order to define abstract components called
"constructs" which compose Kubernetes resources or other constructs into
higher-level abstractions.

This library is the foundation of **cdk8s**. It includes base types that are
used to define cdk8s applications.

## Chart

The `Chart` is a container that synthesizes a single Kubernetes manifest.

```ts
class MyChart extends Chart {
  constructor(scope: Construct, ns: string) {
    super(scope, ns);

    // add contents here
  }
}
```

During synthesis, charts collect all the `ApiObject` nodes (recursively) and
emit a single YAML manifest that includes all these objects.

## ApiObjects

An `ApiObject` is a construct that represents an entry in a Kubernetes manifest (level 0).
In most cases, you won't use `ApiObject` directly but rather use classes that
are imported through `cdk8s import` and which extend this base class.

## Metadata

Kubernetes objects can have metadata such as [labels], [annotations] and
[namespaces] associated with them.

[labels]: (https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/)
[annotations]: (https://kubernetes.io/docs/concepts/overview/working-with-objects/annotations/)
[namespaces]: (https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/)

When an API object is defined, you can explicitly specify it's metadata. For example:

```ts
const mypod = new Pod(this, 'mypod', {
  metadata: {
    namespace: 'my-app',
    labels: {
      foo: 'bar'
    }
  },
});
```

You can access the object's `Metadata` object through the `metadata` property:

```ts
mypod.metadata.addAnnotation('foo.bar', 'baz');
```

Metadata specified at the chart level is applied to all API objects within this chart:

```ts
const myChart = new MyChart(this, 'mychart', {
  labels: {
    pruneLabel: 'bazbaz'
  }
});

// or through the API after a chart is defined
myChart.metadata.addNamespace('namespace-for-all');
```

In fact, cdk8s supports applying specific metadata at the *construct scope*
level. By applying metadata at the scope level, all API objects within this
sub-tree will have that metadata defined.

Use the `Metadata.of(scope)` to obtain a `Metadata` object associated with a
certain construct scope, and use the `addXxx` and `removeXxx` methods to
add/remove metadata from that scope.

For example, the following code adds the `app=my-app` label to all API objects
in all charts in an app:

```ts
const app = new App();

new MyChart(app, 'my-chart');
new YourChart(app, 'your-chart');
// ...

Metadata.of(app).addLabel('app', 'my-app');

app.synth();
```

The following example sets the namespace of all API objects in a custom construct:

```ts
class MyCustomConstruct extends Construct {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    Metadata.of(this).addNamespace('redis-app');

    new Pod(...);
    new Deployment(...);

    new ChildConstruct(...); // applies recursively
  }
}
```

You can also remove a label, annotation or a namespace definition from a scope
(and all API objects within that scope) using the `removeXxx` methods:

```ts
mypod.removeLabel('i-dont-want-you-here');
Metadata.of(myscope).removeAnnotation('foo.bar');
chart.metadata.clearNamespace(); // no namespace at the chart level
```

## Include

The `Include` construct can be used to include an existing manifest in a chart.

The following example will include the Kubernetes Dashboard in `MyChart`:

```ts
import { Include } from 'cdk8s';

class MyChart extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    const dashboard = new Include(this, 'dashboard', {
      url: 'https://raw.githubusercontent.com/kubernetes/dashboard/v2.0.0/aio/deploy/recommended.yaml',
      // or
      url: 'dashboard.yaml'
    });

    // ...other resources
  }
}
```

All API objects defined in the included manifest will be added as children
`ApiObject`s under the `Include` construct's scope and can be accessed
through the `apiObject` property:

The following example queries for all the `Deployment` resources in the
dashboard:

```ts
const deploymentApiObject = dashboard.apiObjects.find(c => c.kind === 'Deployment);
```

NOTE: names of included objects (`metadata.name`) are preserved. This means that
if you try to include the same manifest twice into the same chart, your manifest
will have duplicate definitions of the same objects.

## Dependencies

You can declare dependencies between any two cdk8s constructs using the `addDependency()` method.

For example, you can force kubernetes to first apply a `Namespace` before applying the `Service` in the scope of that namespace:

```typescript

const namespace = new k8s.Namespace(chart, 'backend');
const service = new k8s.Service(chart, 'Service', { metadata: { namespace: namespace.name }});

// declare the dependency. this is just a syntactic sugar for Node.of(service).addDependency(namespace)
service.addDependency(namespace);
```

`cdk8s` will ensure that the `Namespace` object is placed before the `Service` object in the resulting manifest:

```yaml
apiVersion: v1
kind: Namespace
metadata:
  name: chart-backend-a59d2e47
---
apiVersion: v1
kind: Service
metadata:
  name: chart-service-93d02be7
  namespace: chart-backend-a59d2e47
```

### Charts

You can also specify dependencies between charts, in exactly the same manner. For example, if we have a chart that provisions our `namespace`, we need that chart to be applied first:

```typescript
const namespaceChart = new NamespaceChart(app, 'namespace');
const applicationChart = new ApplicationChart(app, 'application');

// declare the dependency. this is just a syntactic sugar for Node.of(applicationChart).addDependency(namespaceChart)
applicationChart.addDependency(namespaceChart);
```

Running `cdk8s synth` will produce the following `dist` directory:

```console
> cdk8s synth

dist/0000-namespace.k8s.yaml
dist/0001-application.k8s.yaml
```

Notice that the `namespace` chart appears first with the `0000` prefix. This will ensure that a subsequent execution of `kubectl apply -f dist/` will apply the `namespace` first, and the `application` second.

The behavior above applies in the same way to custom constructs that you create or use.

```typescript
class Database extends Construct {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    new k8s.StatefulSet(this, 'StatefulSet');
    new k8s.ConfigMap(this, 'ConfigMap');
  }
}

const app = new App();

const chart = new Chart(app, 'Chart');

const service = new k8s.Service(chart, 'Service')
const database = new Database(chart, 'Database');

service.addDependency(database);
```

Declaring such a dependency will cause **each** `ApiObject` in the source construct, to *depend on* **every** `ApiObject` in the target construct.

Note that in the example above, the source construct is actually an `ApiObject`, which is also ok since it is essentially a construct with a single `ApiObject`.

> Note that if the source of your dependency is a custom construct, it won't have the `addDependency` syntactic sugar by default, so you'll have to use `Node.of()`.

The resulting manifest will be:

```yaml
apiVersion: apps/v1
kind: StatefulSet
metadata:
  name: chart-database-statefulset-4627f8e2
---
apiVersion: v1
kind: ConfigMap
metadata:
  name: chart-database-configmap-676f8640
---
apiVersion: v1
kind: Service
metadata:
  name: chart-service-93d02be7
```

You can see that all `ApiObject`s of the `Database` construct, appear before the `Service` object.

**Things just got cool!**

If you simply declare a dependency between two `ApiObject`s (or `Constructs`), that belong to two different `Chart`s, `cdk8s` will create the chart dependency automatically for you.

```typescript
const namespaceChart = new NamespaceChart(app, 'namespace');
const applicationChart = new ApplicationChart(app, 'application');

const namespace = new k8s.Namespace(namespaceChart, 'namespace');
const deployment = new k8s.Deployment(applicationChart, 'Deployment');

// dependency between ApiObjects, not Charts!
deployment.addDependency(namespace);
```

Running `cdk8s synth` will produce the same result as if explicit chart dependencies were declared:

```console
> cdk8s synth

dist/0000-namespace.k8s.yaml
dist/0001-application.k8s.yaml
```

This means you need not be bothered with managing chart dependencies, simply work with the `ApiObject`s you create, and let `cdk8s` infer the chart dependencies.

## Helm Support

You can use the `Helm` construct in order to include [Helm](https://helm.sh)
charts.

In order to use this construct, you must have `helm` installed on your system.
See [Installing Helm](https://helm.sh/docs/intro/install/) in the Helm
documentation for details.

The following example adds the
[bitnami/redis](https://github.com/bitnami/charts/tree/master/bitnami/redis)
Helm chart with sentinel containers enabled:

> The Bitnami helm repo needs to be added through: `helm repo add bitnami https://charts.bitnami.com/bitnami`

```ts
class MyChart extends cdk8s.Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    const redis = new Helm(this, 'redis', {
      chart: 'bitnami/redis',
      values: {
        sentinel: {
          enabled: true
        }
      }
    });
  }
}
```

The `Helm` construct will render the manifest from the specified chart by
executing `helm template`. If `values` is specified, these values will override
the default values included with the chart.

The `name` option can be used to specify the chart's [release name](https://helm.sh/docs/intro/using_helm/#three-big-concepts).
If not specified, a valid and unique release name will be allocated
based on the construct path.

The `Helm` construct extends `Include` and inherits it's API. For example, you
can use the `apiObjects` property to find and interact with included API
objects.

The following example shows how to add an annotation to the Redis master
deployment:

```ts
const master = redis.apiObjects.find(o => o.name === 'foo-redis-master);
master.metadata.addAnnotation('my.annotation', 'hey-there');
```

## Testing

cdk8s bundles a set of test utilities under the `Testing` class:

* `Testing.app()` returns an `App` object bound to a temporary output directory.
* `Testing.chart()` returns a `Chart` object bound to a testing app.
* `Testing.synth(chart)` returns the Kubernetes manifest synthesized from a
  chart.

## License

This project is distributed under the [Apache License, Version 2.0](./LICENSE).

This module is part of the [cdk8s project](https://github.com/awslabs/cdk8s).
