package jenkinsio


// NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs.
type JenkinsSpecMasterVolumesNfs struct {
	// Path that is exported by the NFS server.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
	Path *string `field:"required" json:"path" yaml:"path"`
	// Server is the hostname or IP address of the NFS server.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
	Server *string `field:"required" json:"server" yaml:"server"`
	// ReadOnly here will force the NFS export to be mounted with read-only permissions.
	//
	// Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
}

