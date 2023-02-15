// k8s
package k8s


// ClusterRoleBindingList is a collection of ClusterRoleBindings.
//
// Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRoleBindingList, and will no longer be served in v1.20.
type KubeClusterRoleBindingListV1Beta1Props struct {
	// Items is a list of ClusterRoleBindings.
	Items *[]*KubeClusterRoleBindingV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard object's metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

