package k8s


// SelfSubjectAccessReviewSpec is a description of the access request.
//
// Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set.
type SelfSubjectAccessReviewSpecV1Beta1 struct {
	// NonResourceAttributes describes information for a non-resource access request.
	NonResourceAttributes *NonResourceAttributesV1Beta1 `field:"optional" json:"nonResourceAttributes" yaml:"nonResourceAttributes"`
	// ResourceAuthorizationAttributes describes information for a resource access request.
	ResourceAttributes *ResourceAttributesV1Beta1 `field:"optional" json:"resourceAttributes" yaml:"resourceAttributes"`
}

