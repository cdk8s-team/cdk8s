package jenkinsio


// Mailgun is handler for Mailgun email service notification channel.
type JenkinsSpecNotificationsMailgun struct {
	// SecretKeySelector selects a key of a Secret.
	ApiKeySecretKeySelector *JenkinsSpecNotificationsMailgunApiKeySecretKeySelector `field:"required" json:"apiKeySecretKeySelector" yaml:"apiKeySecretKeySelector"`
	Domain *string `field:"required" json:"domain" yaml:"domain"`
	From *string `field:"required" json:"from" yaml:"from"`
	Recipient *string `field:"required" json:"recipient" yaml:"recipient"`
}

