package k8s


// RoleList is a collection of Roles.
type KubeRoleListProps struct {
	// Items is a list of Roles.
	Items *[]*KubeRoleProps `field:"required" json:"items" yaml:"items"`
	// Standard object's metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

