package k8s


// TCPSocketAction describes an action based on opening a socket.
type TcpSocketAction struct {
	// Number or name of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port IntOrString `field:"required" json:"port" yaml:"port"`
	// Optional: Host name to connect to, defaults to the pod IP.
	Host *string `field:"optional" json:"host" yaml:"host"`
}

