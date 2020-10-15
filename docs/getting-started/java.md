# Getting Started with Java

Let's walk through a simple "Hello, World!" example in Java.

## Prerequisites

* [Maven >= 3.6.3](https://maven.apache.org/install.html)

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

Now, we'll use the `cdk8s init` command to create a new Java cdk8s app:

```console
$ mkdir hello
$ cd hello
$ cdk8s init java-app
Initializing a project from the java-app template
...
```

This will perform the following:

1. Create a new project directory
2. Install cdk8s as a dependency
3. Import all Kubernetes API objects

## Apps & Charts

At this point, if you open `src/main/java/com/mycompany/app/Main.java` you will see something like this:

```java
package com.mycompany.app;

import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartOptions;

public class Main extends Chart 
{

    public Main(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public Main(final Construct scope, final String id, final ChartOptions options) {
        super(scope, id, options);

        // define resources here
    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "hello");
        app.synth();
    }
}
```

Apps are structured as a tree of **constructs**, which are composable units of
abstraction. We will learn more about constructs soon.

This initial code created by `cdk8s init` defines an app with a single, empty,
chart.

When you run `cdk8s synth`, a Kubernetes manifest YAML will be synthesized for
each `Chart` in your app and will write it to the `dist` directory.

You can try:

```shell
$ mvn compile
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
`src/main/java/imports/k8s/` or `imports.k8s` Java package in your project directory.

When `cdk8s init` created your project it already executed `cdk8s import` for
you, so you should see an `src/main/java/imports/` directory already there. You can either
commit this directory to source-control or generate it as part of your build
process.

Now, let's use these constructs to define a simple Kubernetes application that
contains
[Service](https://kubernetes.io/docs/concepts/services-networking/service) and a
[Deployment](https://kubernetes.io/docs/concepts/workloads/controllers/deployment)
resources inspired by [paulbouwer](https://github.com/paulbouwer)'s
[hello-kubernetes](https://github.com/paulbouwer/hello-kubernetes) project.

```java
package com.mycompany.app;

import software.constructs.Construct;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartOptions;

import imports.k8s.IntOrString;
import imports.k8s.LabelSelector;
import imports.k8s.ObjectMeta;
import imports.k8s.PodTemplateSpec;
import imports.k8s.Service;
import imports.k8s.ServiceOptions;
import imports.k8s.ServicePort;
import imports.k8s.ServiceSpec;
import imports.k8s.DeploymentSpec;
import imports.k8s.PodSpec;
import imports.k8s.Container;
import imports.k8s.ContainerPort;
import imports.k8s.Deployment;
import imports.k8s.DeploymentOptions;

public class Main extends Chart 
{

    public Main(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public Main(final Construct scope, final String id, final ChartOptions options) {
        super(scope, id, options);

        // Defining a LoadBalancer Service
        final String serviceType = "LoadBalancer";
        final Map<String, String> selector = new HashMap<>();
        selector.put("app", "hello-k8s");
        final List<ServicePort> servicePorts = new ArrayList<>();
        final ServicePort servicePort = new ServicePort.Builder()
            .port(80)
            .targetPort(IntOrString.fromNumber(8080))
            .build();
        servicePorts.add(servicePort);
        final ServiceSpec serviceSpec = new ServiceSpec.Builder()
            .type(serviceType)
            .selector(selector)
            .ports(servicePorts)
            .build();
        final ServiceOptions serviceOptions = new ServiceOptions.Builder()
            .spec(serviceSpec)
            .build();

        new Service(this, "service", serviceOptions);

        // Defining a Deployment
        final LabelSelector labelSelector = new LabelSelector.Builder().matchLabels(selector).build();
        final ObjectMeta objectMeta = new ObjectMeta.Builder().labels(selector).build();
        final List<ContainerPort> containerPorts = new ArrayList<>();
        final ContainerPort containerPort = new ContainerPort.Builder()
            .containerPort(8080)
            .build();
        containerPorts.add(containerPort);
        final List<Container> containers = new ArrayList<>();
        final Container container = new Container.Builder()
            .name("hello-kubernetes")
            .image("paulbouwer/hello-kubernetes:1.7")
            .ports(containerPorts)
            .build();
        containers.add(container);
        final PodSpec podSpec = new PodSpec.Builder()
            .containers(containers)
            .build();
        final PodTemplateSpec podTemplateSpec = new PodTemplateSpec.Builder()
            .metadata(objectMeta)
            .spec(podSpec)
            .build();
        final DeploymentSpec deploymentSpec = new DeploymentSpec.Builder()
            .replicas(1)
            .selector(labelSelector)
            .template(podTemplateSpec)
            .build();
        final DeploymentOptions deploymentOptions = new DeploymentOptions.Builder()
            .spec(deploymentSpec)
            .build();

        new Deployment(this, "deployment", deploymentOptions);

    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "hello-java");
        app.synth();
    }
}
```

Now, after we execute `mvn compile` and `cdk8s synth`, this will be contents of `hello.k8s.yaml`:

```yaml
apiVersion: v1
kind: Service
metadata:
  name: hello-java-service-3a4f9468
spec:
  ports:
    - port: 80
      targetPort: 8080
  selector:
    app: hello-k8s
  type: LoadBalancer
---
apiVersion: apps/v1
kind: Deployment
metadata:
  name: hello-java-deployment-d312868f
spec:
  replicas: 1
  selector:
    matchLabels:
      app: hello-k8s
  template:
    metadata:
      labels:
        app: hello-k8s
    spec:
      containers:
        - image: paulbouwer/hello-kubernetes:1.7
          name: hello-kubernetes
          ports:
            - containerPort: 8080
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

```java
new WebService(this, "hello-k8s", new WebServiceOptions.Builder()
                                                       .image("paulbouwer/hello-kubernetes:1.7")
                                                       .build());
```

It can also be customized through an API:

```java
new WebService(this, "hello-k8s", new WebServiceOptions.Builder()
                                                       .image("paulbouwer/hello-kubernetes:1.7")
                                                       .replicas(2)
                                                       .build());
```

To implement `WebService`, create a file `src/main/java/com/mycompany/app/WebService.java` with the following content:

```java
package com.mycompany.app;

import software.constructs.Construct;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartOptions;

import imports.k8s.IntOrString;
import imports.k8s.LabelSelector;
import imports.k8s.ObjectMeta;
import imports.k8s.PodTemplateSpec;
import imports.k8s.Service;
import imports.k8s.ServiceOptions;
import imports.k8s.ServicePort;
import imports.k8s.ServiceSpec;
import imports.k8s.DeploymentSpec;
import imports.k8s.PodSpec;
import imports.k8s.Container;
import imports.k8s.ContainerPort;
import imports.k8s.Deployment;
import imports.k8s.DeploymentOptions;

public class WebService extends Construct 
{

    public WebService(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public WebService(final Construct scope, final String id, final WebServiceOptions options) {
        super(scope, id);

        final int portNumber = Optional.of(options.getPort()).orElse(80);
        final int containerPortNumber = Optional.of(options.getContainerPort()).orElse(8080);
        final int replicas = Optional.of(options.getReplicas()).orElse(1);
        final String image = options.getImage();

        // Defining a LoadBalancer Service
        final String serviceType = "LoadBalancer";
        final Map<String, String> selector = new HashMap<>();
        selector.put("app", "hello-k8s");
        final List<ServicePort> servicePorts = new ArrayList<>();
        final ServicePort servicePort = new ServicePort.Builder()
            .port(portNumber)
            .targetPort(IntOrString.fromNumber(containerPortNumber))
            .build();
        servicePorts.add(servicePort);
        final ServiceSpec serviceSpec = new ServiceSpec.Builder()
            .type(serviceType)
            .selector(selector)
            .ports(servicePorts)
            .build();
        final ServiceOptions serviceOptions = new ServiceOptions.Builder()
            .spec(serviceSpec)
            .build();

        new Service(this, "service", serviceOptions);

        // Defining a Deployment
        final LabelSelector labelSelector = new LabelSelector.Builder().matchLabels(selector).build();
        final ObjectMeta objectMeta = new ObjectMeta.Builder().labels(selector).build();
        final List<ContainerPort> containerPorts = new ArrayList<>();
        final ContainerPort containerPort = new ContainerPort.Builder()
            .containerPort(containerPortNumber)
            .build();
        containerPorts.add(containerPort);
        final List<Container> containers = new ArrayList<>();
        final Container container = new Container.Builder()
            .name("web")
            .image(image)
            .ports(containerPorts)
            .build();
        containers.add(container);
        final PodSpec podSpec = new PodSpec.Builder()
            .containers(containers)
            .build();
        final PodTemplateSpec podTemplateSpec = new PodTemplateSpec.Builder()
            .metadata(objectMeta)
            .spec(podSpec)
            .build();
        final DeploymentSpec deploymentSpec = new DeploymentSpec.Builder()
            .replicas(1)
            .selector(labelSelector)
            .template(podTemplateSpec)
            .build();
        final DeploymentOptions deploymentOptions = new DeploymentOptions.Builder()
            .spec(deploymentSpec)
            .build();

        new Deployment(this, "deployment", deploymentOptions);

    }
}
```

Additionally, create a file `src/main/java/com/mycompany/app/WebServiceOptions.java` with the following content:

```java
package com.mycompany.app;

import software.constructs.Construct;

public class WebServiceOptions
{
    private String image;
    private int replicas;
    private int port;
    private int containerPort;

    public WebServiceOptions(final String image, final int replicas, final int port, final int containerPort) {
        this.image = image;
        this.replicas = replicas;
        this.port = port;
        this.containerPort = containerPort;
    }

    public String getImage() {
        return this.image;
    }

    public int getReplicas() {
        return this.replicas;
    }

    public int getPort() {
        return this.port;
    }

    public int getContainerPort() {
        return this.containerPort;
    }

    public static final class Builder {
        private String image;
        private int replicas = 1;
        private int port = 80;
        private int containerPort = 8080;

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder replicas(int replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder containerPort(int containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public WebServiceOptions build() {
            return new WebServiceOptions(image, replicas, port, containerPort);
        }
    }
}
```

Now, let's edit `Main.java` and use our new construct:

```java
package com.mycompany.app;

import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartOptions;

public class Main extends Chart 
{

    public Main(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public Main(final Construct scope, final String id, final ChartOptions options) {
        super(scope, id, options);

        new WebService(this, "hello", new WebServiceOptions.Builder()
                                                           .image("paulbouwer/hello-kubernetes:1.7")
                                                           .replicas(2)
                                                           .build());

        new WebService(this, "ghost", new WebServiceOptions.Builder()
                                                           .image("ghost")
                                                           .containerPort(2368)
                                                           .build());
    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "web-service-java");
        app.synth();
    }
}
```

As you can see, we now add define `WebService` constructs inside our chart: one
that runs the `paulbouwer/hello-kubernetes` image and one with an installation
of [ghost](https://hub.docker.com/_/ghost/).
