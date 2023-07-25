package k8s


// PortworxVolumeSource represents a Portworx volume resource.
type PortworxVolumeSource struct {
	// VolumeID uniquely identifies a Portworx volume.
	VolumeId *string `field:"required" json:"volumeId" yaml:"volumeId"`
	// FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system.
	//
	// Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
	FsType *string `field:"optional" json:"fsType" yaml:"fsType"`
	// Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
}

