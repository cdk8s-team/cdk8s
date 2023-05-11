package k8s


// IngressList is a collection of Ingress.
type KubeIngressListV1Beta1Props struct {
	// Items is the list of Ingress.
	Items *[]*KubeIngressV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

