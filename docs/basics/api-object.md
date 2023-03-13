# ApiObject

An `ApiObject` is a construct that represents an entry in a Kubernetes manifest (level 0).
In most cases, you won't use `ApiObject` directly but rather use classes that
are imported through `cdk8s import` and which extend this base class.

By default, when you import API objects from k8s, all class names will all be
prefixed with `Kube` to differentiate them from the high-level APIs in cdk8s+.
It is possible to customize the prefix by providing a string value to the
`--class-prefix` flag, or by passing `--no-class-prefix`. (Note: if no prefix is
used for k8s resources, this may lead to conflicts - see
https://github.com/cdk8s-team/cdk8s/issues/140).

### Resource Names

By default, cdk8s will autogenerate a name for every resource when it is instantiated.
The name is created from the path of the construct, and suffixed with a hash of that path.

For example, the following code:

```ts
import { App, Chart } from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';

const app = new App();
const chart = new MyChart(app, 'my-chart');

new kplus.Deployment(chart, 'deployment', {
  containers: [{ image: 'nginx' }]
});

app.synth();
```

generates a `Deployment` with the name: `my-chart-deployment-c8c354dd`. Where `my-chart` is the id of the `Chart`, `deployment` is the id of the `Deployment`, and `c8c354dd` is the hash suffix.

You can programmatically access the name of any resource in a cdk8s app by accessing the `.name` property of a resource. For example:

```ts
const deployment = new kplus.Deployment(chart, 'deployment', {
  containers: [{ image: 'nginx' }]
});
const deploymentName = deployment.name;
```

To remove hashes from resource names, you can set the `disableResourceNameHashes` property to `true`:

```ts
...
const chart = new MyChart(app, 'my-chart', {
    disableResourceNameHashes: true,
});
...
```
Which would similarly generate a `Deployment` with the name: `my-chart-deployment`. Note that disabling hashes introduces the possibility of name clashes. For example, the following code:

```ts
// think of this as a custom construct
const c = new Construct(this, 'Construct');

new kplus.Deployment(c, 'Deployment', {
  containers: [{ image: 'image' }]
});

new kplus.Deployment(this, 'Construct-Deployment', {
  containers: [{ image: 'image' }]
})
```

will produce two deployments with the same name: `chart-construct-deployment`.
This happens because cdk8s uses a hyphen (`-`) as the delimiter between elements
in the path, so if the id of your construct also contains a hyphen (`-`), a collision
can occur. In addition, you can explicitly set a name for every resource by using the `metadata.name` property:

```ts
new kplus.Deployment(c, 'Deployment', {
  metadata: {
    name: 'my-deployment'
  },
  ...
});
```
