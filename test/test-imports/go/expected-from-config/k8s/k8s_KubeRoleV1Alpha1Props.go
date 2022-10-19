// k8s
package k8s


// Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.
//
// Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 Role, and will no longer be served in v1.20.
type KubeRoleV1Alpha1Props struct {
	// Standard object's metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Rules holds all the PolicyRules for this Role.
	Rules *[]*PolicyRuleV1Alpha1 `field:"optional" json:"rules" yaml:"rules"`
}

