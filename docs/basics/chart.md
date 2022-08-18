# Chart

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

When a chart is defined, you can specify chart-level `namespace` and `labels`.
Those will be applied to all API objects defined within the chart (recursively):

```ts
class MyChart extends Chart {
  constructor(scope: Construct, ns: string) {
    super(scope, ns, {
      namespace: 'my-namespace',
      labels: {
        app: 'my-app',
      },
    });

    new ApiObject(this, 'my-object', {
      apiVersion: 'v1',
      kind: 'Foo'
    });
  }
}
```

Will synthesize into:

```yaml
apiVersion: v1
kind: Foo
metadata:
  namespace: my-namespace
  labels:
    app: my-app
```
