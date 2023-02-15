//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubePersistentVolumeList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubePersistentVolumeList_ManifestParameters(props *KubePersistentVolumeListProps) error {
	return nil
}

func validateKubePersistentVolumeList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubePersistentVolumeListParameters(scope constructs.Construct, id *string, props *KubePersistentVolumeListProps) error {
	return nil
}

