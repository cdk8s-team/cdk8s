// k8s
package k8s


// TokenReview attempts to authenticate a token to a known user.
//
// Note: TokenReview requests may be cached by the webhook token authenticator plugin in the kube-apiserver.
type KubeTokenReviewV1Beta1Props struct {
	// Spec holds information about the request being evaluated.
	Spec *TokenReviewSpecV1Beta1 `field:"required" json:"spec" yaml:"spec"`
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

