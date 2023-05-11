package k8s


// ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
type ObjectMetricSourceV2Beta1 struct {
	// metricName is the name of the metric in question.
	MetricName *string `field:"required" json:"metricName" yaml:"metricName"`
	// target is the described Kubernetes object.
	Target *CrossVersionObjectReferenceV2Beta1 `field:"required" json:"target" yaml:"target"`
	// targetValue is the target value of the metric (as a quantity).
	TargetValue Quantity `field:"required" json:"targetValue" yaml:"targetValue"`
	// averageValue is the target value of the average of the metric across all relevant pods (as a quantity).
	AverageValue Quantity `field:"optional" json:"averageValue" yaml:"averageValue"`
	// selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
	Selector *LabelSelector `field:"optional" json:"selector" yaml:"selector"`
}

