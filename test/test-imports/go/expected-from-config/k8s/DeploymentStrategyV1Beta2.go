// k8s
package k8s


// DeploymentStrategy describes how to replace existing pods with new ones.
type DeploymentStrategyV1Beta2 struct {
	// Rolling update config params.
	//
	// Present only if DeploymentStrategyType = RollingUpdate.
	RollingUpdate *RollingUpdateDeploymentV1Beta2 `field:"optional" json:"rollingUpdate" yaml:"rollingUpdate"`
	// Type of deployment.
	//
	// Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
	Type *string `field:"optional" json:"type" yaml:"type"`
}

