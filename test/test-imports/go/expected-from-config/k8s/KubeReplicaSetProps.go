package k8s


// ReplicaSet ensures that a specified number of pod replicas are running at any given time.
type KubeReplicaSetProps struct {
	// If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s) that the ReplicaSet manages.
	//
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec defines the specification of the desired behavior of the ReplicaSet.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *ReplicaSetSpec `field:"optional" json:"spec" yaml:"spec"`
}

