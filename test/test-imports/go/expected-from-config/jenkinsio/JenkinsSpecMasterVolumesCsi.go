// jenkinsio
package jenkinsio


// CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
type JenkinsSpecMasterVolumesCsi struct {
	// Driver is the name of the CSI driver that handles this volume.
	//
	// Consult with your admin for the correct name as registered in the cluster.
	Driver *string `field:"required" json:"driver" yaml:"driver"`
	// Filesystem type to mount.
	//
	// Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
	FsType *string `field:"optional" json:"fsType" yaml:"fsType"`
	// NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.
	//
	// This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
	NodePublishSecretRef *JenkinsSpecMasterVolumesCsiNodePublishSecretRef `field:"optional" json:"nodePublishSecretRef" yaml:"nodePublishSecretRef"`
	// Specifies a read-only configuration for the volume.
	//
	// Defaults to false (read/write).
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
	// VolumeAttributes stores driver-specific properties that are passed to the CSI driver.
	//
	// Consult your driver's documentation for supported values.
	VolumeAttributes *map[string]*string `field:"optional" json:"volumeAttributes" yaml:"volumeAttributes"`
}

