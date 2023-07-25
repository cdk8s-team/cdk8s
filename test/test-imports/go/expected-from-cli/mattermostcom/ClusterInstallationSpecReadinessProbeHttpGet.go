package mattermostcom


// HTTPGet specifies the http request to perform.
type ClusterInstallationSpecReadinessProbeHttpGet struct {
	// Name or number of the port to access on the container.
	//
	// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
	Port ClusterInstallationSpecReadinessProbeHttpGetPort `field:"required" json:"port" yaml:"port"`
	// Host name to connect to, defaults to the pod IP.
	//
	// You probably want to set "Host" in httpHeaders instead.
	Host *string `field:"optional" json:"host" yaml:"host"`
	// Custom headers to set in the request.
	//
	// HTTP allows repeated headers.
	HttpHeaders *[]*ClusterInstallationSpecReadinessProbeHttpGetHttpHeaders `field:"optional" json:"httpHeaders" yaml:"httpHeaders"`
	// Path to access on the HTTP server.
	Path *string `field:"optional" json:"path" yaml:"path"`
	// Scheme to use for connecting to the host.
	//
	// Defaults to HTTP.
	Scheme *string `field:"optional" json:"scheme" yaml:"scheme"`
}

