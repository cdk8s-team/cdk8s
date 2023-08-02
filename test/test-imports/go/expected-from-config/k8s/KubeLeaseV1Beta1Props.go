package k8s


// Lease defines a lease concept.
type KubeLeaseV1Beta1Props struct {
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Specification of the Lease.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *LeaseSpecV1Beta1 `field:"optional" json:"spec" yaml:"spec"`
}

