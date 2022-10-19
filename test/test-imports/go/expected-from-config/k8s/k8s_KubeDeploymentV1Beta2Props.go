// k8s
package k8s


// DEPRECATED - This group version of Deployment is deprecated by apps/v1/Deployment.
//
// See the release notes for more information. Deployment enables declarative updates for Pods and ReplicaSets.
type KubeDeploymentV1Beta2Props struct {
	// Standard object metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Specification of the desired behavior of the Deployment.
	Spec *DeploymentSpecV1Beta2 `field:"optional" json:"spec" yaml:"spec"`
}

