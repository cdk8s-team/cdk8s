// mattermostcom
package mattermostcom


// Canary defines the configuration of Canary deployment for a ClusterInstallation.
type ClusterInstallationSpecCanary struct {
	// Deployment defines the canary deployment.
	Deployment *ClusterInstallationSpecCanaryDeployment `field:"optional" json:"deployment" yaml:"deployment"`
	// Enable defines if a canary build will be deployed.
	Enable *bool `field:"optional" json:"enable" yaml:"enable"`
}

