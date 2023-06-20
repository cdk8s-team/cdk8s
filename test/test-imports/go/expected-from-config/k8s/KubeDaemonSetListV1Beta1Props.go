package k8s


// DaemonSetList is a collection of daemon sets.
type KubeDaemonSetListV1Beta1Props struct {
	// A list of daemon sets.
	Items *[]*KubeDaemonSetV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

