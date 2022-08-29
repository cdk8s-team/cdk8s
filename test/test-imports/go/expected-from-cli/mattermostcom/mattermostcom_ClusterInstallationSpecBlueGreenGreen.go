// mattermostcom
package mattermostcom


// Green defines the green deployment.
type ClusterInstallationSpecBlueGreenGreen struct {
	// Image defines the base Docker image that will be used for the deployment.
	//
	// Required when BlueGreen or Canary is enabled.
	Image *string `field:"optional" json:"image" yaml:"image"`
	// IngressName defines the ingress name that will be used by the deployment.
	//
	// This option is not used for Canary builds.
	IngressName *string `field:"optional" json:"ingressName" yaml:"ingressName"`
	// Name defines the name of the deployment.
	Name *string `field:"optional" json:"name" yaml:"name"`
	// Version defines the Docker image version that will be used for the deployment.
	//
	// Required when BlueGreen or Canary is enabled.
	Version *string `field:"optional" json:"version" yaml:"version"`
}

