package k8s


// EndpointSliceList represents a list of endpoint slices.
type KubeEndpointSliceListV1Beta1Props struct {
	// List of endpoint slices.
	Items *[]*KubeEndpointSliceV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

