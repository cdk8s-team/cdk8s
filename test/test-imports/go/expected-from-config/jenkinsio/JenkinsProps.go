// jenkinsio
package jenkinsio

import (
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

// Jenkins is the Schema for the jenkins API.
type JenkinsProps struct {
	Metadata *cdk8s.ApiObjectMetadata `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec defines the desired state of the Jenkins.
	Spec *JenkinsSpec `field:"optional" json:"spec" yaml:"spec"`
}

