// k8s
package k8s


// PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
type PodDisruptionBudgetSpecV1Beta1 struct {
	// An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
	MaxUnavailable IntOrString `field:"optional" json:"maxUnavailable" yaml:"maxUnavailable"`
	// An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
	MinAvailable IntOrString `field:"optional" json:"minAvailable" yaml:"minAvailable"`
	// Label query over pods whose evictions are managed by the disruption budget.
	Selector *LabelSelector `field:"optional" json:"selector" yaml:"selector"`
}

