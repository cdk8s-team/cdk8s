package k8s


// volumeDevice describes a mapping of a raw block device within a container.
type VolumeDevice struct {
	// devicePath is the path inside of the container that the device will be mapped to.
	DevicePath *string `field:"required" json:"devicePath" yaml:"devicePath"`
	// name must match the name of a persistentVolumeClaim in the pod.
	Name *string `field:"required" json:"name" yaml:"name"`
}

