// k8s
package k8s


// PriorityClassList is a collection of priority classes.
type KubePriorityClassListProps struct {
	// items is the list of PriorityClasses.
	Items *[]*KubePriorityClassProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

