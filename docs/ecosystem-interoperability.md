# Ecosystem Interoperability

As we know, there are many [CDK based libraries](http://constructs.dev/) out there, and you might want to incorporate cdk8s along side other libraries in the same application.

!!! Example

    For example, you can use cdk8s to define charts in an AWS CDK application, and [apply them using the EKS construct library](https://docs.aws.amazon.com/cdk/api/v1/docs/aws-eks-readme.html#cdk8s-charts).

This ability, or interoperability, is based on the [constructs programming model](https://www.npmjs.com/package/constructs), which is the underlying technology on which all CDK libraries are built upon. All CDK libraries participating in the same application, must use the same major version of [constructs](https://www.npmjs.com/package/constructs), which currently has both a `3.x` and a `10.x` major version lines.

In order to incorporate `cdk8s` in applications that use either version line, we need to maintain two major versions of `cdk8s`, one for each version of `constructs`.

- Version `1.x` can be used along side libraries that depend on `constructs` version 3.x.

    > For example: [AWS CDK v1](https://constructs.dev/search?q=aws-cdk&cdk=aws-cdk&cdkver=1&offset=0).

- Version `2.x` can be used along side libraries that depend on `constructs` version 10.x.

    > For example: [AWS CDK v2](https://constructs.dev/search?q=aws-cdk&cdk=aws-cdk&cdkver=2&offset=0).
