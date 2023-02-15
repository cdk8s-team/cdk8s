// k8s
package k8s


// DEPRECATED 1.9 - This group version of NetworkPolicy is deprecated by networking/v1/NetworkPolicy. NetworkPolicy describes what network traffic is allowed for a set of Pods.
type KubeNetworkPolicyV1Beta1Props struct {
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Specification of the desired behavior for this NetworkPolicy.
	Spec *NetworkPolicySpecV1Beta1 `field:"optional" json:"spec" yaml:"spec"`
}

