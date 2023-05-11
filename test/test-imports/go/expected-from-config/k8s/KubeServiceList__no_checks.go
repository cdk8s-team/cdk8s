//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeServiceList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeServiceList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeServiceList_ManifestParameters(props *KubeServiceListProps) error {
	return nil
}

func validateKubeServiceList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeServiceListParameters(scope constructs.Construct, id *string, props *KubeServiceListProps) error {
	return nil
}

