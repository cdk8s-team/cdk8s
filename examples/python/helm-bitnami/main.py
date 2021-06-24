#!/usr/bin/env python3
from constructs import Construct
from cdk8s import App, Chart, Helm

class MyChart(Chart):
    def __init__(self, scope: Construct, ns: str):
        super().__init__(scope, ns)

        Helm(self, 'redis',
            chart='bitnami/redis',
            values={
                'sentinel': {
                    'enabled': True
                }
            }
        )

app = App()
MyChart(app, "hello-helm")

app.synth()
