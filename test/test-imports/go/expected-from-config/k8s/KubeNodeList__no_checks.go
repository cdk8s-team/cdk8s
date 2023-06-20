//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeNodeList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeNodeList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeNodeList_ManifestParameters(props *KubeNodeListProps) error {
	return nil
}

func validateKubeNodeList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeNodeListParameters(scope constructs.Construct, id *string, props *KubeNodeListProps) error {
	return nil
}

