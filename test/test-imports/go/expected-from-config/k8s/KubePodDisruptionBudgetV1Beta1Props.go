// k8s
package k8s


// PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods.
type KubePodDisruptionBudgetV1Beta1Props struct {
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Specification of the desired behavior of the PodDisruptionBudget.
	Spec *PodDisruptionBudgetSpecV1Beta1 `field:"optional" json:"spec" yaml:"spec"`
}

