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

## init - Create new projects

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

## import - Import API objects as constructs

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

## License

This project is distributed under the [Apache License, Version 2.0](./LICENSE).

This module is part of the [cdk8s project](https://github.com/awslabs/cdk8s).
