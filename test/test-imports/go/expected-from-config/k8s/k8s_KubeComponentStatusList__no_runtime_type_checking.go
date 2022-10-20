//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeComponentStatusList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeComponentStatusList_ManifestParameters(props *KubeComponentStatusListProps) error {
	return nil
}

func validateKubeComponentStatusList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeComponentStatusListParameters(scope constructs.Construct, id *string, props *KubeComponentStatusListProps) error {
	return nil
}

