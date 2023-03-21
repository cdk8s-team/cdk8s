// k8s
package k8s


// DEPRECATED 1.9 - This group version of IPBlock is deprecated by networking/v1/IPBlock. IPBlock describes a particular CIDR (Ex. "192.168.1.1/24") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.
type IpBlockV1Beta1 struct {
	// CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24".
	Cidr *string `field:"required" json:"cidr" yaml:"cidr"`
	// Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range.
	Except *[]*string `field:"optional" json:"except" yaml:"except"`
}

