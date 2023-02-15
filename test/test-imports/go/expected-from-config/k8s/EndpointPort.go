// k8s
package k8s


// EndpointPort is a tuple that describes a single port.
type EndpointPort struct {
	// The port number of the endpoint.
	Port *float64 `field:"required" json:"port" yaml:"port"`
	// The name of this port.
	//
	// This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
	Name *string `field:"optional" json:"name" yaml:"name"`
	// The IP protocol for this port.
	//
	// Must be UDP, TCP, or SCTP. Default is TCP.
	Protocol *string `field:"optional" json:"protocol" yaml:"protocol"`
}

