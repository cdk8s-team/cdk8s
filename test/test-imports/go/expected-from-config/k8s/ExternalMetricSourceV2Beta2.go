package k8s


// ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
type ExternalMetricSourceV2Beta2 struct {
	// metric identifies the target metric by name and selector.
	Metric *MetricIdentifierV2Beta2 `field:"required" json:"metric" yaml:"metric"`
	// target specifies the target value for the given metric.
	Target *MetricTargetV2Beta2 `field:"required" json:"target" yaml:"target"`
}

