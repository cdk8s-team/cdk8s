// jenkinsio
package jenkinsio


// ConfigurationAsCode defines configuration of Jenkins customization via Configuration as Code Jenkins plugin.
type JenkinsSpecConfigurationAsCode struct {
	Configurations *[]*JenkinsSpecConfigurationAsCodeConfigurations `field:"required" json:"configurations" yaml:"configurations"`
	// SecretRef is reference to Kubernetes secret.
	Secret *JenkinsSpecConfigurationAsCodeSecret `field:"required" json:"secret" yaml:"secret"`
}

