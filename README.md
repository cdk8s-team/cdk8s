# Cloud Development Kit for Kubernetes

![](./website/static/images/animation.gif)

[![Website](https://github.com/cdk8s-team/cdk8s/workflows/website/badge.svg)](https://github.com/cdk8s-team/cdk8s/actions/workflows/website.yml)
[![cdk8s](https://img.shields.io/github/workflow/status/cdk8s-team/cdk8s-core/release?label=cdk8s&logo=GitHub)](https://github.com/cdk8s-team/cdk8s-core/actions/workflows/release.yml)
[![cdk8s-cli](https://img.shields.io/github/workflow/status/cdk8s-team/cdk8s-cli/release?label=cdk8s-cli&logo=GitHub)](https://github.com/cdk8s-team/cdk8s-cli/actions/workflows/release.yml)
[![cdk8s-plus-23](https://img.shields.io/github/workflow/status/cdk8s-team/cdk8s-plus/release-k8s.21?label=cdk8s-plus-23&logo=GitHub)](https://github.com/cdk8s-team/cdk8s-plus/actions/workflows/release-k8s.23.yml)
[![cdk8s-plus-24](https://img.shields.io/github/workflow/status/cdk8s-team/cdk8s-plus/release-k8s.20?label=cdk8s-plus-24&logo=GitHub)](https://github.com/cdk8s-team/cdk8s-plus/actions/workflows/release-k8s.24.yml)
[![cdk8s-plus-25](https://img.shields.io/github/workflow/status/cdk8s-team/cdk8s-plus/release-k8s.20?label=cdk8s-plus-25&logo=GitHub)](https://github.com/cdk8s-team/cdk8s-plus/actions/workflows/release-k8s.25.yml)
[![npm version](https://badge.fury.io/js/cdk8s.svg)](https://badge.fury.io/js/cdk8s)
[![PyPI version](https://badge.fury.io/py/cdk8s.svg)](https://badge.fury.io/py/cdk8s)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.cdk8s/cdk8s/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/org.cdk8s/cdk8s)
[![Known Vulnerabilities](https://snyk.io/test/github/cdk8s-team/cdk8s/badge.svg)](https://snyk.io/test/github/cdk8s-team/cdk8s)

[![View on Construct Hub](https://constructs.dev/badge?package=cdk8s)](https://constructs.dev/packages/cdk8s)

**cdk8s** is an open-source software development framework for defining Kubernetes applications and reusable abstractions using familiar
programming languages and rich object-oriented APIs. cdk8s apps synthesize into standard Kubernetes
manifests which can be applied to any Kubernetes cluster.

cdk8s is a [Cloud Native Computing Foundation](https://www.cncf.io) Sandbox Project, built with ❤️ at AWS. We encourage you to [try it out](#getting-started), [leave feedback](#help--feedback), and [jump in to help](#contributing)!

Contents:

- [Repositories](#repositories)
- [Overview](#overview)
- [Getting Started](#getting-started)
- [Help \& Feedback](#help--feedback)
- [Documentation](#documentation)
- [Examples](#examples)
- [Roadmap](#roadmap)
- [Community](#community)
- [Contributing](#contributing)
- [CDK8s.io website](#cdk8sio-website)
- [License](#license)

## Repositories

This project consists of multiple packages, maintained and released via the following repositories:

- [cdk8s](https://github.com/cdk8s-team/cdk8s-core) - Core library. For historical reasons note that the [`cdk8s`](https://www.npmjs.com/package/cdk8s) package is maintained in the `cdk8s-team/cdk8s-core` repository.
- [cdk8s-cli](https://github.com/cdk8s-team/cdk8s-cli) - Command-Line interface.
- [cdk8s-plus](https://github.com/cdk8s-team/cdk8s-plus) - High-Level constructs for Kubernetes core.

The current repository acts as an umbrella repository for cross module concerns, as well as the deployment of [`cdk8s.io`](https://cdk8s.io)

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

## Getting Started

See the [Getting Started](https://cdk8s.io/docs/latest/getting-started) guide in
[cdk8s Documentation](https://cdk8s.io/docs/).

## Help & Feedback

Interacting with the community and the development team is a great way to
contribute to the project. Please consider the following venues (in order):

- Search [open issues](https://github.com/cdk8s-team/cdk8s/issues)
- Stack Overflow: [cdk8s](https://stackoverflow.com/questions/tagged/cdk8s)
- File a [new issue](https://github.com/cdk8s-team/cdk8s/issues/new/choose)
- Mailing list: [cdk8s](https://groups.google.com/forum/#!forum/cdk8s)
- Slack: #cdk8s channel in [cdk.dev](https://cdk.dev)

## Documentation

See [cdk8s Documentation](https://cdk8s.io/docs).

## Examples

See our [Examples Directory](./examples).

## Roadmap

See our [roadmap](https://github.com/cdk8s-team/cdk8s/projects/1) for details about our plans for the project.

## Community

See [Awesome cdk8s](https://github.com/dungahk/awesome-cdk8s).

If you're a cdk8s user please consider adding your name to the [ADOPTERS](./ADOPTERS.md) file.

## Contributing

The cdk8s project adheres to the [CNCF Code of
Conduct](https://github.com/cncf/foundation/blob/master/code-of-conduct.md).

We welcome community contributions and pull requests. See our [contribution
guide](./CONTRIBUTING.md) for more information on how to report issues, set up a
development environment and submit code.

Join us for the cdk8s community meeting which takes place the [2nd Tuesday of the month at 9:00am Pacific Time](https://www.thetimezoneconverter.com/?t=9:00&tz=PT%20%28Pacific%20Time%29).

* Meeting link: [https://chime.aws/7929414778](https://chime.aws/7929414778)
* [Agenda](https://docs.google.com/document/d/1QmZS2_cphxbs2VPfDCkrUVcoDwiawryh704hEfAyrBk/edit?usp=sharing)

## CDK8s.io website

See [Docs Directory](./docs/README.md).

## License

This project is distributed under the [Apache License, Version 2.0](./LICENSE).
