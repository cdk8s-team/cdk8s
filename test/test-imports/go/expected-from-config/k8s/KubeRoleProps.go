package k8s


// Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.
type KubeRoleProps struct {
	// Standard object's metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Rules holds all the PolicyRules for this Role.
	Rules *[]*PolicyRule `field:"optional" json:"rules" yaml:"rules"`
}

