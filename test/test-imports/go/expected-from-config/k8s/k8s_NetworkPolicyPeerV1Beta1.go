// k8s
package k8s


// DEPRECATED 1.9 - This group version of NetworkPolicyPeer is deprecated by networking/v1/NetworkPolicyPeer.
type NetworkPolicyPeerV1Beta1 struct {
	// IPBlock defines policy on a particular IPBlock.
	//
	// If this field is set then neither of the other fields can be.
	IpBlock *IpBlockV1Beta1 `field:"optional" json:"ipBlock" yaml:"ipBlock"`
	// Selects Namespaces using cluster-scoped labels.
	//
	// This field follows standard label selector semantics; if present but empty, it selects all namespaces.
	//
	// If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
	NamespaceSelector *LabelSelector `field:"optional" json:"namespaceSelector" yaml:"namespaceSelector"`
	// This is a label selector which selects Pods.
	//
	// This field follows standard label selector semantics; if present but empty, it selects all pods.
	//
	// If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
	PodSelector *LabelSelector `field:"optional" json:"podSelector" yaml:"podSelector"`
}

