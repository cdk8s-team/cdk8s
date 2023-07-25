//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeService_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeService_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeService_ManifestParameters(props *KubeServiceProps) error {
	return nil
}

func validateKubeService_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeServiceParameters(scope constructs.Construct, id *string, props *KubeServiceProps) error {
	return nil
}

