//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeSecret_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeSecret_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeSecret_ManifestParameters(props *KubeSecretProps) error {
	return nil
}

func validateKubeSecret_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeSecretParameters(scope constructs.Construct, id *string, props *KubeSecretProps) error {
	return nil
}

