package k8s


// SecretEnvSource selects a Secret to populate the environment variables with.
//
// The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
type SecretEnvSource struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
	Name *string `field:"optional" json:"name" yaml:"name"`
	// Specify whether the Secret must be defined.
	Optional *bool `field:"optional" json:"optional" yaml:"optional"`
}

