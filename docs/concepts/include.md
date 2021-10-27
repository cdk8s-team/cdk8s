# Include

The `Include` construct can be used to include an existing manifest in a chart.

The following example will include the Kubernetes Dashboard in `MyChart`:

```ts
import { Include } from 'cdk8s';

class MyChart extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    const dashboard = new Include(this, 'dashboard', {
      url: 'https://raw.githubusercontent.com/kubernetes/dashboard/v2.4.0/aio/deploy/recommended.yaml',
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
