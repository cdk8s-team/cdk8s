// k8s
package k8s


// ClusterRoleList is a collection of ClusterRoles.
//
// Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRoles, and will no longer be served in v1.20.
type KubeClusterRoleListV1Beta1Props struct {
	// Items is a list of ClusterRoles.
	Items *[]*KubeClusterRoleV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard object's metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

