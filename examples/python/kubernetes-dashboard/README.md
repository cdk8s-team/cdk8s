# Kubernetes Dashboard Construct Example (in Python!)

This example application deploys [kubernetesui/dashboard](https://github.com/kubernetes/dashboard) by using a custom KubernetesDashboard construct with cdk8s.

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
$ kubectl apply -f dist/kubernetesdashboardpython.k8s.yaml
```