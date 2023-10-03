# App

The `App` is the entry-point of your `cdk8s` application, and is the root of the constructs tree.
Every application first starts by creating an instance of an `App`.

```ts
import { App } from 'cdk8s';

const app = new App();
```

Then, [Charts](./chart.md) are registered into the app:

```ts
new MyChart(app, 'Chart');
```

And finally, the `app` is synthesized in order to produce the YAML manifests. Overall, your `cdk8s` 
application will have the following high level structure to it:

```ts
import { App } from 'cdk8s';

// create the app entry-point
const app = new App();

// register charts to the app
new MyChart(app, 'Chart');

// synthesize the app
app.synth();
```

## Resolvers

Resolvers are a mechanism to inject custom logic into the cdk8s value resolution process. 
It allows to transform any value just before being written to the Kubernetes manifest. To define a 
custom resolver, first create a class that implements the `IValueResolver` interface:

```ts
import { IResolver, ResolutionContext } from 'cdk8s';

export class MyCustomResolver implements IValueResolver {

  public resolve(context: ResolutionContext): any {
    const newValue = ... // run some custom logic
    context.replaceValue(newValue);
  }

}
```

The `context` argument contains information about the value that is currently being resolved:

- **obj**: `ApiObject` currently being resolved.
- **key**: Array containing the JSON path elements of the keys leading up to the value.
- **value**: The original value.

It also contains the `replaceValue` method you should use to set a replacement value instead of the original.
When you create a cdk8s `App`, pass the resolver instance to it via the `resolvers` property:

```ts
import { App, Chart } from 'cdk8s'

const app = new App({ resolvers: [new MyCustomResolver()] });
new Chart(app, 'Chart');
```

When you run `cdk8s synth`, your custom logic will be invoked, allowing you to replace the 
original value. 

> When passing multiple resolvers, the first one (by natural order of the array) that invokes `replaceValue` is considered, and others are ignored.

The resolver is invoked on every value of cdk8s resource, including complex ones. For example, if you define a Kubernetes `Service` like so:

```ts
new KubeService(this, 'Service', {
  spec: {
    type: 'LoadBalancer',
  }
});
```

Your resolver will be invoked like so:

1. Invoked on the entire spec:
    - *obj*: The `KubeService` instance.
    - *key*: `['spec']`
    - *value*: `{ type: 'LoadBalancer' }`

2. Invoked on the primitive value:
    - *obj*: The `KubeService` instance.
    - *key*: `['spec', 'type']`
    - *value*: `LoadBalancer`

This is why you should always implement a type-check on the value before deciding to replace it or not.
For example:

```ts
public resolve(context: ResolutionContext): any {
  if (context.key.includes('type') && typeof(context.value) === 'string') {
    const newValue = ... // run some custom logic
    context.replaceValue(newValue);
  }
}
```

One common use-case for resolvers is to fetch values from deployed infrastructure. 
This allows authoring cdk8s applications that natively leverage managed cloud resources. 
To that end, two specific resolvers are available that allow you to integrate cdk8s with other CDK frameworks:

- [AWS CDK Resolver](https://github.com/cdk8s-team/cdk8s-awscdk-resolver)
- [CDK For Terraform Resolver](https://github.com/cdk8s-team/cdk8s-cdktf-resolver)