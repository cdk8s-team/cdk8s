// k8s
package k8s


// RoleBinding references a role, but does not contain it.
//
// It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace.
type KubeRoleBindingProps struct {
	// RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
	//
	// If the RoleRef cannot be resolved, the Authorizer must return an error.
	RoleRef *RoleRef `field:"required" json:"roleRef" yaml:"roleRef"`
	// Standard object's metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Subjects holds references to the objects the role applies to.
	Subjects *[]*Subject `field:"optional" json:"subjects" yaml:"subjects"`
}

