package k8s


// SelfSubjectAccessReviewSpec is a description of the access request.
//
// Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set.
type SelfSubjectAccessReviewSpec struct {
	// NonResourceAttributes describes information for a non-resource access request.
	NonResourceAttributes *NonResourceAttributes `field:"optional" json:"nonResourceAttributes" yaml:"nonResourceAttributes"`
	// ResourceAuthorizationAttributes describes information for a resource access request.
	ResourceAttributes *ResourceAttributes `field:"optional" json:"resourceAttributes" yaml:"resourceAttributes"`
}

