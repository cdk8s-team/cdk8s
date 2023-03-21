// k8s
package k8s


// VolumeAttachmentSource represents a volume that should be attached.
//
// Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
type VolumeAttachmentSourceV1Alpha1 struct {
	// inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource.
	//
	// This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
	InlineVolumeSpec *PersistentVolumeSpec `field:"optional" json:"inlineVolumeSpec" yaml:"inlineVolumeSpec"`
	// Name of the persistent volume to attach.
	PersistentVolumeName *string `field:"optional" json:"persistentVolumeName" yaml:"persistentVolumeName"`
}

