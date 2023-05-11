package k8s


// StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates.
//
// It includes any additional parameters necessary to perform the update for the indicated strategy.
type StatefulSetUpdateStrategy struct {
	// RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
	RollingUpdate *RollingUpdateStatefulSetStrategy `field:"optional" json:"rollingUpdate" yaml:"rollingUpdate"`
	// Type indicates the type of the StatefulSetUpdateStrategy.
	//
	// Default is RollingUpdate.
	Type *string `field:"optional" json:"type" yaml:"type"`
}

