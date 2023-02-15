// jenkinsio
package jenkinsio


// GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod.
//
// More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
type JenkinsSpecMasterVolumesGcePersistentDisk struct {
	// Unique name of the PD resource in GCE.
	//
	// Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
	PdName *string `field:"required" json:"pdName" yaml:"pdName"`
	// Filesystem type of the volume that you want to mount.
	//
	// Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk TODO: how do we prevent errors in the filesystem from compromising the machine
	FsType *string `field:"optional" json:"fsType" yaml:"fsType"`
	// The partition in the volume that you want to mount.
	//
	// If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
	Partition *float64 `field:"optional" json:"partition" yaml:"partition"`
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	//
	// Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
}

