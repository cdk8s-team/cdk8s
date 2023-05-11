package k8s


// VolumeAttachmentList is a collection of VolumeAttachment objects.
type KubeVolumeAttachmentListProps struct {
	// Items is the list of VolumeAttachments.
	Items *[]*KubeVolumeAttachmentProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

