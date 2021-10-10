# Hello cdk8s

This example application deploys [hello-kubernetes](https://github.com/paulbouwer/hello-kubernetes) using cdk8s.

You can apply this example into your own cluster with these step by step commands:

#### Build

```console
$ yarn gen
$ yarn install -L
$ yarn build
```

#### Synthesize the CDK into a k8s template
```console
yarn synth
```

#### Apply the k8s template to your cluster
```console
kubectl apply -f dist/hellok8s.k8s.yaml
```