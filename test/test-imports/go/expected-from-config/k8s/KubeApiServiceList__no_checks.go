//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeApiServiceList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeApiServiceList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeApiServiceList_ManifestParameters(props *KubeApiServiceListProps) error {
	return nil
}

func validateKubeApiServiceList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeApiServiceListParameters(scope constructs.Construct, id *string, props *KubeApiServiceListProps) error {
	return nil
}

