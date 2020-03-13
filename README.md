# cdk8s

> Cloud Development Kit for Kubernetes

![Stability:Experimental](https://img.shields.io/badge/stability-experimental-orange)
![Release](https://github.com/awslabs/cdk8s/workflows/Release/badge.svg)
[![npm version](https://badge.fury.io/js/cdk8s.svg)](https://badge.fury.io/js/cdk8s)
[![PyPI version](https://badge.fury.io/py/cdk8s.svg)](https://badge.fury.io/py/cdk8s)
[![NuGet version](https://badge.fury.io/nu/Org.Cdk8s.svg)](https://badge.fury.io/nu/Org.Cdk8s)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.cdk8s/cdk8s/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/org.cdk8s/cdk8s)


**cdk8s** is a software development framework for defining Kubernetes
applications and reusable abstractions using familiar programming languages and
rich object-oriented APIs. cdk8s generates pure Kubernetes YAML - you can use
cdk8s to define applications for any Kubernetes cluster running anywhere.

This is an early-stage, experimental project built with ❤️ by AWS. We encourage you to [try it out](#getting-started), [leave feedback](#getting-help), and [jump in to help](#contributions)!

### Contents

- [Overview](#overview)
- [Getting Started](#getting-started)
- [Examples](#examples)
- [Help & Feedback](#help--feedback)
- [Contributing](#contributing)
- [Roadmap](#roadmap)
- [License](#license)

## Overview

**cdk8s** apps are programs written in one of the supported programming
languages. They are structured as a tree of
[constructs](https://github.com/aws/constructs).

The root of the tree is an `App` construct. Within an app, users define any
number of charts (classes that extend the `Chart` class). Each chart is
synthesized into a separate Kubernetes manifest file. Charts are, in turn,
composed of any number of constructs, and eventually from resources, which
represent any Kubernetes resource, such as `Pod`, `Service`, `Deployment`,
`ReplicaSet`, etc.

cdk8s apps only ***define*** Kubernetes applications, they don't actually apply
them to the cluster. When an app is executed, it *synthesizes* all the charts
defined within the app into the `dist` directory, and then those charts can be
applied to any Kubernetes cluster using `kubectl apply -f dist/chart.k8s.yaml` or a GitOps tool like [Flux](https://fluxcd.io/).

> **cdk8s** is based on the design concepts and technologies behind the [AWS
Cloud Development Kit](https://aws.amazon.com/cdk), and can interoperate with
AWS CDK constructs to define cloud-native applications that include both
Kubernetes resources and other CDK constructs as first class citizens.

## Getting Started

Choose your weapon:

- [TypeScript](./docs/intro-typescript.md)
- [Python](./docs/intro-python.md)

## Examples

- [Hello!](./examples/hello/hello.ts) - a basic Kubernetes deployment
- [Web Service](./examples/web-service) - an example of using constructs to template a web service
- [Podinfo](./examples/podinfo/examples/app-example.ts) - an example of
  high-level APIs for Kubernetes objects.

## Help & Feedback

Interacting with the community and the development team is a great way to
contribute to the project. Please consider the following venues (in order):

* Search [open issues](./issues)
* Stack Overflow: [cdk8s](https://stackoverflow.com/questions/ask?tags=cdk8s)
* File a [new issue](./issues/new/choose)
* Mailing list: [cdk8s](https://groups.google.com/forum/#!forum/cdk8s)
* Slack: [cdk8s.slack.com](https://join.slack.com/t/cdk8s/shared_invite/enQtOTY0NTMzMzY4MjU3LWMyYzM2ZmQzOTAyZjAzY2E5MGNjNmJlMDgwZWQwM2M0YTAwMTE5MmE3ZGM3OWY2N2ZkYjQ3NjBkOWYwMDg0ZWU)

## Contributing

The cdk8s project adheres to the [CNCF Code of
Conduct](https://github.com/cncf/foundation/blob/master/code-of-conduct.md).

We welcome community contributions and pull requests. See our [contribution
guide](./CONTRIBUTING.md) for more information on how to report issues, set up a
development environment and submit code.

## Roadmap

See our [roadmap](https://github.com/awslabs/cdk8s/projects/1) for details about our plans for the project.

## License

This project is distributed under the [Apache License, Version 2.0](./LICENSE).
