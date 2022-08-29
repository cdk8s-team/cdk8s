// k8s
package k8s


// LocalSubjectAccessReview checks whether or not a user or group can perform an action in a given namespace.
//
// Having a namespace scoped resource makes it much easier to grant namespace scoped policy that includes permissions checking.
type KubeLocalSubjectAccessReviewV1Beta1Props struct {
	// Spec holds information about the request being evaluated.
	//
	// spec.namespace must be equal to the namespace you made the request against.  If empty, it is defaulted.
	Spec *SubjectAccessReviewSpecV1Beta1 `field:"required" json:"spec" yaml:"spec"`
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

