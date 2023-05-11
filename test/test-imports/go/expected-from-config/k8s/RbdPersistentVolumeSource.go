package k8s


// Represents a Rados Block Device mount that lasts the lifetime of a pod.
//
// RBD volumes support ownership management and SELinux relabeling.
type RbdPersistentVolumeSource struct {
	// The rados image name.
	//
	// More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	Image *string `field:"required" json:"image" yaml:"image"`
	// A collection of Ceph monitors.
	//
	// More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	Monitors *[]*string `field:"required" json:"monitors" yaml:"monitors"`
	// Filesystem type of the volume that you want to mount.
	//
	// Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
	FsType *string `field:"optional" json:"fsType" yaml:"fsType"`
	// Keyring is the path to key ring for RBDUser.
	//
	// Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	Keyring *string `field:"optional" json:"keyring" yaml:"keyring"`
	// The rados pool name.
	//
	// Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	Pool *string `field:"optional" json:"pool" yaml:"pool"`
	// ReadOnly here will force the ReadOnly setting in VolumeMounts.
	//
	// Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
	// SecretRef is name of the authentication secret for RBDUser.
	//
	// If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	SecretRef *SecretReference `field:"optional" json:"secretRef" yaml:"secretRef"`
	// The rados user name.
	//
	// Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
	User *string `field:"optional" json:"user" yaml:"user"`
}

