package jenkinsio


// SMTP is handler for sending emails via this protocol.
type JenkinsSpecNotificationsSmtp struct {
	From *string `field:"required" json:"from" yaml:"from"`
	// SecretKeySelector selects a key of a Secret.
	PasswordSecretKeySelector *JenkinsSpecNotificationsSmtpPasswordSecretKeySelector `field:"required" json:"passwordSecretKeySelector" yaml:"passwordSecretKeySelector"`
	Port *float64 `field:"required" json:"port" yaml:"port"`
	Server *string `field:"required" json:"server" yaml:"server"`
	To *string `field:"required" json:"to" yaml:"to"`
	// SecretKeySelector selects a key of a Secret.
	UsernameSecretKeySelector *JenkinsSpecNotificationsSmtpUsernameSecretKeySelector `field:"required" json:"usernameSecretKeySelector" yaml:"usernameSecretKeySelector"`
	TlsInsecureSkipVerify *bool `field:"optional" json:"tlsInsecureSkipVerify" yaml:"tlsInsecureSkipVerify"`
}

