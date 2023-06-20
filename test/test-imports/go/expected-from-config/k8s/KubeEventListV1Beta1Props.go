package k8s


// EventList is a list of Event objects.
type KubeEventListV1Beta1Props struct {
	// Items is a list of schema objects.
	Items *[]*KubeEventV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

