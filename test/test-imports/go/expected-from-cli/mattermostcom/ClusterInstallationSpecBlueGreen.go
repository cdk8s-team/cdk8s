// mattermostcom
package mattermostcom


// BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.
type ClusterInstallationSpecBlueGreen struct {
	// Blue defines the blue deployment.
	Blue *ClusterInstallationSpecBlueGreenBlue `field:"optional" json:"blue" yaml:"blue"`
	// Enable defines if BlueGreen deployment will be applied.
	Enable *bool `field:"optional" json:"enable" yaml:"enable"`
	// Green defines the green deployment.
	Green *ClusterInstallationSpecBlueGreenGreen `field:"optional" json:"green" yaml:"green"`
	// ProductionDeployment defines if the current production is blue or green.
	ProductionDeployment *string `field:"optional" json:"productionDeployment" yaml:"productionDeployment"`
}

