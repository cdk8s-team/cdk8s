# cdk8s

> Cloud Development Kit for Kubernetes

![Stability:
Experimental](https://img.shields.io/badge/stability-Experimental-important.svg?style=for-the-badge)

**cdk8s** is a software development framework for defining Kubernetes
applications using rich object-oriented APIs. It allows developers to leverage
the full power of software in order to define abstract components called
"constructs" which compose Kubernetes resources or other constructs into
higher-level abstractions.

- [Getting Started](#getting-started)
- [Getting Help](#getting-help)
- [Contributions](#contributions)
- [Roadmap](#roadmap)
- [License](#license)

cdk8s apps are programs written in one of the supported programming languages.
They are structured as a tree of
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
 - [yarn](https://yarnpkg.com/lang/en/)

### (temporary) Build cdk8s Locally

Since this module is still not published, you will need to first build it
locally and link against the local version.

```console
$ git clone git@github.com:awslabs/cdk8s
$ cdk cdk8s
$ yarn install
$ yarn build
$ yarn link
```

### New Project

Create a new cdk8s project (we'll use TypeScript):

```console
$ mkdir hello-cdk8s
$ cd hello-cdk8s
$ yarn init -y
```

Install and configure typescript:

```console
$ yarn add -D typescript @types/node
$ curl -o tsconfig.json https://gist.githubusercontent.com/eladb/85502ca35543eda6c0d728358f3d3568/raw
```

Install the `constructs` module:

```console
$ yarn add @aws-cdk/core
```

> We temporary depend on `@aws-cdk/core` for the `Construct` base class, but we
> intent to extract this class into a separate module called `constructs`.


Install the `cdk8s` module from the local link:


```console
$ yarn link cdk8s
```

Add a bunch of npm scripts for "build", "watch" and "synth":

```console
$ npx npm-add-script -k build -v tsc
$ npx npm-add-script -k watch -v "tsc -w"
$ npx npm-add-script -k synth -v "node ./main.js"
```

### Concepts

**Charts**

cdk8s synthesizes a Kubernetes manifest for each `Chart` in the app. Let's
create our first chart.

Create a file `lib/hello-chart.ts` with the following contents:

```ts
import { Chart } from 'cdk8s';
import { App, Construct } from '@aws-cdk/core';

export class HelloKube extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

  }
}
```

**Resources**

Now, inside your chart, define the service and deployment resources. Import the
`ServiceObject` and `DeploymentObject` constructs from `cdk8s`. They represent
the [Service](https://kubernetes.io/docs/concepts/services-networking/service)
and
[Deployment](https://kubernetes.io/docs/concepts/workloads/controllers/deployment)
Kubernetes API objects.

```ts
import { Chart, DeploymentObject, ServiceObject } from 'cdk8s';
```

The following example is identical to defining the YAML described in
https://github.com/paulbouwer/hello-kubernetes:

```ts
const label = { app: 'hello-k8s' };

new ServiceObject(this, 'service', {
  spec: {
    type: 'LoadBalancer',
    ports: [ { port: 80, targetPort: 8080 } ],
    selector: label
  }
});

new DeploymentObject(this, 'deployment', {
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
```

**App**

OK, now that we have our chart defined, let's create an `index.ts` at the root
of the repo:

```ts
import { App } from '@aws-cdk/core';
import { HelloKube } from './lib/hello-chart';

const app = new App({ outdir: 'dist' });

new HelloKube(app, 'hellowwwww');

app.synth();
```

### Synthesize

Compile your typescript code:

```console
$ yarn build
```

Now, we are ready to synthesize our Kubernetes manifests for our app. To do
that, we simply need to execute our program. The script `synthesize` that we
added earlier will do that for us:

```console
$ yarn synth
```

This should create a new directory `dist` with a file `hello.k8s.yaml` that
contains the synthesized list of resources.

### Deploy

Now, all that remains is for you to apply this to your cluster:

```console
$ kubectl apply -f dist/hellowwwww.k8s.yaml
service "hellowwwwwservice00939e38" created
deployment.apps "hellowwwwwdeploymentb485c4d9" created
```

You can find the service endpoint using:

```console
$ kubectl get service -o wide
NAME                        TYPE           CLUSTER-IP     EXTERNAL-IP                                                               PORT(S)        AGE       SELECTOR
hellowwwwwservice00939e38   LoadBalancer   172.20.23.55   a35b958eaaf1d11e9a26a0644f9d485a-1519168962.us-west-2.elb.amazonaws.com   80:30851/TCP   3m        app=hellowwwww
kubernetes                  ClusterIP      172.20.0.1     <none>                                                                    443/TCP        1h        <none>
```

And then, hit it with your browser!

You can find this example under [`examples/hello`](./examples/hello).

Use the `apply.sh` script to synthesize and apply to your cluster. 

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

The implementation of `WebService` is trivial:


```ts
import { Construct } from '@aws-cdk/core';
import { ServiceObject, DeploymentObject } from 'cdk8s';

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

    new ServiceObject(this, 'service', {
      spec: {
        type: 'LoadBalancer',
        ports: [ { port, targetPort: containerPort } ],
        selector: label
      }
    });

    new DeploymentObject(this, 'deployment', {
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

So now we have a new abstraction that we can use:

```ts
import { App, Construct } from '@aws-cdk/core';
import { Chart } from 'cdk8s';
import { WebService } from './web-service';

class MyChart extends Chart {
  constructor(scope: Construct, ns: string) {
    super(scope, ns);

    new WebService(this, 'hello', { image: 'paulbouwer/hello-kubernetes:1.5', replicas: 2 });
    new WebService(this, 'ghost', { image: 'ghost', containerPort: 2368 });
  }
}

const app = new App({ outdir: 'dist' });
new MyChart(app, 'web-service-example');
app.synth();
```

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

Apache-2.0
