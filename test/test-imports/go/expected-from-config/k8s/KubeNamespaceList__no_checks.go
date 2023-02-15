//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeNamespaceList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeNamespaceList_ManifestParameters(props *KubeNamespaceListProps) error {
	return nil
}

func validateKubeNamespaceList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeNamespaceListParameters(scope constructs.Construct, id *string, props *KubeNamespaceListProps) error {
	return nil
}

