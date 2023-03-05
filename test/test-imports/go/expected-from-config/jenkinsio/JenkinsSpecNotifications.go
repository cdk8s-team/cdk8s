// jenkinsio
package jenkinsio


// Notification is a service configuration used to send notifications about Jenkins status.
type JenkinsSpecNotifications struct {
	// NotificationLevel defines the level of a Notification.
	Level *string `field:"required" json:"level" yaml:"level"`
	Name *string `field:"required" json:"name" yaml:"name"`
	Verbose *bool `field:"required" json:"verbose" yaml:"verbose"`
	// Mailgun is handler for Mailgun email service notification channel.
	Mailgun *JenkinsSpecNotificationsMailgun `field:"optional" json:"mailgun" yaml:"mailgun"`
	// Slack is handler for Slack notification channel.
	Slack *JenkinsSpecNotificationsSlack `field:"optional" json:"slack" yaml:"slack"`
	// SMTP is handler for sending emails via this protocol.
	Smtp *JenkinsSpecNotificationsSmtp `field:"optional" json:"smtp" yaml:"smtp"`
	// MicrosoftTeams is handler for Microsoft MicrosoftTeams notification channel.
	Teams *JenkinsSpecNotificationsTeams `field:"optional" json:"teams" yaml:"teams"`
}

