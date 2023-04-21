# Getting started with CDK8s for Python
In this guide, we'll walk you through the most essential concepts you need to know in order to build a Kubernetes application using CDK8s for Python.

## Prerequisites
1. CDK8s for Python supports Python versions 3.7+. Check your Python version:
```bash
python3 --version
```

## Setting up an environment
### Initial setup
To get setup, follow these general steps:

1. To begin, you’ll need a development environment with pipenv 2018.11.26+ installed. If you’re not familiar with this setup, use these instructions to [setup pipenv](https://pipenv.pypa.io/en/latest/install/).

### Install the CLI
To initialize a CDK8s project and auto-generate Kubernetes manifests based on our code, we need the CDK8s CLI:

1. Run the following command to install the CLI using [npm](https://docs.npmjs.com/downloading-and-installing-node-js-and-npm). For more installation methods, see [Install the CDK8s CLI](cli/installation.md).
```console
npm install -g cdk8s-cli
```

### Create a project
Next, we’ll initialize a project to create the directory structure, install the CDK8s and CDK8s+ packages and all of the dependencies required to run an application using the [init command](https://cdk8s.io/docs/latest/cli/init/). 

1. In a terminal window, run the `init` command in an empty directory: 
```console
cdk8s init python-app
```

2. In your IDE, open the `main.py` file. 
```python
#!/usr/bin/env python
from constructs import Construct
from cdk8s import App, Chart


class MyChart(Chart):
   def __init__(self, scope: Construct, id: str):
       super().__init__(scope, id)

       # define resources here


app = App()
MyChart(app, "python")

app.synth()
```

This sample shows the basic structure of a CDK8s application with the essential libraries: constructs and cdk8s. These libraries supply the foundational classes and methods required for working with CDK8s. It includes the following components:

   * A custom `MyChart` class inherits from the `Chart` base class provided by the cdk8s library, serving as a representation of the Kubernetes resources to be generated and managed.
   * The `__init__` method within the `MyChart` class is responsible for initializing the base class (Chart) and specifying the Kubernetes resources. This method is invoked when creating an instance of the class.
   * An instance of the [App](https://cdk8s.io/docs/latest/reference/cdk8s/python/#app) class signifies the primary entry point of the CDK8s application and oversees the application's lifecycle and resources.
   * An instance of the `MyChart` class is created by passing the app instance and a string identifier, "python", as arguments. This action generates and registers the Kubernetes resources defined in the `MyChart` class within the application.
   * The `synth` method is called on the app instance, which produces the required Kubernetes YAML manifest files based on the defined resources. Note that in this example, we haven't defined any resources within the `MyChart` constructor, so running the "cdk8s synth" command in the CLI would generate a blank Kubernetes manifest.

## Defining Kubernetes resources
Now, we are ready to define Kubernetes resources for our application. In this sample, we illustrate the creation of a basic Kubernetes Service for a sample application, beginning with the import of the k8s library from the imports package, which enables us to work with Kubernetes resources.

### Copy the code sample
1. Copy and paste the following code sample into the existing `main.py` file of your project.
```python
#!/usr/bin/env python
from constructs import Construct
from cdk8s import App, Chart
from imports import k8s

class MyAwesomeApp(Chart):
    def __init__(self, scope: Construct, id: str):
        super().__init__(scope, id)

        # Define a Kubernetes Service
        k8s.KubeService(self, "my-service",
            spec=k8s.ServiceSpec(
                selector={"app": "my-app"},
                ports=[k8s.ServicePort(port=80, target_port=k8s.IntOrString.from_number(8080))],
                type="LoadBalancer"
            )
        )

app = App()
MyAwesomeApp(app, "python-service")

app.synth()
```

A few things worth noting about this sample:

* The `__init__` method of the `MyAwesomeApp` class creates a Kubernetes [Service](https://kubernetes.io/docs/concepts/services-networking/service/) by instantiating the `k8s.KubeService` class with the following parameters: `self` as the scope of the Service resource within the `MyAwesomeApp` class, a string identifier "my-service", and a `k8s.ServiceSpec` object that defines the Service specification with a selector dictionary having the key "app" and the value "my-app", a list of ports containing a single `k8s.ServicePort` object with a port set to 80 and a target_port set to 8080, and a `type` parameter with the value "LoadBalancer".
* An instance of the `MyAwesomeApp` class is created with the identifier "python-service".

## Generating Kubernetes manifests
After you have defined the Kubernetes resources for your project, you are ready to generate the Kubernetes manifest that will define your Service resource. 

### Run the synth command
1. Open a terminal and navigate to your project directory.
2. Run the [synth](https://cdk8s.io/docs/latest/cli/synth/) command. This command generates a Kubernetes manifest file in the `dist` folder of your project directory. The manifest file is based on the parameters specified in your application.
```console
cdk8s synth
```

### View the manifest
1. Open the `dist/go-service.k8s.yaml` file. You should see a manifest similar to the following:
```yaml
apiVersion: v1
kind: Service
metadata:
 name: go-service-service-c8d5f888
spec:
 ports:
   - port: 80
     targetPort: 8080
 selector:
   app: my-app
 type: LoadBalancer
```

## Wrap up
Keep in mind that this is just a basic demonstration of CDK8s.
- To continue your journey, develop a complete Kubernetes [Deployment](https://kubernetes.io/docs/concepts/workloads/controllers/deployment/) and [Service](https://kubernetes.io/docs/concepts/services-networking/service/) using the [CDK8s Core](https://github.com/cdk8s-team/cdk8s-examples/blob/main/python/cdk8s-core/main.py) sample application.

