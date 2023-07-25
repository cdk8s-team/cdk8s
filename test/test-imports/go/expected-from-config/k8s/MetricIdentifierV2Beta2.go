package k8s


// MetricIdentifier defines the name and optionally selector for a metric.
type MetricIdentifierV2Beta2 struct {
	// name is the name of the given metric.
	Name *string `field:"required" json:"name" yaml:"name"`
	// selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
	//
	// When unset, just the metricName will be used to gather metrics.
	Selector *LabelSelector `field:"optional" json:"selector" yaml:"selector"`
}

