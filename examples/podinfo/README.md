# PodInfo Container Example

This example application deploys [podinfo](https://hub.docker.com/r/stefanprodan/podinfo), a basic web application.

You can apply this example into your own cluster with these step by step commands:

#### Build

```console
$ yarn gen
$ yarn install -L
$ yarn build
```

#### Synthesize the CDK into a k8s template
```console
$ yarn synth
```

#### Apply the k8s template to your cluster
```console
$ kubectl apply -f dist/podinfo.k8s.yaml
```