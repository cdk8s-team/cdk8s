//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeComponentStatus_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeComponentStatus_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeComponentStatus_ManifestParameters(props *KubeComponentStatusProps) error {
	return nil
}

func validateKubeComponentStatus_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeComponentStatusParameters(scope constructs.Construct, id *string, props *KubeComponentStatusProps) error {
	return nil
}

