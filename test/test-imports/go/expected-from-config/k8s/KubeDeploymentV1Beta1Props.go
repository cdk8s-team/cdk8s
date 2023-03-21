// k8s
package k8s


// DEPRECATED - This group version of Deployment is deprecated by apps/v1beta2/Deployment.
//
// See the release notes for more information. Deployment enables declarative updates for Pods and ReplicaSets.
type KubeDeploymentV1Beta1Props struct {
	// Standard object metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Specification of the desired behavior of the Deployment.
	Spec *DeploymentSpecV1Beta1 `field:"optional" json:"spec" yaml:"spec"`
}

