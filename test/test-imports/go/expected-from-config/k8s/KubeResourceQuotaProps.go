package k8s


// ResourceQuota sets aggregate quota restrictions enforced per namespace.
type KubeResourceQuotaProps struct {
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec defines the desired quota.
	//
	// https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *ResourceQuotaSpec `field:"optional" json:"spec" yaml:"spec"`
}

