package k8s


// StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates.
//
// It includes any additional parameters necessary to perform the update for the indicated strategy.
type StatefulSetUpdateStrategyV1Beta1 struct {
	// RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
	RollingUpdate *RollingUpdateStatefulSetStrategyV1Beta1 `field:"optional" json:"rollingUpdate" yaml:"rollingUpdate"`
	// Type indicates the type of the StatefulSetUpdateStrategy.
	Type *string `field:"optional" json:"type" yaml:"type"`
}

