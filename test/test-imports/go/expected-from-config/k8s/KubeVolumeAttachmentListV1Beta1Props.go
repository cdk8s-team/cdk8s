package k8s


// VolumeAttachmentList is a collection of VolumeAttachment objects.
type KubeVolumeAttachmentListV1Beta1Props struct {
	// Items is the list of VolumeAttachments.
	Items *[]*KubeVolumeAttachmentV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

