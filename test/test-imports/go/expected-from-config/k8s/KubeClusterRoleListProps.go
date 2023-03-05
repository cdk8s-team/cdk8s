// k8s
package k8s


// ClusterRoleList is a collection of ClusterRoles.
type KubeClusterRoleListProps struct {
	// Items is a list of ClusterRoles.
	Items *[]*KubeClusterRoleProps `field:"required" json:"items" yaml:"items"`
	// Standard object's metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

