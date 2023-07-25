package k8s


// SecretReference represents a Secret Reference.
//
// It has enough information to retrieve secret in any namespace.
type SecretReference struct {
	// Name is unique within a namespace to reference a secret resource.
	Name *string `field:"optional" json:"name" yaml:"name"`
	// Namespace defines the space within which the secret name must be unique.
	Namespace *string `field:"optional" json:"namespace" yaml:"namespace"`
}

