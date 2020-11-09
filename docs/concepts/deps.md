# Dependencies

You can declare dependencies between any two cdk8s constructs using the `addDependency()` method.

### ApiObjects

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

### Custom Constructs

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

### Things just got cool

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
