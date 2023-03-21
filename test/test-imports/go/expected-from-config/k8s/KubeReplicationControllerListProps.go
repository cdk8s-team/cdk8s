// k8s
package k8s


// ReplicationControllerList is a collection of replication controllers.
type KubeReplicationControllerListProps struct {
	// List of replication controllers.
	//
	// More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
	Items *[]*KubeReplicationControllerProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

