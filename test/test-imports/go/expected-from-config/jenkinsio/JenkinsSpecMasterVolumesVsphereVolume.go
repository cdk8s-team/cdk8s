package jenkinsio


// VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine.
type JenkinsSpecMasterVolumesVsphereVolume struct {
	// Path that identifies vSphere volume vmdk.
	VolumePath *string `field:"required" json:"volumePath" yaml:"volumePath"`
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
	FsType *string `field:"optional" json:"fsType" yaml:"fsType"`
	// Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
	StoragePolicyId *string `field:"optional" json:"storagePolicyId" yaml:"storagePolicyId"`
	// Storage Policy Based Management (SPBM) profile name.
	StoragePolicyName *string `field:"optional" json:"storagePolicyName" yaml:"storagePolicyName"`
}

