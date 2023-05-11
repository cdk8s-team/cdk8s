package k8s


// DaemonSet represents the configuration of a daemon set.
type KubeDaemonSetProps struct {
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// The desired behavior of this daemon set.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *DaemonSetSpec `field:"optional" json:"spec" yaml:"spec"`
}

