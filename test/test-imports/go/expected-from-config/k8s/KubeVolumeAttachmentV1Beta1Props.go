package k8s


// VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
//
// VolumeAttachment objects are non-namespaced.
type KubeVolumeAttachmentV1Beta1Props struct {
	// Specification of the desired attach/detach volume behavior.
	//
	// Populated by the Kubernetes system.
	Spec *VolumeAttachmentSpecV1Beta1 `field:"required" json:"spec" yaml:"spec"`
	// Standard object metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

