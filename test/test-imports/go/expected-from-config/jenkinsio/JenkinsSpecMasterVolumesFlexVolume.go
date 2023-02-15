// jenkinsio
package jenkinsio


// FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
type JenkinsSpecMasterVolumesFlexVolume struct {
	// Driver is the name of the driver to use for this volume.
	Driver *string `field:"required" json:"driver" yaml:"driver"`
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
	FsType *string `field:"optional" json:"fsType" yaml:"fsType"`
	// Optional: Extra command options if any.
	Options *map[string]*string `field:"optional" json:"options" yaml:"options"`
	// Optional: Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
	// Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
	//
	// This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
	SecretRef *JenkinsSpecMasterVolumesFlexVolumeSecretRef `field:"optional" json:"secretRef" yaml:"secretRef"`
}

