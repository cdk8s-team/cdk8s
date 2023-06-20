package jenkinsio


// ContainerPort represents a network port in a single container.
type JenkinsSpecMasterContainersPorts struct {
	// Number of port to expose on the pod's IP address.
	//
	// This must be a valid port number, 0 < x < 65536.
	ContainerPort *float64 `field:"required" json:"containerPort" yaml:"containerPort"`
	// What host IP to bind the external port to.
	HostIp *string `field:"optional" json:"hostIp" yaml:"hostIp"`
	// Number of port to expose on the host.
	//
	// If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
	HostPort *float64 `field:"optional" json:"hostPort" yaml:"hostPort"`
	// If specified, this must be an IANA_SVC_NAME and unique within the pod.
	//
	// Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
	Name *string `field:"optional" json:"name" yaml:"name"`
	// Protocol for port.
	//
	// Must be UDP, TCP, or SCTP. Defaults to "TCP".
	Protocol *string `field:"optional" json:"protocol" yaml:"protocol"`
}

