#!/usr/bin/env python
from aws_cdk.core import Construct
from cdk8s import App, Chart

from imports import k8s

class MyChart(Chart):
  def __init__(self, scope: Construct, ns: str, **kwargs):
    super().__init__(scope, ns, **kwargs)

    # define resources here
    k8s.Pod(self, 'pod',
      spec=k8s.PodSpec(
        containers=[
          k8s.Container(
            name="hello-kubernetes", 
            image="paulbouwer/hello-kubernetes:1.7",
            ports=[ k8s.ContainerPort(container_port=8080) ]
          )
        ]
      )
    )

app = App()
MyChart(app, "test")

app.synth()
