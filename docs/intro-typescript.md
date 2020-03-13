# Getting Started with CDK for Kubernetes (TypeScript)

Let's walk through a simple "Hello, World!" example in TypeScript.

## Prerequisites

 - [Node.js 12.x](https://nodejs.org/en/)
 - Your favorite editor/IDE
 - [yarn](https://yarnpkg.com/) (optional)

## Install the CLI

cdk8s has a cute little CLI that has a few useful commands. Let's start by
installing the cdk8s CLI globally:

```shell
$ npm install -g cdk8s-cli
```

## New Project

Now, we'll use the `cdk8s init` command to create a new TypeScript cdk8s app:

```console
$ mkdir hello
$ cd hello
$ cdk8s init typescript-app
creating a new project from template: typescript-app
...
```

This will perform the following:

1. Create a new project directory
2. Install cdk8s as a dependency
3. Import all Kubernetes API objects
4. Compile the TypeScript to JavaScript

## Watch

Since TypeScript is a compiled language, we will need to compile `.ts` files to
`.js` in order to execute our CDK app. You can do that continuously in the
background like this:

```shell
$ npm run watch
```

## Apps & Charts

At this point, if you open `main.ts` you will see something like this:

```ts
import { Construct } from 'constructs';
import { Chart, App } from 'cdk8s';

class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    // define constructs here
  }
}

const app = new App();
new MyChart(app, 'hello');
app.synth();
```

Apps are structured as a tree of **constructs**, which are composable units of
abstraction. We will learn more about constructs soon.

This initial code created by `cdk8s init` defines an app with a single, empty,
chart.

When you run `npm run synth`, a Kubernetes manifest YAML will be synthesized for
each `Chart` in your app and will write it to the `dist` directory.

You can try:

```shell
$ npm run synth
$ cat dist/hello.k8s.yaml
<EMPTY>
```

## Importing Constructs for the Kubernetes API

OK, now let's define some Kubernetes API objects inside our chart.

Similarly to **charts** and **apps**, Kubernetes API Objects are also
represented in cdk8s as **constructs**. These constructs are "imported" to your
project using the command `cdk8s import` and can then found under the
`imports/k8s.ts` file in your project directory.

When `cdk8s init` created your project it already executed `cdk8s import` for
you, so you should see an `imports/` directory already there. You can either
commit this directory to source-control or generate it as part of your build
process.

Now, let's use these constructs to define a simple Kubernetes application that
contains
[Service](https://kubernetes.io/docs/concepts/services-networking/service) and a
[Deployment](https://kubernetes.io/docs/concepts/workloads/controllers/deployment)
resources inspired by [paulbouwer](https://github.com/paulbouwer)'s
[hello-kubernetes](https://github.com/paulbouwer/hello-kubernetes) project.

```ts
import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';

// imported constructs
import { Deployment, Service, IntOrString } from './imports/k8s';

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
                image: 'paulbouwer/hello-kubernetes:1.7',
                ports: [ { containerPort: 8080 } ]
              }
            ]
          }
        }
      }
    });
  }
}

const app = new App();
new MyChart(app, 'hello');
app.synth();
```

Now, after we execute `npm run synth`, this will be contents of
`hello.k8s.yaml`:

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
          image: paulbouwer/hello-kubernetes:1.7
          ports:
            - containerPort: 8080
kind: Deployment
apiVersion: apps/v1
metadata:
  name: hello.deployment.c51e9e6b
```

The manifest synthesized by your app is ready to be applied to any Kubernetes
cluster using standard tools like `kubectl apply`:

```console
$ kubectl apply -f dist/hello.k8s.yaml
```

## Constructs

Constructs are the basic building block of **cdk8s**. They are the instrument that
enables composition and creation of higher-level abstractions through normal
object-oriented classes.

If you come from the Kubernetes world, you can think of constructs as
programmatically defined Helm Charts. The nice thing about constructs being
"programmatically defined" is that we can use them to leverage the full power of
object-oriented programming. For example:

* You can express the abstraction's API using strong-typed data types
* You can express rich interactions with methods and properties
* You can create polymorphic programming models through interfaces and base
  classes
* Share them through regular package managers
* Test them using our familiar testing tools and techniques
* Version them
* ...and do all that stuff that we've been doing with software in the past 20
  years.

So let's create our first Kubernetes construct. We'll call it `WebService` and
it will basically be a generalization of the **hello world** program. It's
actually quite useful.

For example, this one line will add a hello world service to our chart:

```ts
new WebService(this, 'hello-k8s', {
  image: 'paulbouwer/hello-kubernetes:1.7'
});
```

It can also be customized through an API:

```ts
new WebService(this, 'hello-k8s', {
  image: 'paulbouwer/hello-kubernetes:1.7',
  containerPort: 8080,
  replicas: 10
});
```

To implement `WebService`, create a file `lib/web-service.ts` (the convention is
to use `lib` for reusable components):

```ts
import { Construct, Node } from 'constructs';
import { Deployment, Service, IntOrString } from './imports/k8s';

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
    const label = { app: Node.of(this).uniqueId };

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
                name: 'app',
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

Now, let's edit `main.ts` and use our new construct:

```ts
import { Chart } from 'cdk8s';
import { Construct } from 'constructs';
import { WebService } from './lib/web-service';

export class MyChart extends Chart {
  constructor(scope: Construct, ns: string) {
    super(scope, ns);

    new WebService(this, 'hello', { image: 'paulbouwer/hello-kubernetes:1.7', replicas: 2 });
    new WebService(this, 'ghost', { image: 'ghost', containerPort: 2368 });
  }
}
```

As you can see, we now add define `WebService` constructs inside our chart: one
that runs the `paulbouwer/hello-kubernetes` image and one with an installation
of [ghost](https://hub.docker.com/_/ghost/).
