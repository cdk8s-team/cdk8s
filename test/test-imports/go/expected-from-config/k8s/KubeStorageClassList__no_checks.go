//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeStorageClassList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeStorageClassList_ManifestParameters(props *KubeStorageClassListProps) error {
	return nil
}

func validateKubeStorageClassList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeStorageClassListParameters(scope constructs.Construct, id *string, props *KubeStorageClassListProps) error {
	return nil
}

