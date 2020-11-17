#!/usr/bin/env python
from constructs import Construct
from cdk8s import App, Chart


class MyChart(Chart):
    def __init__(self, scope: Construct, id: str):
        super().__init__(scope, id)

        # define resources here


app = App()
MyChart(app, "{{ $base }}")

app.synth()
