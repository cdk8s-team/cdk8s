#!/usr/bin/env python3
from constructs import Construct
from cdk8s import App, Chart

from imports import k8s

class MyChart(Chart):
    def __init__(self, scope: Construct, ns: str):
        super().__init__(scope, ns)

        label = {"app": "hello-k8s"}

        k8s.KubeService(self, 'service',
            spec=k8s.ServiceSpec(
                type='LoadBalancer',
                ports=[k8s.ServicePort(port=80, target_port=k8s.IntOrString.from_number(8080))],
                selector=label))

        k8s.KubeDeployment(self, 'deployment',
            spec=k8s.DeploymentSpec(
                replicas=2,
                selector=k8s.LabelSelector(match_labels=label),
                template=k8s.PodTemplateSpec(
                metadata=k8s.ObjectMeta(labels=label),
                spec=k8s.PodSpec(containers=[
                    k8s.Container(
                    name='hello-kubernetes',
                    image='paulbouwer/hello-kubernetes:1.7',
                    ports=[k8s.ContainerPort(container_port=8080)])]))))

app = App()
MyChart(app, "hello-python")

app.synth()
