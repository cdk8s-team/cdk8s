package k8s


// ClusterRoleBindingList is a collection of ClusterRoleBindings.
type KubeClusterRoleBindingListProps struct {
	// Items is a list of ClusterRoleBindings.
	Items *[]*KubeClusterRoleBindingProps `field:"required" json:"items" yaml:"items"`
	// Standard object's metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

