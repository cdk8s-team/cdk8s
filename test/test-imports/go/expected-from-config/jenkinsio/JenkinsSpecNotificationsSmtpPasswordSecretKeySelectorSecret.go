// jenkinsio
package jenkinsio


// The name of the secret in the pod's namespace to select from.
type JenkinsSpecNotificationsSmtpPasswordSecretKeySelectorSecret struct {
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
}

