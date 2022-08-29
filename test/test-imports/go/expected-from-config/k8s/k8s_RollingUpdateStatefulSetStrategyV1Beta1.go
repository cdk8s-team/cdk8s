// k8s
package k8s


// RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
type RollingUpdateStatefulSetStrategyV1Beta1 struct {
	// Partition indicates the ordinal at which the StatefulSet should be partitioned.
	Partition *float64 `field:"optional" json:"partition" yaml:"partition"`
}

