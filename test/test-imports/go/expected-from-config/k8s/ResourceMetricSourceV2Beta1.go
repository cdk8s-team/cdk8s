package k8s


// ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
type ResourceMetricSourceV2Beta1 struct {
	// name is the name of the resource in question.
	Name *string `field:"required" json:"name" yaml:"name"`
	// targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
	TargetAverageUtilization *float64 `field:"optional" json:"targetAverageUtilization" yaml:"targetAverageUtilization"`
	// targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type.
	TargetAverageValue Quantity `field:"optional" json:"targetAverageValue" yaml:"targetAverageValue"`
}

