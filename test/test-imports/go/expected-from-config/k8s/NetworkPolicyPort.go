package k8s


// NetworkPolicyPort describes a port to allow traffic on.
type NetworkPolicyPort struct {
	// The port on the given protocol.
	//
	// This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers.
	Port IntOrString `field:"optional" json:"port" yaml:"port"`
	// The protocol (TCP, UDP, or SCTP) which traffic must match.
	//
	// If not specified, this field defaults to TCP.
	Protocol *string `field:"optional" json:"protocol" yaml:"protocol"`
}

