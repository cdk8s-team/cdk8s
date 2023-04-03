//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeConfigMapList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeConfigMapList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeConfigMapList_ManifestParameters(props *KubeConfigMapListProps) error {
	return nil
}

func validateKubeConfigMapList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeConfigMapListParameters(scope constructs.Construct, id *string, props *KubeConfigMapListProps) error {
	return nil
}

