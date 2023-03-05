//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeVolumeAttachmentList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeVolumeAttachmentList_ManifestParameters(props *KubeVolumeAttachmentListProps) error {
	return nil
}

func validateKubeVolumeAttachmentList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeVolumeAttachmentListParameters(scope constructs.Construct, id *string, props *KubeVolumeAttachmentListProps) error {
	return nil
}

