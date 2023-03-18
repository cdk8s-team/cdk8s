import { Construct } from 'constructs';
import * as k8s  from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';
import * as aws from 'aws-cdk-lib';
import * as ec2 from 'aws-cdk-lib/aws-ec2';
import * as eks from 'aws-cdk-lib/aws-eks';
import * as kubectl from '@aws-cdk/lambda-layer-kubectl-v24'

export class MyStack extends aws.Stack {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    const vpc = new ec2.Vpc(this, 'Vpc', { maxAzs: 2, natGateways: 1 });

    const cluster = new eks.Cluster(this, 'Cluster', {
      vpc,
      version: eks.KubernetesVersion.V1_25,

      // allows the cluster to provision load balancers
      // for kubernetes service and ingress resources.
      albController: {
        version: eks.AlbControllerVersion.V2_4_1,
      },

      kubectlLayer: new kubectl.KubectlV24Layer(this, 'Kubectl'),
    });

    // https://artifacthub.io/packages/helm/kubeview/kubeview
    cluster.addHelmChart('KubeView', {
      repository: 'https://benc-uk.github.io/kubeview/charts',
      chart: 'kubeview',
      values: {
        // control the service name since we will need to
        // refernece to it from our app
        fullnameOverride: 'kubeview'
      }
    });

    // the helm chart creates a load balancer backed service by default.
    // the load balancer is provisioned using the alb controller we configured
    // on the cluster
    const kubeViewAddress = cluster.getServiceLoadBalancerAddress('kubeview');

    new aws.CfnOutput(this, 'KubeViewEndpoint', {
      value: `http://${kubeViewAddress}`
    });

    const chart = new k8s.Chart(new k8s.App(), 'HttpEcho');
    const ingress = new kplus.Ingress(chart, 'Ingress');

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

    const service = deployment.exposeViaService({ serviceType: kplus.ServiceType.NODE_PORT });
    ingress.addRule('/', kplus.IngressBackend.fromService(service));

    cluster.addCdk8sChart(chart.node.id, chart, {
      ingressAlb: true,
      ingressAlbScheme: eks.AlbScheme.INTERNET_FACING,
    });

    // our cluster is configured to automatically annotate ingress resource
    // such that they are backed by the alb controller.
    const appAddress = cluster.getIngressLoadBalancerAddress(ingress.name);

    new aws.CfnOutput(this, 'ApplicationEndpoint', {
      value: `http://${appAddress}`,
    })


  }

}

const app = new aws.App();
new MyStack(app, 'cdk8s-aws-cdk');
app.synth();
