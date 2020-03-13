#!/usr/bin/env python
from constructs import Construct
from cdk8s import App, Chart


class MyChart(Chart):
    def __init__(self, scope: Construct, ns: str):
        super().__init__(scope, ns)

        # define resources here


app = App()
MyChart(app, "{{ $base }}")

app.synth()
