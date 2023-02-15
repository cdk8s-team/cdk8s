// k8s
package k8s


// EndpointPort represents a Port used by an EndpointSlice.
type EndpointPortV1Beta1 struct {
	// The application protocol for this port.
	//
	// This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names. Default is empty string.
	AppProtocol *string `field:"optional" json:"appProtocol" yaml:"appProtocol"`
	// The name of this port.
	//
	// All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.
	Name *string `field:"optional" json:"name" yaml:"name"`
	// The port number of the endpoint.
	//
	// If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
	Port *float64 `field:"optional" json:"port" yaml:"port"`
	// The IP protocol for this port.
	//
	// Must be UDP, TCP, or SCTP. Default is TCP.
	Protocol *string `field:"optional" json:"protocol" yaml:"protocol"`
}

