// jenkinsio
package jenkinsio


// SecretRef is name of the authentication secret for RBDUser.
//
// If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
type JenkinsSpecMasterVolumesRbdSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
}

