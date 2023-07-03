package jenkinsio


// Compute Resources required by this container.
//
// More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
type JenkinsSpecMasterContainersResources struct {
	// Limits describes the maximum amount of compute resources allowed.
	//
	// More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Limits *map[string]*string `field:"optional" json:"limits" yaml:"limits"`
	// Requests describes the minimum amount of compute resources required.
	//
	// If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Requests *map[string]*string `field:"optional" json:"requests" yaml:"requests"`
}

