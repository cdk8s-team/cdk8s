# Getting Started with Python

Let's walk through a simple "Hello, World!" example in Python.

## Prerequisites

* [Python >= 3.7](https://www.python.org/downloads/release/python-377)
* [pipenv](https://pipenv.pypa.io/en/latest) version 2018.11.26 or above.

## Install the CLI

cdk8s has a cute little CLI that has a few useful commands. Let's start by
installing the cdk8s CLI globally. We have two options for this.

Install with [Homebrew](https://brew.sh):

```shell
$ brew install cdk8s
```

Or install with npm (requires [Node.js](https://nodejs.org)):

```shell
$ npm install -g cdk8s-cli
```

## New Project

Now, we'll use the `cdk8s init` command to create a new Python cdk8s app:

```console
$ mkdir hello
$ cd hello
$ cdk8s init python-app
creating a new project from template: python-app
...
```

This will perform the following:

1. Create a new project directory
2. Install cdk8s as a dependency
3. Import all Kubernetes API objects

## Apps & Charts

At this point, if you open `main.py` you will see something like this:

```python
#!/usr/bin/env python
from constructs import Construct
from cdk8s import App, Chart

class MyChart(Chart):
  def __init__(self, scope: Construct, ns: str, **kwargs):
    super().__init__(scope, ns, **kwargs)

    # define resources here


app = App()
MyChart(app, "hello")

app.synth()
```

Apps are structured as a tree of **constructs**, which are composable units of
abstraction. We will learn more about constructs soon.

This initial code created by `cdk8s init` defines an app with a single, empty,
chart.

When you run `cdk8s synth`, a Kubernetes manifest YAML will be synthesized for
each `Chart` in your app and will write it to the `dist` directory.

You can try:

```shell
$ cdk8s synth
dist/hello.k8s.yaml

$ cat dist/hello.k8s.yaml
<EMPTY>
```

## Importing Constructs for the Kubernetes API

OK, now let's define some Kubernetes API objects inside our chart.

Similarly to **charts** and **apps**, Kubernetes API Objects are also
represented in cdk8s as **constructs**. These constructs are "imported" to your
project using the command `cdk8s import` and can then found under the
`imports/k8s` Python module in your project directory.

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

```python
#!/usr/bin/env python
from constructs import Construct
from cdk8s import App, Chart

from imports import k8s


class MyChart(Chart):
    def __init__(self, scope: Construct, name: str):
        super().__init__(scope, name)

        # define resources here
        label = {"app": "hello-k8s"}

        k8s.Service(self, 'service',
                    spec=k8s.ServiceSpec(
                      type='LoadBalancer',
                      ports=[k8s.ServicePort(port=80, target_port=k8s.IntOrString.from_number(8080))],
                      selector=label))

        k8s.Deployment(self, 'deployment',
                       spec=k8s.DeploymentSpec(
                         replicas=2,
                         selector=k8s.LabelSelector(match_labels=label),
                         template=k8s.PodTemplateSpec(
                           metadata=k8s.ObjectMeta(labels=label),
                           spec=k8s.PodSpec(containers=[
                             k8s.Container(
                               name='hello-kubernetes',
                               image='paulbouwer/hello-kubernetes:1.7',
                               ports=[k8s.ContainerPort(container_port=8080)])]))))


app = App()
MyChart(app, "hello")

app.synth()
```

Now, after we execute `cdk8s synth`, this will be contents of `hello.k8s.yaml`:

```yaml
spec:
  ports:
    - port: 80
      targetPort: 8080
  selector:
    app: hello-k8s
  type: LoadBalancer
kind: Service
apiVersion: v1
metadata:
  name: hello-service-9878228b
---
spec:
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
  replicas: 2
kind: Deployment
apiVersion: apps/v1
metadata:
  name: hello-deployment-c51e9e6b
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

```python
WebService(self, 'hello', 
           image='paulbouwer/hello-kubernetes:1.7')
```

It can also be customized through an API:

```python
WebService(self, 'hello-k8s',
           image='paulbouwer/hello-kubernetes:1.7',
           container_port=8080,
           replicas=10)
```

To implement `WebService`, create a file `webservice.py` with the following content:

```python
from constructs import Construct, Node

import typing
from imports import k8s


class WebService(Construct):
    def __init__(self, scope: Construct, ns: str, *,
                 image: str,
                 replicas: typing.Optional[int] = 1,
                 port: typing.Optional[int] = 80,
                 container_port: typing.Optional[int] = 8080):
        super().__init__(scope, ns)

        label = {'app': Node.of(self).unique_id}

        k8s.Service(self, 'service',
                    spec=k8s.ServiceSpec(
                        type='LoadBalancer',
                        ports=[k8s.ServicePort(port=port, target_port=k8s.IntOrString.from_number(container_port))],
                        selector=label))

        k8s.Deployment(self, 'deployment',
                       spec=k8s.DeploymentSpec(
                           replicas=replicas,
                           selector=k8s.LabelSelector(match_labels=label),
                           template=k8s.PodTemplateSpec(
                               metadata=k8s.ObjectMeta(labels=label),
                               spec=k8s.PodSpec(
                                   containers=[
                                       k8s.Container(
                                           name='app',
                                           image=image,
                                           ports=[k8s.ContainerPort(container_port=container_port)])]))))
```

Now, let's edit `main.py` and use our new construct:

```python
#!/usr/bin/env python
from constructs import Construct
from cdk8s import App, Chart

from webservice import WebService


class MyChart(Chart):
    def __init__(self, scope: Construct, name: str):
        super().__init__(scope, name)

        WebService(self, 'hello', image='paulbouwer/hello-kubernetes:1.7', replicas=2)
        WebService(self, 'ghost', image='ghost', container_port=2368)


app = App()
MyChart(app, "hello")

app.synth()
```

As you can see, we now add define `WebService` constructs inside our chart: one
that runs the `paulbouwer/hello-kubernetes` image and one with an installation
of [ghost](https://hub.docker.com/_/ghost/).
