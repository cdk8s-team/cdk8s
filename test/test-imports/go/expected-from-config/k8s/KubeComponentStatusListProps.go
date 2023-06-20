package k8s


// Status of all the conditions for the component as a list of ComponentStatus objects.
type KubeComponentStatusListProps struct {
	// List of ComponentStatus objects.
	Items *[]*KubeComponentStatusProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

