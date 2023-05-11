package k8s


// Deployment enables declarative updates for Pods and ReplicaSets.
type KubeDeploymentProps struct {
	// Standard object metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Specification of the desired behavior of the Deployment.
	Spec *DeploymentSpec `field:"optional" json:"spec" yaml:"spec"`
}

