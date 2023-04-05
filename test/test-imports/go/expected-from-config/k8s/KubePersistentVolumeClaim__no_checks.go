//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubePersistentVolumeClaim_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubePersistentVolumeClaim_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubePersistentVolumeClaim_ManifestParameters(props *KubePersistentVolumeClaimProps) error {
	return nil
}

func validateKubePersistentVolumeClaim_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubePersistentVolumeClaimParameters(scope constructs.Construct, id *string, props *KubePersistentVolumeClaimProps) error {
	return nil
}

