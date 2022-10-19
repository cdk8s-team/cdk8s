//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeVolumeAttachment_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeVolumeAttachment_ManifestParameters(props *KubeVolumeAttachmentProps) error {
	return nil
}

func validateKubeVolumeAttachment_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeVolumeAttachmentParameters(scope constructs.Construct, id *string, props *KubeVolumeAttachmentProps) error {
	return nil
}

