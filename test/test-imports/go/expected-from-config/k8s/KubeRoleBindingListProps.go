package k8s


// RoleBindingList is a collection of RoleBindings.
type KubeRoleBindingListProps struct {
	// Items is a list of RoleBindings.
	Items *[]*KubeRoleBindingProps `field:"required" json:"items" yaml:"items"`
	// Standard object's metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

