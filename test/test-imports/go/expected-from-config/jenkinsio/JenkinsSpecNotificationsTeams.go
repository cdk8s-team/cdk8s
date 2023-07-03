package jenkinsio


// MicrosoftTeams is handler for Microsoft MicrosoftTeams notification channel.
type JenkinsSpecNotificationsTeams struct {
	// The web hook URL to MicrosoftTeams App.
	WebHookUrlSecretKeySelector *JenkinsSpecNotificationsTeamsWebHookUrlSecretKeySelector `field:"required" json:"webHookUrlSecretKeySelector" yaml:"webHookUrlSecretKeySelector"`
}

