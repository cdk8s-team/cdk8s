// jenkinsio
package jenkinsio


// SecretRef references to the secret for ScaleIO user and other sensitive information.
//
// If this is not provided, Login operation will fail.
type JenkinsSpecMasterVolumesScaleIoSecretRef struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
}

