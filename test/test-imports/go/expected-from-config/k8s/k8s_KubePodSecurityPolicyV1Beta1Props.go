// k8s
package k8s


// PodSecurityPolicy governs the ability to make requests that affect the Security Context that will be applied to a pod and container.
type KubePodSecurityPolicyV1Beta1Props struct {
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// spec defines the policy enforced.
	Spec *PodSecurityPolicySpecV1Beta1 `field:"optional" json:"spec" yaml:"spec"`
}

