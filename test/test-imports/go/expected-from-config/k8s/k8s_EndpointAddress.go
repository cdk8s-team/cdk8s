// k8s
package k8s


// EndpointAddress is a tuple that describes single IP address.
type EndpointAddress struct {
	// The IP of this endpoint.
	//
	// May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
	Ip *string `field:"required" json:"ip" yaml:"ip"`
	// The Hostname of this endpoint.
	Hostname *string `field:"optional" json:"hostname" yaml:"hostname"`
	// Optional: Node hosting this endpoint.
	//
	// This can be used to determine endpoints local to a node.
	NodeName *string `field:"optional" json:"nodeName" yaml:"nodeName"`
	// Reference to object providing the endpoint.
	TargetRef *ObjectReference `field:"optional" json:"targetRef" yaml:"targetRef"`
}

