package jenkinsio


// Selects a key of a ConfigMap.
type JenkinsSpecMasterContainersEnvValueFromConfigMapKeyRef struct {
	// The key to select.
	Key *string `field:"required" json:"key" yaml:"key"`
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
	// Specify whether the ConfigMap or its key must be defined.
	Optional *bool `field:"optional" json:"optional" yaml:"optional"`
}

