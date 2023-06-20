package k8s


// ReplicationController represents the configuration of a replication controller.
type KubeReplicationControllerProps struct {
	// If the Labels of a ReplicationController are empty, they are defaulted to be the same as the Pod(s) that the replication controller manages.
	//
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec defines the specification of the desired behavior of the replication controller.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *ReplicationControllerSpec `field:"optional" json:"spec" yaml:"spec"`
}

