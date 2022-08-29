// jenkinsio
package jenkinsio


// SecretKeySelector selects a key of a Secret.
type JenkinsSpecNotificationsSmtpUsernameSecretKeySelector struct {
	// The key of the secret to select from.
	//
	// Must be a valid secret key.
	Key *string `field:"required" json:"key" yaml:"key"`
	// The name of the secret in the pod's namespace to select from.
	Secret *JenkinsSpecNotificationsSmtpUsernameSecretKeySelectorSecret `field:"required" json:"secret" yaml:"secret"`
}

