import { Construct } from 'constructs';
import * as k8s  from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';
import * as aws from 'aws-cdk-lib';
import * as eks from 'aws-cdk-lib/aws-eks';
import * as kubectl from '@aws-cdk/lambda-layer-kubectl-v25'

export class KubernetesEnd2End extends aws.Stack {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    const cluster = new eks.Cluster(this, 'Cluster', {
      version: eks.KubernetesVersion.V1_25,

      // match the cluster version to kubectl version
      kubectlLayer: new kubectl.KubectlV25Layer(this, 'Kubectl'),

      // allows the cluster to provision load balancers
      // for kubernetes service and ingress resources.
      albController: {
        version: eks.AlbControllerVersion.V2_4_1,
      },
    });

    // https://artifacthub.io/packages/helm/kubeview/kubeview
    cluster.addHelmChart('KubeView', {
      repository: 'https://benc-uk.github.io/kubeview/charts',
      chart: 'kubeview',
      namespace: 'kube-system',
      values: {
        // control the service name since we will need to
        // reference to it from our app
        fullnameOverride: 'kubeview'
      }
    });

    // the helm chart creates a load balancer backed service by default.
    // the load balancer is provisioned using the alb controller we configured
    // on the cluster
    const kubeViewAddress = cluster.getServiceLoadBalancerAddress('kubeview', {
      namespace: 'kube-system',
    });

    new aws.CfnOutput(this, 'KubeViewEndpoint', {
      value: `http://${kubeViewAddress}`
    });

    const chart = new k8s.Chart(new k8s.App(), 'HttpEcho');

    const deployment = new kplus.Deployment(chart, 'Deployment', {
      containers: [{
        image: 'hashicorp/http-echo',
        portNumber: 5678,
        args: ['-text', 'hello'],
        securityContext: {
          // required because the default image runs with a root user
          // and cdk8s-plus forbids that by default.
          user: 1005,
        }
      }],
    });

    const ingress = new kplus.Ingress(chart, 'Ingress');
    const service = deployment.exposeViaService({ serviceType: kplus.ServiceType.NODE_PORT });
    ingress.addRule('/', kplus.IngressBackend.fromService(service));

    const echoServer = cluster.addCdk8sChart(chart.node.id, chart, {
      ingressAlb: true,
      ingressAlbScheme: eks.AlbScheme.INTERNET_FACING,
    });

    // the deletion of `echoServer` is what instructs the controller to delete the ELB.
    // so we need to make sure this happens before the controller is deleted.
    echoServer.node.addDependency(cluster.albController ?? []);

    // our cluster is configured to automatically annotate ingress resource
    // such that they are backed by the alb controller.
    const appAddress = cluster.getIngressLoadBalancerAddress(ingress.name);

    new aws.CfnOutput(this, 'ApplicationEndpoint', {
      value: `http://${appAddress}`,
    })

  }

}

const app = new aws.App();
new KubernetesEnd2End(app, 'kubernetes-end-to-end');
app.synth();
