# cdk8s

> Cloud Development Kit for Kubernetes

![Build](https://github.com/awslabs/cdk8s/workflows/Build/badge.svg)
![Stability:Experimental](https://img.shields.io/badge/stability-experimental-orange)

**cdk8s** is a software development framework for defining Kubernetes
applications and reusable abstractions using familiar programming languages and
rich object-oriented APIs.

- [Getting Started](#getting-started)
- [Examples](#examples)
- [Getting Help](#getting-help)
- [Contributions](#contributions)
- [Roadmap](#roadmap)
- [License](#license)

**cdk8s** apps are programs written in one of the supported programming
languages. They are structured as a tree of
[constructs](https://docs.aws.amazon.com/cdk/latest/guide/constructs.html).

The root of the tree is an `App` construct. Within an app, users define any
number of charts (classes that extend the `Chart` class). Each chart is
synthesized into a separate Kubernetes manifest file. Charts are, in turn,
composed of any number of constructs, and eventually from resources, which
represent any Kubernetes resource, such as `Pod`, `Service`, `Deployment`,
`ReplicaSet`, etc.

cdk8s apps only ***define*** Kubernetes applications, they don't actually apply
them to the cluster. When an app is executed, it *synthesizes* all the charts
defined within the app into the `dist` directory, and then those charts can be
applied to any Kubernetes cluster using `kubectl apply -f dist/chart.k8s.yaml`.

> **cdk8s** is based on the design concepts and technologies behind the [AWS
Cloud Development Kit](https://aws.amazon.com/cdk), and can interoperate with
AWS CDK constructs to define cloud-native applications that include both
Kubernetes resources and other CDK constructs as first class citizens.

## Getting Started

Let's walk through a simple "Hello, World!" example in TypeScript.

### Prerequisites

 - [Node.js 12.x](https://nodejs.org/en/)
 - [yarn 1.x](https://yarnpkg.com/lang/en/)
 
### Private GitHub Packages

Since cdk8s is currently released to GitHub Packages (and not to [npmjs]) you
will need to [authenticate to GitHub Packages]:

Create a [Personal Access Token] that has the `read:packages` scope and write
this line to `~/.npmrc` (replace `TOKEN` with your token):

```shell
$ echo "//npm.pkg.github.com/:_authToken=TOKEN" > ~/.npmrc
```

Configure yarn to use GitHub Packages for the `@awslabs` scope:

```shell
$ yarn config set "@awslabs:registry" "https://npm.pkg.github.com"
```

[npmjs]: https://www.npmjs.com 
[Personal Access Token]: https://github.com/settings/tokens/new 
[authenticate to GitHub Packages]: https://help.github.com/en/packages/using-github-packages-with-your-projects-ecosystem/configuring-npm-for-use-with-github-packages#authenticating-to-github-packages

### Install the CLI

cdk8s has a cute little CLI that has a few useful commands. Let's start by
installing the cdk8s CLI globally:

```shell
$ yarn global add @awslabs/cdk8s-cli
```

### New Project

Now, we'll use the `cdk8s init` command to create a new TypeScript cdk8s app:

```console
$ mkdir hello-cdk8s
$ cd hello-cdk8s
$ cdk8s init typescript-app
creating a new project from template: typescript-app
```

This will perform the following:

1. Create a new project directory
2. Install cdk8s as a dependency
3. Generate constructs for all k8s object
4. Compile the TypeScript to JavaScript

### Watch

Since TypeScript is a compiled language, we will need to compile `.ts` files to
`.js` in order to execute our CDK app. You can do that continuously in the
background like this:

```shell
$ yarn watch
```

### Apps & Charts

At this point, if you open `main.ts` you will see something like this:

```ts
import { App, Construct } from '@aws-cdk/core';
import { Chart } from '@awslabs/cdk8s';

class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    // define constructs here
  }
}

const app = new App({ outdir: 'dist' });
new MyChart(app, 'hello');
app.synth();
```

Apps are structured as a tree of **constructs**, which are composable units of
abstraction. We will learn more about constructs soon.

This initial code created by `cdk8s init` defines an app with a single, empty,
chart. 

When you run `yarn synth`, a Kubernetes manifest YAML will be synthesized for
each `Chart` in your app and will write it to the `dist` directory.

You can try:

```shell
$ yarn synth
$ cat dist/hello.k8s.yaml
<EMPTY>
```

### Kubernetes Objects

OK, now let's define some Kubernetes API objects inside our chart.

Similarly to charts and apps, Kubernetes API objects are also represented in
cdk8s as **constructs**. These constructs can be found under the `.gen`
directory of your project.

> Since different Kubernetes versions have different APIs, the constructs for
Kubernetes objects are not included in the cdk8s library but actually generated
on-demand using `cdk8s generate`. Your new project already generates objects for
Kubernetes 1.14, and you should be able to find them under the `.gen` directory.

Let's use these constructs to define a simple Kubernetes application that
contains
[Service](https://kubernetes.io/docs/concepts/services-networking/service) and a
[Deployment](https://kubernetes.io/docs/concepts/workloads/controllers/deployment)
resources inspired by [paulbouwer](https://github.com/paulbouwer)'s
[hello-kubernetes](https://github.com/paulbouwer/hello-kubernetes) project.

```ts
import { App, Construct } from '@aws-cdk/core';
import { Chart } from '@awslabs/cdk8s';

// import generated constructs
import { Service, IntOrString } from './.gen/service-v1';
import { Deployment } from './.gen/apps-deployment-v1';

class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    const label = { app: 'hello-k8s' };

    new Service(this, 'service', {
      spec: {
        type: 'LoadBalancer',
        ports: [ { port: 80, targetPort: IntOrString.fromNumber(8080) } ],
        selector: label
      }
    });

    new Deployment(this, 'deployment', {
      spec: {
        replicas: 2,
        selector: {
          matchLabels: label
        },
        template: {
          metadata: { labels: label },
          spec: {
            containers: [
              {
                name: 'hello-kubernetes',
                image: 'paulbouwer/hello-kubernetes:1.5',
                ports: [ { containerPort: 8080 } ]
              }
            ]
          }
        }
      }
    });
  }
}

const app = new App({ outdir: 'dist' });
new MyChart(app, 'hello');
app.synth();
```

Now, if we execute `yarn synth`, this will be contents of `hello.k8s.yaml`:

```yaml
spec:
  type: LoadBalancer
  ports:
    - port: 80
      targetPort: 8080
  selector:
    app: hello-k8s
kind: Service
apiVersion: v1
metadata:
  name: hello.service.9878228b
---
spec:
  replicas: 2
  selector:
    matchLabels:
      app: hello-k8s
  template:
    metadata:
      labels:
        app: hello-k8s
    spec:
      containers:
        - name: hello-kubernetes
          image: paulbouwer/hello-kubernetes:1.5
          ports:
            - containerPort: 8080
kind: Deployment
apiVersion: apps/v1
metadata:
  name: hello.deployment.c51e9e6b
```

### Deploy

Now, all that remains is for you to apply this to your cluster:

```console
$ kubectl apply -f dist/hello.k8s.yaml
...

```

### Custom Constructs

Constructs are the basic building block of cdk8s. They are the instrument that
enables composition and creation of higher-level abstractions through normal
object-oriented classes.

If you come from the Kubernetes world, you can think of constructs as
programmatically defined Helm Charts. The nice thing about constructs being
"programmatically defined" is that we can leverage the full power of
object-oriented programming. For example:

* We can to express the abstraction's API using strong-typed data types
* We can express rich interactions with methods and properties
* We can create polymorphic programming models through interfaces and base
  classes
* Share them through regular package managers
* Test them using our familiar testing tools and techniques
* Version them
* ...and all that stuff that we've been doing with software in the past 20
  years.

So let's create our first Kubernetes construct. We'll call it `WebService` and
it will basically be a generalization of the hello world program. It's actually
quite useful.

For example, this one line will add a hello world service to our chart:

```ts
new WebService(this, 'hello-k8s', {
  image: 'paulbouwer/hello-kubernetes:1.5'
});
```

It can also be customized through an API:

```ts
new WebService(this, 'hello-k8s', {
  image: 'paulbouwer/hello-kubernetes:1.5',
  containerPort: 8080,
  replicas: 10
});
```

To implement `WebService`, create a file `lib/web-service.ts` (the convention is
to use `lib` for reusable components):

```ts
import { Construct } from '@aws-cdk/core';
import { Service, IntOrString } from '../.gen/service-v1';
import { Deployment } from '../.gen/apps-deployment-v1';

export interface WebServiceOptions {
  /**
   * The Docker image to use for this service.
   */
  readonly image: string;

  /**
   * Number of replicas.
   *
   * @default 1
   */
  readonly replicas?: number;

  /**
   * External port.
   *
   * @default 80
   */
  readonly port?: number;

  /**
   * Internal port.
   *
   * @default 8080
   */
  readonly containerPort?: number;
}

export class WebService extends Construct {
  constructor(scope: Construct, ns: string, options: WebServiceOptions) {
    super(scope, ns);

    const port = options.port || 80;
    const containerPort = options.containerPort || 8080;
    const label = { app: this.node.uniqueId };

    new Service(this, 'service', {
      spec: {
        type: 'LoadBalancer',
        ports: [ { port, targetPort: IntOrString.fromNumber(containerPort) } ],
        selector: label
      }
    });

    new Deployment(this, 'deployment', {
      spec: {
        replicas: 1,
        selector: {
          matchLabels: label
        },
        template: {
          metadata: { labels: label },
          spec: {
            containers: [
              {
                name: this.node.uniqueId,
                image: options.image,
                ports: [ { containerPort } ]
              }
            ]
          }
        }
      }
    });
  }
}
```

Now, let's edit `main.ts`:

```ts
import { Chart } from '@awslabs/cdk8s';
import { Construct } from '@aws-cdk/core';
import { WebService } from '../lib/web-service';

export class MyChart extends Chart {
  constructor(scope: Construct, ns: string) {
    super(scope, ns);

    new WebService(this, 'hello', { image: 'paulbouwer/hello-kubernetes:1.5', replicas: 2 });
    new WebService(this, 'ghost', { image: 'ghost', containerPort: 2368 });
  }
}
```

As you can see, we now add define `WebService` constructs inside our chart: one
that runs the `paulbouwer/hello-kubernetes` image and one with an installation
of [ghost](https://hub.docker.com/_/ghost/)

## Examples

- [Podinfo](./examples/podinfo/examples/app-example.ts) - an example of
  high-level APIs for Kubernetes objects.

## Getting Help

Interacting with the community and the development team is a great way to
contribute to the project. Please consider the following venues (in order):

* Stack Overflow: [cdk8s](https://stackoverflow.com/questions/ask?tags=cdk8s)
* Mailing list: [cdk8s](https://groups.google.com/forum/#!forum/cdk8s)
* Gitter: *TBD*
* Slack: *TBD*

## Contributions

The cdk8s project adheres to the [CNCF Code of
Conduct](https://github.com/cncf/foundation/blob/master/code-of-conduct.md).

We welcome community contributions and pull requests. See our [contribution
guide](./CONTRIBUTING.md) for information on how to report issues, set up a
development environment and submit code.

## Roadmap

See our [roadmap](./ROADMAP.md) for details about our plans for the project.

## License

This project is distributed under the [Apache License, Version 2.0](./LICENSE).
