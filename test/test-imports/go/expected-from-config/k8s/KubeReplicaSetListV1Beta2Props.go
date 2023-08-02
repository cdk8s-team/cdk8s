package k8s


// ReplicaSetList is a collection of ReplicaSets.
type KubeReplicaSetListV1Beta2Props struct {
	// List of ReplicaSets.
	//
	// More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
	Items *[]*KubeReplicaSetV1Beta2Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

