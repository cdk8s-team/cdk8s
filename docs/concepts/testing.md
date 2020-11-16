# Testing

cdk8s bundles a set of test utilities under the `Testing` class:

* `Testing.app()` returns an `App` object bound to a temporary output directory.
* `Testing.chart()` returns a `Chart` object bound to a testing app.
* `Testing.synth(chart)` returns the Kubernetes manifest synthesized from a
  chart.
