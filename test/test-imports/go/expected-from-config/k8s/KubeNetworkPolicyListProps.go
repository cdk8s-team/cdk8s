package k8s


// NetworkPolicyList is a list of NetworkPolicy objects.
type KubeNetworkPolicyListProps struct {
	// Items is a list of schema objects.
	Items *[]*KubeNetworkPolicyProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

