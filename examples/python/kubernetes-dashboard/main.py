#!/usr/bin/env python3
from cdk8s import App, Chart
from constructs import Construct

from kubernetes_dashboard import KubernetesDashboard


class MyChart(Chart):
    def __init__(self, scope: Construct, ns: str):
        super().__init__(scope, ns)

        KubernetesDashboard(self, "kubernetes-dashboard")


app = App()
MyChart(app, "kubernetes-dashboard-python")
app.synth()
