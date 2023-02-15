// k8s
package k8s


// Represents a host path mapped into a pod.
//
// Host path volumes do not support ownership management or SELinux relabeling.
type HostPathVolumeSource struct {
	// Path of the directory on the host.
	//
	// If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
	Path *string `field:"required" json:"path" yaml:"path"`
	// Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath.
	Type *string `field:"optional" json:"type" yaml:"type"`
}

