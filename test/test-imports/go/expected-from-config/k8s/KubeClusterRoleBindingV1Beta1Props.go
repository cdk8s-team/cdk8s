package k8s


// ClusterRoleBinding references a ClusterRole, but not contain it.
//
// It can reference a ClusterRole in the global namespace, and adds who information via Subject. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRoleBinding, and will no longer be served in v1.20.
type KubeClusterRoleBindingV1Beta1Props struct {
	// RoleRef can only reference a ClusterRole in the global namespace.
	//
	// If the RoleRef cannot be resolved, the Authorizer must return an error.
	RoleRef *RoleRefV1Beta1 `field:"required" json:"roleRef" yaml:"roleRef"`
	// Standard object's metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Subjects holds references to the objects the role applies to.
	Subjects *[]*SubjectV1Beta1 `field:"optional" json:"subjects" yaml:"subjects"`
}

