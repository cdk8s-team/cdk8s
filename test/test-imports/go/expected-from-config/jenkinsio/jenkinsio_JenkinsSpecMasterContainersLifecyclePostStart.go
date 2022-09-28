// jenkinsio
package jenkinsio


// PostStart is called immediately after a container is created.
//
// If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
type JenkinsSpecMasterContainersLifecyclePostStart struct {
	// One and only one of the following should be specified.
	//
	// Exec specifies the action to take.
	Exec *JenkinsSpecMasterContainersLifecyclePostStartExec `field:"optional" json:"exec" yaml:"exec"`
	// HTTPGet specifies the http request to perform.
	HttpGet *JenkinsSpecMasterContainersLifecyclePostStartHttpGet `field:"optional" json:"httpGet" yaml:"httpGet"`
	// TCPSocket specifies an action involving a TCP port.
	//
	// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook.
	TcpSocket *JenkinsSpecMasterContainersLifecyclePostStartTcpSocket `field:"optional" json:"tcpSocket" yaml:"tcpSocket"`
}

