# Helm Support

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
const master = redis.apiObjects.find(o => o.name === 'foo-redis-master');
master.metadata.addAnnotation('my.annotation', 'hey-there');
```
