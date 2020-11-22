# Getting Started

This guide will walk you through the following steps:

- Installing the CDK8s CLI.
- Creating a new CDK8s project in one of the supported programming languages.
- Define & deploy your first CDK8s application.
- Define a custom CDK8s construct.

## Prerequisites

=== "TypeScript"
    - [Node.js >= 10.x](https://nodejs.org/en/)
    - Your favorite editor/IDE
    - [yarn](https://yarnpkg.com/) (optional)

=== "Python"
    - [Python >= 3.7.7](https://www.python.org/downloads/release/python-377/)
    - [pipenv](https://pipenv.pypa.io/en/latest) version 2018.11.26 or above.

=== "Java"
    - [Maven >= 3.6.3](https://maven.apache.org/install.html)

## Install the CLI

CDK8s has a cute little CLI that has a few useful commands. Let's start by
installing the CDK8s CLI globally. We have two options for this.

=== "Homebrew"
    ```console
    $ brew install cdk8s
    ```

=== "npm"
    ```console
    $ npm install -g cdk8s-cli
    ```

=== "yarn"
    ```console
    $ yarn global add cdk8s-cli
    ```

## New Project

Now, we'll use the `cdk8s init` command to create a new CDK8s app:

=== "TypeScript"
    ```console
    $ mkdir hello
    $ cd hello
    $ cdk8s init typescript-app
    creating a new project from template: typescript-app
    ...
    ```

    Since TypeScript is a compiled language, we will need to compile `.ts` files to
    `.js` in order to execute our CDK app. You can do that continuously in the
    background like this:

    ```console
    $ npm run watch
    ```

=== "Python"
    ```console
    $ mkdir hello
    $ cd hello
    $ cdk8s init python-app
    creating a new project from template: python-app
    ...
    ```

=== "Java"
    ```console
    $ mkdir hello
    $ cd hello
    $ cdk8s init java-app
    Initializing a project from the java-app template
    ...
    ```

This will perform the following:

1. Create a new project directory
2. Install CDK8s as a dependency
3. Import all Kubernetes API objects

## Apps & Charts

At this point, if you will see something like this:

=== "TypeScript"
    `main.ts`

    ```ts
    import { Construct } from 'constructs';
    import { Chart, App } from 'cdk8s';

    export class MyChart extends Chart {
      constructor(scope: Construct, name: string) {
        super(scope, name);

        // define constructs here
      }
    }

    const app = new App();
    new MyChart(app, 'hello');
    app.synth();
    ```

=== "Python"
    `main.py`

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

=== "Java"
    `src/main/java/com/mycompany/app/Main.java`

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

```console
$ cdk8s synth
dist/hello.k8s.yaml

$ cat dist/hello.k8s.yaml
<EMPTY>
```

## Importing Constructs for the Kubernetes API

OK, now let's define some Kubernetes API objects inside our chart.

Similarly to **charts** and **apps**, Kubernetes API Objects are also
represented in CDK8s as **constructs**. These constructs are _imported_ to your
project using the [`cdk8s import`](./cli/import.md) command which will add
source files to your project that include constructs that represent the
Kubernetes API.

!!! info
    When [`cdk8s init`](./cli/init.md) created your project it already executed
    `cdk8s import` for you, so you should see an imports directory already there.
    You can either commit this directory to source-control or generate it as part
    of your build process.

Now, let's use these constructs to define a simple Kubernetes application which
contains
[Service](https://kubernetes.io/docs/concepts/services-networking/service) and a
[Deployment](https://kubernetes.io/docs/concepts/workloads/controllers/deployment)
resources inspired by [paulbouwer](https://github.com/paulbouwer)'s
[hello-kubernetes](https://github.com/paulbouwer/hello-kubernetes) project.

=== "TypeScript"
    ```ts
    import { Construct } from 'constructs';
    import { App, Chart } from 'cdk8s';

    // imported constructs
    import { KubeDeployment, KubeService, IntOrString } from './imports/k8s';

    export class MyChart extends Chart {
      constructor(scope: Construct, name: string) {
        super(scope, name);

        const label = { app: 'hello-k8s' };

        new KubeService(this, 'service', {
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

=== "Python"
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

            k8s.KubeService(self, 'service',
                        spec=k8s.ServiceSpec(
                        type='LoadBalancer',
                        ports=[k8s.ServicePort(port=80, target_port=k8s.IntOrString.from_number(8080))],
                        selector=label))

            k8s.KubeDeployment(self, 'deployment',
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

=== "Java"

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
    import imports.k8s.KubeService;
    import imports.k8s.KubeServiceOptions;
    import imports.k8s.ServicePort;
    import imports.k8s.ServiceSpec;
    import imports.k8s.DeploymentSpec;
    import imports.k8s.PodSpec;
    import imports.k8s.Container;
    import imports.k8s.ContainerPort;
    import imports.k8s.KubeDeployment;
    import imports.k8s.KubeDeploymentOptions;

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
            final KubeServiceOptions serviceOptions = new KubeServiceOptions.Builder()
                .spec(serviceSpec)
                .build();

            new KubeService(this, "service", serviceOptions);

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
            final KubeDeploymentOptions deploymentOptions = new KubeDeploymentOptions.Builder()
                .spec(deploymentSpec)
                .build();

            new KubeDeployment(this, "deployment", deploymentOptions);

        }

        public static void main(String[] args) {
            final App app = new App();
            new Main(app, "hello-java");
            app.synth();
        }
    }
    ```

Now, compile & synth this project:

```shell
cdk8s synth
```

!!! notice
    In compiled languages, like Java and TypeScript, you'll need to compile your program
    before running `cdk8s synth`.

This will be contents of `hello.k8s.yaml`:

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
kubectl apply -f dist/hello.k8s.yaml
```

## Abstraction through Constructs

Constructs are the basic building block of **CDK8s**. They are the instrument
that enables composition and creation of higher-level abstractions through
normal object-oriented classes.

If you come from the Kubernetes world, you can think of constructs as
programmatically defined Helm Charts. The nice thing about constructs being
"programmatically defined" is that we can use them to leverage the full power of
object-oriented programming. For example:

- You can express the abstraction's API using strong-typed data types
- You can express rich interactions with methods and properties
- You can create polymorphic programming models through interfaces and base
  classes
- Share them through regular package managers
- Test them using our familiar testing tools and techniques
- Version them
- ...and do all that stuff that we've been doing with software in the past 20
  years.

So let's create our first Kubernetes construct. We'll call it `WebService` and
it will basically be a generalization of the **hello world** program. It's
actually quite useful.

For example, this one line will add a hello world service to our chart:

=== "TypeScript"
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

=== "Python"
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


=== "Java"
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

Here's how to implement `WebService`:

=== "TypeScript"
    Create a file `lib/web-service.ts` (the convention is to use `lib` for reusable components):

    ```ts
    import { Construct, Node } from 'constructs';
    import { Names } from 'cdk8s';
    import { KubeDeployment, KubeService, IntOrString } from '../imports/k8s';

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
        const label = { app: Names.toDnsLabel(Node.of(this).path) };
        const replicas = options.replicas ?? 1;

        new KubeService(this, 'service', {
          spec: {
            type: 'LoadBalancer',
            ports: [ { port, targetPort: IntOrString.fromNumber(containerPort) } ],
            selector: label
          }
        });

        new KubeDeployment(this, 'deployment', {
          spec: {
            replicas,
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


=== "Python"
    Create a file `webservice.py` with the following content:

    ```python
    from constructs import Construct, Node

    import typing
    from imports import k8s


    class WebService(Construct):
        def __init__(self, scope: Construct, ns: str, *,
                    image: str,
                    replicas: int = 1,
                    port: int = 80,
                    container_port: int = 8080):
            super().__init__(scope, ns)

            label = {'app': Node.of(self).unique_id}

            k8s.KubeService(self, 'service',
                            spec=k8s.ServiceSpec(
                              type='LoadBalancer',
                              ports=[k8s.ServicePort(port=port, target_port=k8s.IntOrString.from_number(container_port))],
                              selector=label))

            k8s.KubeDeployment(self, 'deployment',
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

=== "Java"
    `src/main/java/com/mycompany/app/WebService.java`

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
    import imports.k8s.KubeService;
    import imports.k8s.KubeServiceOptions;
    import imports.k8s.ServicePort;
    import imports.k8s.ServiceSpec;
    import imports.k8s.DeploymentSpec;
    import imports.k8s.PodSpec;
    import imports.k8s.Container;
    import imports.k8s.ContainerPort;
    import imports.k8s.KubeDeployment;
    import imports.k8s.KubeDeploymentOptions;

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
            final KubeServiceOptions serviceOptions = new KubeServiceOptions.Builder()
                .spec(serviceSpec)
                .build();

            new KubeService(this, "service", serviceOptions);

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
            final KubeDeploymentOptions deploymentOptions = new KubeDeploymentOptions.Builder()
                .spec(deploymentSpec)
                .build();

            new KubeDeployment(this, "deployment", deploymentOptions);
        }
    }
    ```

    `src/main/java/com/mycompany/app/WebServiceOptions.java`

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

    ``src/main/java/com/mycompany/app/Main.java``

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
