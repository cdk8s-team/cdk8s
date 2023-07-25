package jenkinsio


// ConfigMapRef is reference to Kubernetes ConfigMap.
type JenkinsSpecConfigurationAsCodeConfigurations struct {
	Name *string `field:"required" json:"name" yaml:"name"`
}

