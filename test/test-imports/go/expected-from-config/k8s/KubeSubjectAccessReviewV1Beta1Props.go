package k8s


// SubjectAccessReview checks whether or not a user or group can perform an action.
type KubeSubjectAccessReviewV1Beta1Props struct {
	// Spec holds information about the request being evaluated.
	Spec *SubjectAccessReviewSpecV1Beta1 `field:"required" json:"spec" yaml:"spec"`
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

