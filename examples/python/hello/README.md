# Hello cdk8s (in Python!)

This example application deploys [hello-kubernetes](https://github.com/paulbouwer/hello-kubernetes) using cdk8s.

You can apply this example into your own cluster with these step by step commands:

#### Import

```console
$ pipenv install
$ cdk8s import --language python
```

#### Synthesize the CDK into a k8s template
```console
$ cdk8s synth
```

#### Apply the k8s template to your cluster
```console
$ kubectl apply -f dist/hellopython.k8s.yaml
```