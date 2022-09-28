// k8s
package k8s


// SelfSubjectRulesReview enumerates the set of actions the current user can perform within a namespace.
//
// The returned list of actions may be incomplete depending on the server's authorization mode, and any errors experienced during the evaluation. SelfSubjectRulesReview should be used by UIs to show/hide actions, or to quickly let an end user reason about their permissions. It should NOT Be used by external systems to drive authorization decisions as this raises confused deputy, cache lifetime/revocation, and correctness concerns. SubjectAccessReview, and LocalAccessReview are the correct way to defer authorization decisions to the API server.
type KubeSelfSubjectRulesReviewProps struct {
	// Spec holds information about the request being evaluated.
	Spec *SelfSubjectRulesReviewSpec `field:"required" json:"spec" yaml:"spec"`
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

