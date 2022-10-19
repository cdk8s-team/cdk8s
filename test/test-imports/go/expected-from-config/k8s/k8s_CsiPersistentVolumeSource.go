// k8s
package k8s


// Represents storage that is managed by an external CSI volume driver (Beta feature).
type CsiPersistentVolumeSource struct {
	// Driver is the name of the driver to use for this volume.
	//
	// Required.
	Driver *string `field:"required" json:"driver" yaml:"driver"`
	// VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls.
	//
	// Required.
	VolumeHandle *string `field:"required" json:"volumeHandle" yaml:"volumeHandle"`
	// ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call.
	//
	// This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
	ControllerExpandSecretRef *SecretReference `field:"optional" json:"controllerExpandSecretRef" yaml:"controllerExpandSecretRef"`
	// ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls.
	//
	// This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
	ControllerPublishSecretRef *SecretReference `field:"optional" json:"controllerPublishSecretRef" yaml:"controllerPublishSecretRef"`
	// Filesystem type to mount.
	//
	// Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
	FsType *string `field:"optional" json:"fsType" yaml:"fsType"`
	// NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls.
	//
	// This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
	NodePublishSecretRef *SecretReference `field:"optional" json:"nodePublishSecretRef" yaml:"nodePublishSecretRef"`
	// NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls.
	//
	// This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
	NodeStageSecretRef *SecretReference `field:"optional" json:"nodeStageSecretRef" yaml:"nodeStageSecretRef"`
	// Optional: The value to pass to ControllerPublishVolumeRequest.
	//
	// Defaults to false (read/write).
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
	// Attributes of the volume to publish.
	VolumeAttributes *map[string]*string `field:"optional" json:"volumeAttributes" yaml:"volumeAttributes"`
}

