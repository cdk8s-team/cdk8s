//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeSecretList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeSecretList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeSecretList_ManifestParameters(props *KubeSecretListProps) error {
	return nil
}

func validateKubeSecretList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeSecretListParameters(scope constructs.Construct, id *string, props *KubeSecretListProps) error {
	return nil
}

