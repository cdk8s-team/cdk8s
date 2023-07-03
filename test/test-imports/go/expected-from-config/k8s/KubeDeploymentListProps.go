package k8s


// DeploymentList is a list of Deployments.
type KubeDeploymentListProps struct {
	// Items is the list of Deployments.
	Items *[]*KubeDeploymentProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

