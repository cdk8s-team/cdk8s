package jenkinsio


// ConfigMapRef is reference to Kubernetes ConfigMap.
type JenkinsSpecGroovyScriptsConfigurations struct {
	Name *string `field:"required" json:"name" yaml:"name"`
}

