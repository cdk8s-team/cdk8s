package jenkinsio


// Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime.
//
// More info: https://examples.k8s.io/volumes/glusterfs/README.md
type JenkinsSpecMasterVolumesGlusterfs struct {
	// EndpointsName is the endpoint name that details Glusterfs topology.
	//
	// More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
	Endpoints *string `field:"required" json:"endpoints" yaml:"endpoints"`
	// Path is the Glusterfs volume path.
	//
	// More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
	Path *string `field:"required" json:"path" yaml:"path"`
	// ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.
	//
	// Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
}

