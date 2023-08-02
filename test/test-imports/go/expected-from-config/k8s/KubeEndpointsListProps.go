package k8s


// EndpointsList is a list of endpoints.
type KubeEndpointsListProps struct {
	// List of endpoints.
	Items *[]*KubeEndpointsProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

