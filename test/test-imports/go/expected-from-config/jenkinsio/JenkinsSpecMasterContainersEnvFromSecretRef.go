package jenkinsio


// The Secret to select from.
type JenkinsSpecMasterContainersEnvFromSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
	// Specify whether the Secret must be defined.
	Optional *bool `field:"optional" json:"optional" yaml:"optional"`
}

