// jenkinsio
package jenkinsio


// HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container.
//
// This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.
type JenkinsSpecMasterVolumesHostPath struct {
	// Path of the directory on the host.
	//
	// If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
	Path *string `field:"required" json:"path" yaml:"path"`
	// Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath.
	Type *string `field:"optional" json:"type" yaml:"type"`
}

