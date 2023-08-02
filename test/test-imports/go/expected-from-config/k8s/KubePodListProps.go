package k8s


// PodList is a list of Pods.
type KubePodListProps struct {
	// List of pods.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md
	Items *[]*KubePodProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

