package k8s


// specification of a horizontal pod autoscaler.
type HorizontalPodAutoscalerSpec struct {
	// upper limit for the number of pods that can be set by the autoscaler;
	//
	// cannot be smaller than MinReplicas.
	MaxReplicas *float64 `field:"required" json:"maxReplicas" yaml:"maxReplicas"`
	// reference to scaled resource;
	//
	// horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
	ScaleTargetRef *CrossVersionObjectReference `field:"required" json:"scaleTargetRef" yaml:"scaleTargetRef"`
	// minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
	//
	// It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
	MinReplicas *float64 `field:"optional" json:"minReplicas" yaml:"minReplicas"`
	// target average CPU utilization (represented as a percentage of requested CPU) over all the pods;
	//
	// if not specified the default autoscaling policy will be used.
	TargetCpuUtilizationPercentage *float64 `field:"optional" json:"targetCpuUtilizationPercentage" yaml:"targetCpuUtilizationPercentage"`
}

