// jenkinsio
package jenkinsio


// Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
//
// This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
type JenkinsSpecMasterVolumesFlexVolumeSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
}

