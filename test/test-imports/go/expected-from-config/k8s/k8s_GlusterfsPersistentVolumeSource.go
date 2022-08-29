// k8s
package k8s


// Represents a Glusterfs mount that lasts the lifetime of a pod.
//
// Glusterfs volumes do not support ownership management or SELinux relabeling.
type GlusterfsPersistentVolumeSource struct {
	// EndpointsName is the endpoint name that details Glusterfs topology.
	//
	// More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
	Endpoints *string `field:"required" json:"endpoints" yaml:"endpoints"`
	// Path is the Glusterfs volume path.
	//
	// More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
	Path *string `field:"required" json:"path" yaml:"path"`
	// EndpointsNamespace is the namespace that contains Glusterfs endpoint.
	//
	// If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
	EndpointsNamespace *string `field:"optional" json:"endpointsNamespace" yaml:"endpointsNamespace"`
	// ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.
	//
	// Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
}

