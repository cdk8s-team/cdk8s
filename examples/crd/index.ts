import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';

import { Jenkins } from './imports/jenkins';
import { ClusterInstallation } from './imports/clusterinstallation';

export class HelloKube extends Chart {
  constructor(scope: Construct, id: string) {
    super(scope, id);

    new Jenkins(this, 'jenkins', {
      spec: {
        seedJobs: [
          {
            description: 'Jenkins Operator repository',
            id: 'jenkins-operator',
            repositoryBranch: 'master',
            repositoryUrl: 'https://github.com/jenkinsci/kubernetes-operator.git',
            targets: 'cicd/jobs/*.jenkins'
          }
        ],
        jenkinsAPISettings: {
          authorizationStrategy: 'foo'
        },
        master: {
          disableCSRFProtection: false
        }
      }
    });

    // mattermost cluster installation
    new ClusterInstallation(this, 'foo', {
      spec: {
        ingressName: 'example.mattermost-example.dev',
        replicas: 2,
        minio: {
          storageSize: '10Gi',
          replicas: 4,
        },
        database: {
          storageSize: '10Gi',
          replicas: 4
        },
        useServiceLoadBalancer: true,
        serviceAnnotations: {
          'service.beta.kubernetes.io/aws-load-balancer-backend-protocol': 'tcp',
          'service.beta.kubernetes.io/aws-load-balancer-ssl-cert': 'arn:aws:acm:us-east-1:xxxx:certificate/xxxxx-xxx-xxx-xxx-xxxxx',
          'service.beta.kubernetes.io/aws-load-balancer-ssl-ports': 'https'
        },
        mattermostLicenseSecret: 'mattermost-license'
      }
    });
  }
}

const app = new App();
new HelloKube(app, 'hello-k8s');
app.synth();