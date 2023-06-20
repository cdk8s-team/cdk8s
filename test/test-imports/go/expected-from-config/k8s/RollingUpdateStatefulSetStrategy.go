package k8s


// RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
type RollingUpdateStatefulSetStrategy struct {
	// Partition indicates the ordinal at which the StatefulSet should be partitioned.
	//
	// Default value is 0.
	Partition *float64 `field:"optional" json:"partition" yaml:"partition"`
}

