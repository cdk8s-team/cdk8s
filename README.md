# Cloud Development Kit for Kubernetes

![](./website/static/images/opengraph.jpg)

![Stability:Beta](https://img.shields.io/badge/stability-beta-orange)
[![Website](https://github.com/cdk8s-team/cdk8s/workflows/website/badge.svg)](https://github.com/cdk8s-team/cdk8s/actions/workflows/website.yml)
[![cdk8s-core](https://img.shields.io/github/workflow/status/cdk8s-team/cdk8s-core/release?label=cdk8s-core&logo=GitHub)](https://github.com/cdk8s-team/cdk8s-core/actions/workflows/release.yml)
[![cdk8s-cli](https://img.shields.io/github/workflow/status/cdk8s-team/cdk8s-cli/release?label=cdk8s-cli&logo=GitHub)](https://github.com/cdk8s-team/cdk8s-cli/actions/workflows/release.yml)
[![npm version](https://badge.fury.io/js/cdk8s.svg)](https://badge.fury.io/js/cdk8s)
[![PyPI version](https://badge.fury.io/py/cdk8s.svg)](https://badge.fury.io/py/cdk8s)
[![NuGet version](https://badge.fury.io/nu/Org.Cdk8s.svg)](https://badge.fury.io/nu/Org.Cdk8s)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.cdk8s/cdk8s/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/org.cdk8s/cdk8s)
[![homebrew](https://img.shields.io/homebrew/v/cdk8s?color=brightgreen)](https://formulae.brew.sh/formula/cdk8s#default)

**cdk8s** is a software development framework for defining Kubernetes
applications and reusable abstractions using familiar programming languages and
rich object-oriented APIs. cdk8s generates pure Kubernetes YAML - you can use
cdk8s to define applications for any Kubernetes cluster running anywhere.

CDK8s is a [Cloud Native Computing Foundation](https://www.cncf.io) Sandbox Project, built with ❤️ at AWS. We encourage you to [try it out](#getting-started), [leave feedback](#help--feedback), and [jump in to help](#contributing)!

Contents:

- [Overview](#overview)
- [At a glance](#at-a-glance)
- [Getting Started](#getting-started)
- [Help & Feedback](#help--feedback)
- [Documentation](#documentation)
- [Examples](#examples)
- [Roadmap](#roadmap)
- [Community](#community)
- [Contributing](#contributing)
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

Read [our blog](https://aws.amazon.com/blogs/containers/introducing-cdk-for-kubernetes/) or [watch our CNCF webinar](https://www.cncf.io/webinars/end-yaml-engineering-with-cdk8s/) to learn more and see a live demo of cdk8s in action.

## At a glance

![](./website/static/images/animation.gif)

## Getting Started

See the [Getting Started](https://cdk8s.io/docs/latest/getting-started) guide in
[CDK8s Documentation](https://cdk8s.io/docs/).

## Help & Feedback

Interacting with the community and the development team is a great way to
contribute to the project. Please consider the following venues (in order):

- Search [open issues](https://github.com/cdk8s-team/cdk8s/issues)
- Stack Overflow: [cdk8s](https://stackoverflow.com/questions/tagged/cdk8s)
- File a [new issue](https://github.com/cdk8s-team/cdk8s/issues/new/choose)
- Mailing list: [cdk8s](https://groups.google.com/forum/#!forum/cdk8s)
- Slack: #cdk8s channel in [cdk.dev](https://cdk.dev)

## Documentation

See [CDK8s Documentation](https://cdk8s.io/docs).

## Examples

See our [Examples Directory](./examples).

## Roadmap

See our [roadmap](https://github.com/cdk8s-team/cdk8s/projects/1) for details about our plans for the project.

## Community

See [Awesome cdk8s](https://github.com/dungahk/awesome-cdk8s).

## Contributing

The cdk8s project adheres to the [CNCF Code of
Conduct](https://github.com/cncf/foundation/blob/master/code-of-conduct.md).

We welcome community contributions and pull requests. See our [contribution
guide](./CONTRIBUTING.md) for more information on how to report issues, set up a
development environment and submit code.

This project consists of multiple modules, maintained and released via the following repositories:

- [cdk8s-cli](https://github.com/cdk8s-team/cdk8s-cli): command-line interface
- [cdk8s-core](https://github.com/cdk8s-team/cdk8s-core): core library
- [cdk8s-plus](https://github.com/cdk8s-team/cdk8s-plus): high-level constructs for Kubernetes core.


Join us for the cdk8s community meeting which takes place the [2nd Tuesday of the month at 9:00am Pacific Time](https://www.thetimezoneconverter.com/?t=9:00&tz=PT%20%28Pacific%20Time%29).

* Meeting link: [https://chime.aws/7929414778](https://chime.aws/7929414778)
* [Agenda](https://docs.google.com/document/d/1QmZS2_cphxbs2VPfDCkrUVcoDwiawryh704hEfAyrBk/edit?usp=sharing)

## License

This project is distributed under the [Apache License, Version 2.0](./LICENSE).

