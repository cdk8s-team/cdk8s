package jenkinsio


// ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
type JenkinsSpecMasterVolumesScaleIo struct {
	// The host address of the ScaleIO API Gateway.
	Gateway *string `field:"required" json:"gateway" yaml:"gateway"`
	// SecretRef references to the secret for ScaleIO user and other sensitive information.
	//
	// If this is not provided, Login operation will fail.
	SecretRef *JenkinsSpecMasterVolumesScaleIoSecretRef `field:"required" json:"secretRef" yaml:"secretRef"`
	// The name of the storage system as configured in ScaleIO.
	System *string `field:"required" json:"system" yaml:"system"`
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
	FsType *string `field:"optional" json:"fsType" yaml:"fsType"`
	// The name of the ScaleIO Protection Domain for the configured storage.
	ProtectionDomain *string `field:"optional" json:"protectionDomain" yaml:"protectionDomain"`
	// Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
	// Flag to enable/disable SSL communication with Gateway, default false.
	SslEnabled *bool `field:"optional" json:"sslEnabled" yaml:"sslEnabled"`
	// Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
	//
	// Default is ThinProvisioned.
	StorageMode *string `field:"optional" json:"storageMode" yaml:"storageMode"`
	// The ScaleIO Storage Pool associated with the protection domain.
	StoragePool *string `field:"optional" json:"storagePool" yaml:"storagePool"`
	// The name of a volume already created in the ScaleIO system that is associated with this volume source.
	VolumeName *string `field:"optional" json:"volumeName" yaml:"volumeName"`
}

