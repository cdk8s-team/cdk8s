package k8s


// PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
type KubePodDisruptionBudgetListV1Beta1Props struct {
	Items *[]*KubePodDisruptionBudgetV1Beta1Props `field:"required" json:"items" yaml:"items"`
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

