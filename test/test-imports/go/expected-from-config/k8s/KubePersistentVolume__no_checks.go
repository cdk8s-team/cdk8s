//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubePersistentVolume_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubePersistentVolume_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubePersistentVolume_ManifestParameters(props *KubePersistentVolumeProps) error {
	return nil
}

func validateKubePersistentVolume_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubePersistentVolumeParameters(scope constructs.Construct, id *string, props *KubePersistentVolumeProps) error {
	return nil
}

