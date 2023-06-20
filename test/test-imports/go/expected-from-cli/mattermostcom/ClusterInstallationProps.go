package mattermostcom

import (
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s/v2"
)

// ClusterInstallation is the Schema for the clusterinstallations API.
type ClusterInstallationProps struct {
	// Specification of the desired behavior of the Mattermost cluster.
	//
	// More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
	Spec *ClusterInstallationSpec `field:"required" json:"spec" yaml:"spec"`
	Metadata *cdk8s.ApiObjectMetadata `field:"optional" json:"metadata" yaml:"metadata"`
}

