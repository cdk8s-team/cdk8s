// mattermost_mattermostcom
package mattermost_mattermostcom


// ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.
type ClusterInstallationSpecElasticSearch struct {
	Host *string `field:"optional" json:"host" yaml:"host"`
	Password *string `field:"optional" json:"password" yaml:"password"`
	Username *string `field:"optional" json:"username" yaml:"username"`
}

