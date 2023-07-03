package jenkinsio


// Slack is handler for Slack notification channel.
type JenkinsSpecNotificationsSlack struct {
	// The web hook URL to Slack App.
	WebHookUrlSecretKeySelector *JenkinsSpecNotificationsSlackWebHookUrlSecretKeySelector `field:"required" json:"webHookUrlSecretKeySelector" yaml:"webHookUrlSecretKeySelector"`
}

