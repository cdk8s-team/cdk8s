//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeLimitRangeList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeLimitRangeList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeLimitRangeList_ManifestParameters(props *KubeLimitRangeListProps) error {
	return nil
}

func validateKubeLimitRangeList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeLimitRangeListParameters(scope constructs.Construct, id *string, props *KubeLimitRangeListProps) error {
	return nil
}

