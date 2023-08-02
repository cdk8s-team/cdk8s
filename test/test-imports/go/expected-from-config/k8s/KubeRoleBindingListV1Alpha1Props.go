package k8s


// RoleBindingList is a collection of RoleBindings Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 RoleBindingList, and will no longer be served in v1.20.
type KubeRoleBindingListV1Alpha1Props struct {
	// Items is a list of RoleBindings.
	Items *[]*KubeRoleBindingV1Alpha1Props `field:"required" json:"items" yaml:"items"`
	// Standard object's metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

