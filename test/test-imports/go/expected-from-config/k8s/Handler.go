// k8s
package k8s


// Handler defines a specific action that should be taken.
type Handler struct {
	// One and only one of the following should be specified.
	//
	// Exec specifies the action to take.
	Exec *ExecAction `field:"optional" json:"exec" yaml:"exec"`
	// HTTPGet specifies the http request to perform.
	HttpGet *HttpGetAction `field:"optional" json:"httpGet" yaml:"httpGet"`
	// TCPSocket specifies an action involving a TCP port.
	//
	// TCP hooks not yet supported.
	TcpSocket *TcpSocketAction `field:"optional" json:"tcpSocket" yaml:"tcpSocket"`
}

