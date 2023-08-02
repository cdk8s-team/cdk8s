package k8s


// ControllerRevisionList is a resource containing a list of ControllerRevision objects.
type KubeControllerRevisionListProps struct {
	// Items is the list of ControllerRevisions.
	Items *[]*KubeControllerRevisionProps `field:"required" json:"items" yaml:"items"`
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

