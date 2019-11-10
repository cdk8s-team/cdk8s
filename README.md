# kubesynth

[![CircleCI](https://circleci.com/gh/eladb/kubesynth.svg?style=svg&circle-token=c337eb1f8466bbe8e5451aae5a7fcdc5b8d4ca1a)](https://circleci.com/gh/eladb/kubesynth)

> Programmatically define Kubernetes manifests using familiar programming languages.

![Stability: Experimental](https://img.shields.io/badge/stability-Experimental-important.svg?style=for-the-badge)

**kubesynth** is a software development framework for defining k8s applications using rich object-oriented APIs. It
allows developers to leverage the full power of software in order to define
abstract components called "constructs" which compose k8s resources or other
constructs into higher-level abstractions.

**kubesynth** is based on the same design and technologies that are used to
for the [AWS Cloud Development Kit](https://aws.amazon.com/cdk), and can interoperate 
with AWS CDK constructs to define cloud-native applications that include both Kubernetes 
resources and AWS resources as first class citizens.

## Approach

kubesynth apps are programs written in one of the supported programming
languages. They are structured as a tree of ["constructs"](https://docs.aws.amazon.com/cdk/latest/guide/constructs.html).

The root of the tree is an `App` construct. Within an app, users define any
number of charts (classes that extend the `Chart` class). Each chart is synthesized into a separate Kubernetes manifest file.

Charts are, in turn, composed of any number of constructs, and eventually from
resources, which represent any Kubernetes resource, such as `Pod`, `Service`,
`Deployment`, `ReplicaSet`, etc.

kubesynth apps only _define_ Kubernetes applications, they don't actually apply them
to the cluster. When an app is executed, it *synthesizes* all the charts defined
within the app into the `dist` directory, and then those charts can be
applied to any Kubernetes cluster using `kubectl apply -f dist/chart.k8s.yaml`.


## Getting Started

Let's walk through a simple "Hello, World!" example in TypeScript.

### Prerequisites

 - [Node.js 12.x](https://nodejs.org/en/)
 - [yarn](https://yarnpkg.com/lang/en/)

### (temporary) Build kubesynth Locally

Since this module is still not published, you will need to first build it locally and link against the local version.

```console
$ git clone git@github.com:eladb/kubesynth
$ cdk kubesynth
$ yarn install
$ yarn build
$ yarn link
```

### New Project

Create a new kubesynth project (we'll use TypeScript):

```console
$ mkdir hello-kubesynth
$ cd hello-kubesynth
$ yarn init -y
```

Install and configure typescript:

```console
$ yarn add -D typescript @types/node
$ curl -o tsconfig.json https://gist.githubusercontent.com/eladb/85502ca35543eda6c0d728358f3d3568/raw
```

Install the `constructs`:

```console
$ yarn add @aws-cdk/core
```

> We temporary depend on @aws-cdk/core for the `Construct` base class, but we intent to extract this class into a separate module called `constructs`.


Install the `kubesynth` module from the local link:


```console
$ yarn link kubesynth
```

Add a bunch of npm scripts for "build", "watch" and "synth":

```console
$ npx npm-add-script -k build -v tsc
$ npx npm-add-script -k watch -v "tsc -w"
$ npx npm-add-script -k synth -v "node ./main.js"
```

### Charts

kubesynth synthesizes a Kubernetes manifest for each `Chart` in the app. Let's create our first chart.

Create a file `lib/hello-chart.ts` with the following contents:

```ts
import { Chart } from 'kubesynth';
import { App, Construct } from '@aws-cdk/core';

export class HelloKube extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

  }
}
```

### Resources

Now, inside your chart, define the service and deployment resources. Import the `ServiceObject` and `DeploymentObject` constructs
from `kubesynth`. They represent the [Service](https://kubernetes.io/docs/concepts/services-networking/service) and [Deployment](https://kubernetes.io/docs/concepts/workloads/controllers/deployment) Kubernetes API objects.

```ts
import { Chart, DeploymentObject, ServiceObject } from 'kubesynth';
```

The following example is identical to defining the YAML described in https://github.com/paulbouwer/hello-kubernetes:

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

### App

OK, now that we have our chart defined, let's create an `index.ts` at the root of the repo:

```ts
import { App } from '@aws-cdk/core';
import { HelloKube } from './lib/hello-chart';

const app = new App({ outdir: 'dist' });

new HelloKube(app, 'hellowwwww');

app.synth();
```

### Build

Compile your typescript code:

```console
$ yarn build
```

### Synthesize

Now, we are ready to synthesize our Kubernetes manifests for our app. To do that, we simply need
to execute our program. The script `synthesize` that we added earlier will do that for us:

```console
$ yarn synth
```

This should create a new directory `dist` with a file `hello.k8s.yaml`
that contains the synthesized list of resources.

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

### Constructs

Constructs are the basic building block of kubesynth. They are the instrument that enables composition and creation of higher-level
abstractions through normal object-oriented classes.

If you come from the Kubernetes world, you can think of constructs as
programmatically defined Helm Charts. The nice thing about constructs being
"programmatically defined" is that we can leverage the full power of object-oriented
programming. For example:

* We can to express the abstraction's API using strong-typed data types
* We can express rich interactions with methods and properties
* We can create polymorphic programming models through interfaces and base classes
* Share them through regular package managers
* Test them using our familiar testing tools and techniques
* Version them
* ...and all that stuff that we've been doing with software in the past 20 years.

So let's create our first Kubernetes construct. We'll call it `WebService` and it will basically
be a generalization of the hello world program. It's actually quite useful.

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
import { ServiceObject, DeploymentObject } from 'kubesynth';

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
import { Chart } from 'kubesynth';
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

## TODO

This is very preliminary work. There is a lot more to do:

Non-exhaustive, unordered, list:

- [ ] [Constructs as Operators](docs/construct-operator.md)
- [ ] Generate Jsii-compatible interfaces from api spec
- [ ] Generate L1 construct classes for entire surface
- [ ] References and dependnecies between resources and charts. Is this something that people need in k8s? Who will deployment work then?
- [ ] Support helm charts
- [ ] Consider if we really need L2s here
- [ ] AWS CDK interoperability: “kubectl apply” in CFN custom resource
- [ ] Real world pure example and example that uses AWS resources
- [ ] synth/deploy CLI (apply.sh)
- [ ] Resource removal
- [ ] Is `Stack` a good name?
- [ ] k8scdk or cdkk8s?
- [ ] Build in jsii
- [ ] Docker/ECR asset support with AWS CDK
- [ ] Setup CI
- [ ] Contribution Guide
- [ ] awslint-thing if we do L2
- [ ] Support resources that depend on things like Tiller, istio

## License

Apache-2.0
