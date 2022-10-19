// k8s
package k8s


// ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
type ObjectMetricSourceV2Beta2 struct {
	DescribedObject *CrossVersionObjectReferenceV2Beta2 `field:"required" json:"describedObject" yaml:"describedObject"`
	// metric identifies the target metric by name and selector.
	Metric *MetricIdentifierV2Beta2 `field:"required" json:"metric" yaml:"metric"`
	// target specifies the target value for the given metric.
	Target *MetricTargetV2Beta2 `field:"required" json:"target" yaml:"target"`
}

