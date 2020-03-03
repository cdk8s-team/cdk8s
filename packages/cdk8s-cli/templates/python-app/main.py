#!/usr/bin/env python
from aws_cdk.core import Construct
from cdk8s import App, Chart

class MyChart(Chart):
  def __init__(self, scope: Construct, ns: str, **kwargs):
    super().__init__(scope, ns, **kwargs)

    # define resources here

app = App()
MyChart(app, "{{ $base }}")

app.synth()
