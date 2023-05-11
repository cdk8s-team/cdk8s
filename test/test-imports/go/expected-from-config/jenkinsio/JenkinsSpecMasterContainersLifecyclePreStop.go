package jenkinsio


// PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc.
//
// The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
type JenkinsSpecMasterContainersLifecyclePreStop struct {
	// One and only one of the following should be specified.
	//
	// Exec specifies the action to take.
	Exec *JenkinsSpecMasterContainersLifecyclePreStopExec `field:"optional" json:"exec" yaml:"exec"`
	// HTTPGet specifies the http request to perform.
	HttpGet *JenkinsSpecMasterContainersLifecyclePreStopHttpGet `field:"optional" json:"httpGet" yaml:"httpGet"`
	// TCPSocket specifies an action involving a TCP port.
	//
	// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook.
	TcpSocket *JenkinsSpecMasterContainersLifecyclePreStopTcpSocket `field:"optional" json:"tcpSocket" yaml:"tcpSocket"`
}

