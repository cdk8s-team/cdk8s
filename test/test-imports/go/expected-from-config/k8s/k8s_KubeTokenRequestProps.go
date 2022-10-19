// k8s
package k8s


// TokenRequest requests a token for a given service account.
type KubeTokenRequestProps struct {
	Spec *TokenRequestSpec `field:"required" json:"spec" yaml:"spec"`
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

