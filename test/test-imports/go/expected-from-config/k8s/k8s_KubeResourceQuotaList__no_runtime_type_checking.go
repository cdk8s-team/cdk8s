//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeResourceQuotaList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeResourceQuotaList_ManifestParameters(props *KubeResourceQuotaListProps) error {
	return nil
}

func validateKubeResourceQuotaList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeResourceQuotaListParameters(scope constructs.Construct, id *string, props *KubeResourceQuotaListProps) error {
	return nil
}

