// k8s
package k8s


// SelfSubjectAccessReview checks whether or the current user can perform an action.
//
// Not filling in a spec.namespace means "in all namespaces".  Self is a special case, because users should always be able to check whether they can perform an action
type KubeSelfSubjectAccessReviewProps struct {
	// Spec holds information about the request being evaluated.
	//
	// user and groups must be empty.
	Spec *SelfSubjectAccessReviewSpec `field:"required" json:"spec" yaml:"spec"`
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

