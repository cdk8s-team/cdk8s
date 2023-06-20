package jenkinsio


// Optional: points to a secret object containing parameters used to connect to OpenStack.
type JenkinsSpecMasterVolumesCinderSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
}

