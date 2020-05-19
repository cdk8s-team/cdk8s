# Examples in Typescript

Here is a directory of examples for `cdk8s` using Typescript. Each example in this directory can stand on its own and each has its own README with more details!

## /hello

[hello](./hello/README.md) is an example that deploys [hello-kubernetes](https://github.com/paulbouwer/hello-kubernetes) as a Service behind a LoadBalancer.

## /web-service

[web-service](./web-service/README.md) will show you how to make your first Contruct (a WebService) and that basically abstracts the `hello` example from earlier into a reusable piece of infrastructure.

## /crd

[crd](./crd/README.md) will show you how to use custom resource definitions [here](https://kubernetes.io/docs/concepts/extend-kubernetes/api-extension/custom-resources/) with `cdk8s`.

## podinfo

[podinfo](./podinfo/README.md) is an example that helps you deploy a basic web application ([podinfo](https://hub.docker.com/r/stefanprodan/podinfo)).
