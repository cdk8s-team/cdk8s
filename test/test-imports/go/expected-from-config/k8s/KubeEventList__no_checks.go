//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeEventList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeEventList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeEventList_ManifestParameters(props *KubeEventListProps) error {
	return nil
}

func validateKubeEventList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeEventListParameters(scope constructs.Construct, id *string, props *KubeEventListProps) error {
	return nil
}

