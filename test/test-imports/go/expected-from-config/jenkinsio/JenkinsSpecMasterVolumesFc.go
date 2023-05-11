package jenkinsio


// FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
type JenkinsSpecMasterVolumesFc struct {
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. TODO: how do we prevent errors in the filesystem from compromising the machine
	FsType *string `field:"optional" json:"fsType" yaml:"fsType"`
	// Optional: FC target lun number.
	Lun *float64 `field:"optional" json:"lun" yaml:"lun"`
	// Optional: Defaults to false (read/write).
	//
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
	// Optional: FC target worldwide names (WWNs).
	TargetWwNs *[]*string `field:"optional" json:"targetWwNs" yaml:"targetWwNs"`
	// Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
	Wwids *[]*string `field:"optional" json:"wwids" yaml:"wwids"`
}

