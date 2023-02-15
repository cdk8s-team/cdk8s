// mattermost_mattermostcom
package mattermost_mattermostcom


// TCPSocket specifies an action involving a TCP port.
//
// TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook.
type ClusterInstallationSpecReadinessProbeTcpSocket struct {
	// Number or name of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port ClusterInstallationSpecReadinessProbeTcpSocketPort `field:"required" json:"port" yaml:"port"`
	// Optional: Host name to connect to, defaults to the pod IP.
	Host *string `field:"optional" json:"host" yaml:"host"`
}

