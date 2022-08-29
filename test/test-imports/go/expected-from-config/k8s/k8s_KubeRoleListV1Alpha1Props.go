// k8s
package k8s


// RoleList is a collection of Roles.
//
// Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 RoleList, and will no longer be served in v1.20.
type KubeRoleListV1Alpha1Props struct {
	// Items is a list of Roles.
	Items *[]*KubeRoleV1Alpha1Props `field:"required" json:"items" yaml:"items"`
	// Standard object's metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

