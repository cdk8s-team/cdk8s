# cdk8s-cli

> A command-line-interface for CDK for Kubernetes

**cdk8s** is a software development framework for defining Kubernetes
applications using rich object-oriented APIs. It allows developers to leverage
the full power of software in order to define abstract components called
"constructs" which compose Kubernetes resources or other constructs into
higher-level abstractions.

## Installation

Install globally via `yarn` (or `npm`):

```shell
yarn global add cdk8s-cli
```

## init

### Create new projects

This command creates new cdk8s projects from built in templates:

```shell
$ cdk9s init TEMPLATE
```

The following example will create a new TypeScript app project:

```shell
$ mkdir my-fun-little-project
$ cd my-fun-little-project
$ cdk8s init typescript-app
```

## import

### Import API objects as constructs

To generate constructs for all Kubernetes API objects of a certain version, use
the `import` subcommand:

```shell
$ cdk8s import SPEC
```

Currently, the only supported spec is `"k8s"` which represents the core
Kubernetes API. The import command will create a file under `imports/k8s.ts`
with constructs for each API object in the spec.

The following example will import the latest version of the Kubernetes API
objects:

```shell
$ cdk8s import k8s
```

### Import different versions of the k8s API

By default, the command `cdk8s import k8s` will use the latest stable version of k8s objects.

For example, when using k8s 1.17,  if you want to use `DeploymentSpec`, you would be importing it from [Deployment v1](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.17/#deploymentspec-v1-apps) by default. 

In the default `v1`, the `revisionHistoryLimit`, which is the number of old ReplicaSets to retain, is set to 10 by default. You would have to explicitly set this to a higher number if you want to retain more.

Let's say that you want the behavior of [extensions/v1beta1](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.17/#deploymentspec-v1beta1-extensions), which defaults to retaining _all_ old ReplicaSets.

To do this, you could add the `--include` flag to your `cdk8s import`. Here is how that would look:

```code
cdk8s import k8s --language typescript --include io.k8s.api.extensions.v1beta1.Deployment
```

Here we are explicitly choosing to use the [Deployment extensions/v1beta1](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.17/#deployment-v1beta1-extensions) version, which includes the new default behavior that we want from `DeploymentSpec`

### Import Customer Resource Definitions (CRDs)

You can import CRDs from local files (`my_crd.yml`) or from a remote host (`https://raw.githubusercontent.com/jenkinsci/kubernetes-operator/master/deploy/crds/jenkins.io_jenkins_crd.yaml`)

Just like other imports, this is how you do that:

```code
cdk8s import my_crd.yaml
```

By default, your imported CRD will be named by its `spec.names.kind`. If your CRD file contains multiple CRDs, this will create multiple imports, each named by its respective `spec.names.kind`.

### Override default behavior of import naming

You can also override the default behavior for `cdk8s` importing. This will be helpful to you if you would like to name your CRD imports differently from their kind. Here is how you do it:

```code
cdk8s import example:=my_crd.yaml
```

In this case, your import would be named `example`.

## License

This project is distributed under the [Apache License, Version 2.0](./LICENSE).

This module is part of the [cdk8s project](https://github.com/awslabs/cdk8s).
