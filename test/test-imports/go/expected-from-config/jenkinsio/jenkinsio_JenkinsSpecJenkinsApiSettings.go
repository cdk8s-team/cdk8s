// jenkinsio
package jenkinsio


// JenkinsAPISettings defines configuration used by the operator to gain admin access to the Jenkins API.
type JenkinsSpecJenkinsApiSettings struct {
	// AuthorizationStrategy defines authorization strategy of the operator for the Jenkins API.
	AuthorizationStrategy *string `field:"required" json:"authorizationStrategy" yaml:"authorizationStrategy"`
}

