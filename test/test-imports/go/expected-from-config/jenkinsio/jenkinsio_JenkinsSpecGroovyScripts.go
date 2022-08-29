// jenkinsio
package jenkinsio


// GroovyScripts defines configuration of Jenkins customization via groovy scripts.
type JenkinsSpecGroovyScripts struct {
	Configurations *[]*JenkinsSpecGroovyScriptsConfigurations `field:"required" json:"configurations" yaml:"configurations"`
	// SecretRef is reference to Kubernetes secret.
	Secret *JenkinsSpecGroovyScriptsSecret `field:"required" json:"secret" yaml:"secret"`
}

