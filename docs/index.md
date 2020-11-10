# Overview

**CDK8s** is a software development framework for defining Kubernetes
applications and reusable abstractions using familiar programming languages and
rich object-oriented APIs. CDK8s generates pure Kubernetes YAML - you can use
CDK8s to define applications for any Kubernetes cluster running anywhere.

![demo](./assets/animation.gif)

Read [our blog](https://aws.amazon.com/blogs/containers/introducing-cdk-for-kubernetes/) or [watch our CNCF webinar](https://www.cncf.io/webinars/end-yaml-engineering-with-cdk8s/) to learn more and see a live demo of CDK8s in action.

## How does it work

**CDK8s** apps are programs written in one of the supported programming
languages. They are structured as a tree of
[constructs](https://github.com/aws/constructs).

The root of the tree is an `App` construct. Within an app, users define any
number of charts (classes that extend the `Chart` class). Each chart is
synthesized into a separate Kubernetes manifest file. Charts are, in turn,
composed of any number of constructs, and eventually from resources, which
represent any Kubernetes resource, such as `Pod`, `Service`, `Deployment`,
`ReplicaSet`, etc.

CDK8s apps only ***define*** Kubernetes applications, they don't actually apply
them to the cluster. When an app is executed, it *synthesizes* all the charts
defined within the app into the `dist` directory, and then those charts can be
applied to any Kubernetes cluster using `kubectl apply -f dist/chart.k8s.yaml` or a GitOps tool like [Flux](https://fluxcd.io/).

> **CDK8s** is based on the design concepts and technologies behind the [AWS
Cloud Development Kit](https://aws.amazon.com/cdk), and can interoperate with
AWS CDK constructs to define cloud-native applications that include both
Kubernetes resources and other CDK constructs as first class citizens.
