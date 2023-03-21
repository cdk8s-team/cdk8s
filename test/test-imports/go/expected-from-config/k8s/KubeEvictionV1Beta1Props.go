// k8s
package k8s


// Eviction evicts a pod from its node subject to certain policies and safety constraints.
//
// This is a subresource of Pod.  A request to cause such an eviction is created by POSTing to .../pods/<pod name>/evictions.
type KubeEvictionV1Beta1Props struct {
	// DeleteOptions may be provided.
	DeleteOptions *DeleteOptions `field:"optional" json:"deleteOptions" yaml:"deleteOptions"`
	// ObjectMeta describes the pod that is being evicted.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

