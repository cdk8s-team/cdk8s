package jenkinsio


// SecretRef is reference to Kubernetes secret.
type JenkinsSpecConfigurationAsCodeSecret struct {
	Name *string `field:"required" json:"name" yaml:"name"`
}

