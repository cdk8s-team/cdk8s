# cdk8s-cli

> A command-line-interface for CDK for Kubernetes

**cdk8s** is a software development framework for defining Kubernetes
applications using rich object-oriented APIs. It allows developers to leverage
the full power of software in order to define abstract components called
"constructs" which compose Kubernetes resources or other constructs into
higher-level abstractions.

## Installation

Install globally via `npm`:

```shell
npm install -g cdk8s-cli
```

## Generating classes for Kubernetes API objects

To generate constructs for all Kubernetes API objects of a certain version, use
the `import` subcommand:

```shell
$ cdk8s import [--api VERSION] [--output OUTDIR]
```

* `VERSION` is the Kubernetes API version (default is 1.14.0)
* `OUTDIR` is the output directory where source files are generated (default is
  `.gen`)

This command will create a `.gen` directory with constructs for all API objects
of the specified version.

## License

This project is distributed under the [Apache License, Version 2.0](./LICENSE).

This module is part of the [cdk8s project](https://github.com/awslabs/cdk8s).
