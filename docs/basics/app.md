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
It allows to transform any value just before being written to the Kubernetes manifest. 

For example, lets create a resolver that adds a prefix to every resource in our application.
To define a custom resolver, create a class that implements the `IResolver` interface:

```ts
import { IResolver, ResolutionContext } from 'cdk8s';

export class AddNamePrefixResolver implements IResolver {

  constructor(private readonly prefix: string) {}

  public resolve(context: ResolutionContext): void {

    // check if we are resolving the name property
    const isNameProperty = context.key.includes('metadata') && context.key.includes('name') && context.key.length === 2;

    // check we haven't already added a prefix. this is important because
    // resolution is recursive, so we need to avoid infinite recursion.
    const isPrefixed = typeof(context.value) === 'string' && context.value.startsWith(this.prefix);

    if (isNameProperty && !isPrefixed) {
      // replace the value with a new one
      context.replaceValue(`${this.prefix}${context.value}`);
    }
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

const app = new App({ resolvers: [new AddNamePrefixResolver('custom-prefix')] });
new Chart(app, 'Chart');
```

When you run `cdk8s synth`, your custom logic will be invoked, allowing you to replace the 
original value. 

> When passing multiple resolvers, the first one (by natural order of the array) that invokes `replaceValue` is considered, and others are ignored.

One common use-case for resolvers is to fetch values from deployed infrastructure. 
This allows authoring cdk8s applications that natively leverage managed cloud resources. 
To that end, two specific resolvers are available that allow you to integrate cdk8s with other CDK frameworks:

- [AWS CDK Resolver](https://github.com/cdk8s-team/cdk8s-awscdk-resolver)
- [CDK For Terraform Resolver](https://github.com/cdk8s-team/cdk8s-cdktf-resolver)