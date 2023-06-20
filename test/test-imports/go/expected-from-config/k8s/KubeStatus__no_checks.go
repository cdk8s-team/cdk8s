//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeStatus_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeStatus_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeStatus_ManifestParameters(props *KubeStatusProps) error {
	return nil
}

func validateKubeStatus_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeStatusParameters(scope constructs.Construct, id *string, props *KubeStatusProps) error {
	return nil
}

