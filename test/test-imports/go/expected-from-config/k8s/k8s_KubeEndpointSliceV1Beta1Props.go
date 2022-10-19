// k8s
package k8s


// EndpointSlice represents a subset of the endpoints that implement a service.
//
// For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
type KubeEndpointSliceV1Beta1Props struct {
	// addressType specifies the type of address carried by this EndpointSlice.
	//
	// All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
	AddressType *string `field:"required" json:"addressType" yaml:"addressType"`
	// endpoints is a list of unique endpoints in this slice.
	//
	// Each slice may include a maximum of 1000 endpoints.
	Endpoints *[]*EndpointV1Beta1 `field:"required" json:"endpoints" yaml:"endpoints"`
	// Standard object's metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// ports specifies the list of network ports exposed by each endpoint in this slice.
	//
	// Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
	Ports *[]*EndpointPortV1Beta1 `field:"optional" json:"ports" yaml:"ports"`
}

