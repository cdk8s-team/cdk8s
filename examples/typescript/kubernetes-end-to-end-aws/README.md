# Kubernetes End-2-End | AWS

In this example, we will walk through an end-to-end guide for deploying
a Kubernetes application from scratch. We will:

1. Provision an Amazon EKS cluster.
2. Install the [AWS Load Balancer Controller](https://kubernetes-sigs.github.io/aws-load-balancer-controller) onto the cluster.
3. Install the KubeView cluster visualiser onto the cluster.
4. Deploy a Kubernetes workload.

Since we are deploying to AWS, we will use the AWS CDK as our framework. AWS CDK integrates
with Helm, which we will use for common middleware, and cdk8s, which we will use for our application.
This allows us to define all our components in the same codebase, and deploy it all with a single tool.

### 0) Setting Up

Create a new directory and install the necessary dependencies:

```console
mkdir kubernetes-end-to-end
cd kubernetes-end-to-end
npm install aws-cdk aws-cdk-lib cdk8s cdk8s-plus-25 @aws-cdk/lambda-layer-kubectl-v25 constructs
```

> Don't worry if some dependencies are not clear just yet, they will be.

Also, to make sure we run the expected tools, add the directory to your $PATH.

```console
export PATH=./node_modules/.bin:${PATH}
```

From this point on, run the commands in the `kubernetes-end-to-end` directory.

For simplicity, we will write all the code in a single file. Call it `main.ts`
and open in your favorite editor. Add the follwing AWS CDK stack skeleton, this
if where we'll add our resources to:

```ts
import { Construct } from 'constructs';
import * as k8s  from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';
import * as aws from 'aws-cdk-lib';
import * as eks from 'aws-cdk-lib/aws-eks';
import * as kubectl from '@aws-cdk/lambda-layer-kubectl-v25'

export class KubernetesEnd2End extends aws.Stack {
  constructor(scope: Construct, name: string) {
    super(scope, name);
  }
}

const app = new aws.App();
new KubernetesEnd2End(app, 'kubernetes-end-to-end');
app.synth();
```

Each following step provides the code to be added

### 1) Provision an Amazon EKS cluster

AWS CDK provides a construct library for defining EKS clusters. All you need to do
is specify a version, and it will create a 2 node cluster inside a dedicated VPC.

In addition, the `eks.Cluster` construct is able to apply Kubernetes manifests onto the
cluster (we will use that capability later) via the `kubectl` utility.
Kubernetes recommends to always match the version of `kubectl` to the version of your
cluster, which can be done via the `kubectlLayer` property.

```ts
const cluster = new eks.Cluster(this, 'Cluster', {
  version: eks.KubernetesVersion.V1_25,

  // match the cluster version to kubectl version
  kubectlLayer: new kubectl.KubectlV25Layer(this, 'Kubectl'),
});
```

### 2) Install the AWS Load Balancer Controller

In order to access applications inside those clusters from the internet,
the cluster needs the ability to provision on-demand AWS load balancers that
route to internal Kubernetes services. The [AWS Load Balancer Controller](https://kubernetes-sigs.github.io/aws-load-balancer-controller) enables just that, and can be installed
via the `albController` property.

```ts
const cluster = new eks.Cluster(this, 'Cluster', {
  vpc,
  version: eks.KubernetesVersion.V1_25,

  // match the cluster version to kubectl version
  kubectlLayer: new kubectl.KubectlV25Layer(this, 'Kubectl'),

  // allows the cluster to provision load balancers
  // for kubernetes service and ingress resources.
  albController: {
    version: eks.AlbControllerVersion.V2_4_1,
  },
});
```

### 3) Install KubeView

```ts
// https://artifacthub.io/packages/helm/kubeview/kubeview
cluster.addHelmChart('KubeView', {
  repository: 'https://benc-uk.github.io/kubeview/charts',
  chart: 'kubeview',
  namespace: 'kube-system',
  values: {
    // control the service name since we will need to
    // refernece to it from our app
    fullnameOverride: 'kubeview'
  }
});
```

### 4) Deploy the Application
