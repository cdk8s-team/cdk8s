//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubePodList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubePodList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubePodList_ManifestParameters(props *KubePodListProps) error {
	return nil
}

func validateKubePodList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubePodListParameters(scope constructs.Construct, id *string, props *KubePodListProps) error {
	return nil
}

