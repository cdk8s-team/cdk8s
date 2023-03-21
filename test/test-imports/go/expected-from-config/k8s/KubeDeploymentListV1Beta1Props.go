// k8s
package k8s


// DeploymentList is a list of Deployments.
type KubeDeploymentListV1Beta1Props struct {
	// Items is the list of Deployments.
	Items *[]*KubeDeploymentV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

