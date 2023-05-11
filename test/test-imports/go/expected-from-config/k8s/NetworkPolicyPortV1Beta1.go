package k8s


// DEPRECATED 1.9 - This group version of NetworkPolicyPort is deprecated by networking/v1/NetworkPolicyPort.
type NetworkPolicyPortV1Beta1 struct {
	// If specified, the port on the given protocol.
	//
	// This can either be a numerical or named port on a pod.  If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
	Port IntOrString `field:"optional" json:"port" yaml:"port"`
	// Optional.
	//
	// The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
	Protocol *string `field:"optional" json:"protocol" yaml:"protocol"`
}

