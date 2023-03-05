//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeServiceAccountList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeServiceAccountList_ManifestParameters(props *KubeServiceAccountListProps) error {
	return nil
}

func validateKubeServiceAccountList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeServiceAccountListParameters(scope constructs.Construct, id *string, props *KubeServiceAccountListProps) error {
	return nil
}

