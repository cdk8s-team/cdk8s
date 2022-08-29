// k8s
package k8s


// PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes.
type PersistentVolumeClaimSpec struct {
	// AccessModes contains the desired access modes the volume should have.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
	AccessModes *[]*string `field:"optional" json:"accessModes" yaml:"accessModes"`
	// This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source.
	//
	// If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.
	DataSource *TypedLocalObjectReference `field:"optional" json:"dataSource" yaml:"dataSource"`
	// Resources represents the minimum resources the volume should have.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
	Resources *ResourceRequirements `field:"optional" json:"resources" yaml:"resources"`
	// A label query over volumes to consider for binding.
	Selector *LabelSelector `field:"optional" json:"selector" yaml:"selector"`
	// Name of the StorageClass required by the claim.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
	StorageClassName *string `field:"optional" json:"storageClassName" yaml:"storageClassName"`
	// volumeMode defines what type of volume is required by the claim.
	//
	// Value of Filesystem is implied when not included in claim spec. This is a beta feature.
	VolumeMode *string `field:"optional" json:"volumeMode" yaml:"volumeMode"`
	// VolumeName is the binding reference to the PersistentVolume backing this claim.
	VolumeName *string `field:"optional" json:"volumeName" yaml:"volumeName"`
}

