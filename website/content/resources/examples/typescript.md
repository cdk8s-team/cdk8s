# Examples in Typescript

Here are some examples for `cdk8s` using Typescript. Each example listed here can stand on its own and each has its own README with more details!

## /hello

[hello](https://github.com/awslabs/cdk8s/tree/master/examples/typescript/hello/README.md) is an example that deploys [hello-kubernetes](https://github.com/paulbouwer/hello-kubernetes) as a Service behind a LoadBalancer.

## /web-service

[web-service](https://github.com/awslabs/cdk8s/tree/master/examples/typescript/web-service/README.md) will show you how to make your first Contruct (a WebService) and that basically abstracts the `hello` example from earlier into a reusable piece of infrastructure.

## /crd

[crd](https://github.com/awslabs/cdk8s/tree/master/examples/typescript/crd/README.md) will show you how to use custom resource definitions [here](https://kubernetes.io/docs/concepts/extend-kubernetes/api-extension/custom-resources/) with `cdk8s`.

## podinfo

[podinfo](https://github.com/awslabs/cdk8s/tree/master/examples/typescript/podinfo/README.md) is an example that helps you deploy a basic web application ([podinfo](https://hub.docker.com/r/stefanprodan/podinfo)).
