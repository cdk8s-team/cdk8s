// k8s
package k8s


// DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
type KubePriorityClassV1Alpha1Props struct {
	// The value of this priority class.
	//
	// This is the actual priority that pods receive when they have the name of this class in their pod spec.
	Value *float64 `field:"required" json:"value" yaml:"value"`
	// description is an arbitrary string that usually provides guidelines on when this priority class should be used.
	Description *string `field:"optional" json:"description" yaml:"description"`
	// globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class.
	//
	// Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
	GlobalDefault *bool `field:"optional" json:"globalDefault" yaml:"globalDefault"`
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// PreemptionPolicy is the Policy for preempting pods with lower priority.
	//
	// One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
	PreemptionPolicy *string `field:"optional" json:"preemptionPolicy" yaml:"preemptionPolicy"`
}

