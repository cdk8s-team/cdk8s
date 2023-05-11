package jenkinsio


// NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.
//
// This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
type JenkinsSpecMasterVolumesCsiNodePublishSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
}

