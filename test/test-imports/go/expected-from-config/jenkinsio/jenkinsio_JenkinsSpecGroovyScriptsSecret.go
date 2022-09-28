// jenkinsio
package jenkinsio


// SecretRef is reference to Kubernetes secret.
type JenkinsSpecGroovyScriptsSecret struct {
	Name *string `field:"required" json:"name" yaml:"name"`
}

