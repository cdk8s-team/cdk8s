// k8s
package k8s


// DEPRECATED 1.9 - This group version of NetworkPolicyIngressRule is deprecated by networking/v1/NetworkPolicyIngressRule. This NetworkPolicyIngressRule matches traffic if and only if the traffic matches both ports AND from.
type NetworkPolicyIngressRuleV1Beta1 struct {
	// List of sources which should be able to access the pods selected for this rule.
	//
	// Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
	From *[]*NetworkPolicyPeerV1Beta1 `field:"optional" json:"from" yaml:"from"`
	// List of ports which should be made accessible on the pods selected for this rule.
	//
	// Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
	Ports *[]*NetworkPolicyPortV1Beta1 `field:"optional" json:"ports" yaml:"ports"`
}

