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

Generates a `Deployment` with the name: `my-chart-deployment-c8c354dd`.

In Kubernetes, only one resource of a given kind can have a given name at a time.
Hashes are used to ensure that all resources have unique identifiers. However, they are
not required and it may sometimes be undesirable to include the hash suffixes.

To remove hashes from resource names, you can change the above code by setting the
`ChartProps.disableResourceNameHashes` value to `true` like so:

```ts
import { App, Chart } from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';

const app = new App();
const chart = new MyChart(app, 'my-chart', {
    disableResourceNameHashes: true,
});

new kplus.Deployment(chart, 'deployment', {
  containers: [{ image: 'nginx' }]
});

app.synth();
```
Which would similarly generate a `Deployment` now with the name: `my-chart-deployment`.
