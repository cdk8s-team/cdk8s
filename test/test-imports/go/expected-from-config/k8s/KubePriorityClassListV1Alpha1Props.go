package k8s


// PriorityClassList is a collection of priority classes.
type KubePriorityClassListV1Alpha1Props struct {
	// items is the list of PriorityClasses.
	Items *[]*KubePriorityClassV1Alpha1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

