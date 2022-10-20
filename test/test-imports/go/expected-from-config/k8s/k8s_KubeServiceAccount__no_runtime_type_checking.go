//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeServiceAccount_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeServiceAccount_ManifestParameters(props *KubeServiceAccountProps) error {
	return nil
}

func validateKubeServiceAccount_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeServiceAccountParameters(scope constructs.Construct, id *string, props *KubeServiceAccountProps) error {
	return nil
}

