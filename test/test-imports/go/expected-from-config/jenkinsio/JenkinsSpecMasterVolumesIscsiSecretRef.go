// jenkinsio
package jenkinsio


// CHAP Secret for iSCSI target and initiator authentication.
type JenkinsSpecMasterVolumesIscsiSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
}

