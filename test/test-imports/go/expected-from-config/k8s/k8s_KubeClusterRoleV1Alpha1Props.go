// k8s
package k8s


// ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
//
// Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRole, and will no longer be served in v1.20.
type KubeClusterRoleV1Alpha1Props struct {
	// AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
	//
	// If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
	AggregationRule *AggregationRuleV1Alpha1 `field:"optional" json:"aggregationRule" yaml:"aggregationRule"`
	// Standard object's metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Rules holds all the PolicyRules for this ClusterRole.
	Rules *[]*PolicyRuleV1Alpha1 `field:"optional" json:"rules" yaml:"rules"`
}

