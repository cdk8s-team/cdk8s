// k8s
package k8s


// NetworkPolicyPeer describes a peer to allow traffic from.
//
// Only certain combinations of fields are allowed.
type NetworkPolicyPeer struct {
	// IPBlock defines policy on a particular IPBlock.
	//
	// If this field is set then neither of the other fields can be.
	IpBlock *IpBlock `field:"optional" json:"ipBlock" yaml:"ipBlock"`
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

