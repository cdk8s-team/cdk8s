// jenkinsio
package jenkinsio


// The web hook URL to Slack App.
type JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector struct {
	// The key of the secret to select from.
	//
	// Must be a valid secret key.
	Key *string `field:"required" json:"key" yaml:"key"`
	// The name of the secret in the pod's namespace to select from.
	Secret *JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelectorSecret `field:"required" json:"secret" yaml:"secret"`
}

