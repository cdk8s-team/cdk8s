#!/usr/bin/env python3
from constructs import Construct
from cdk8s import App, Chart

from imports import jenkins
from imports import clusterinstallation

class MyChart(Chart):
    def __init__(self, scope: Construct, ns: str):
        super().__init__(scope, ns)

        jenkins.Jenkins(self, "jenkins",
          spec=jenkins.JenkinsSpec(
            seed_jobs=[jenkins.JenkinsSpecSeedJobs(
              description="Jenkins Operator repository",
              id="jenkins-operator",
              repository_branch="master",
              repository_url="https://github.com/jenkinsci/kubernetes-operator.git",
              targets="cicd/jobs/*.jenkins"
            )],
            jenkins_api_settings=jenkins.JenkinsSpecJenkinsApiSettings(authorization_strategy="foo"),
            master=jenkins.JenkinsSpecMaster(disable_csrf_protection=False)
          )
        )

        clusterinstallation.ClusterInstallation(self, "foo",
          spec=clusterinstallation.ClusterInstallationSpec(
            ingress_name="example.mattermost-example.dev",
            replicas=2,
            minio=clusterinstallation.ClusterInstallationSpecMinio(
              storage_size="10Gi",
              replicas=4
            ),
            database=clusterinstallation.ClusterInstallationSpecDatabase(
              storage_size="10Gi",
              replicas=4
            ),
            use_service_load_balancer=True,
            service_annotations={
              "service.beta.kubernetes.io/aws-load-balancer-backend-protocol":"tcp",
              "service.beta.kubernetes.io/aws-load-balancer-ssl-cert":"arn:aws:acm:us-east-1:xxxx:certificate/xxxxx-xxx-xxx-xxx-xxxxx",
              "service.beta.kubernetes.io/aws-load-balancer-ssl-ports":"https"
            },
            mattermost_license_secret="mattermost-license"
          )
        )

app = App()
MyChart(app, "crd-python")

app.synth() 