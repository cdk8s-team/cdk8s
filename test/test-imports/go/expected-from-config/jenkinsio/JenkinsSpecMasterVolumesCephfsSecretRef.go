package jenkinsio


// Optional: SecretRef is reference to the authentication secret for User, default is empty.
//
// More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
type JenkinsSpecMasterVolumesCephfsSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
}

