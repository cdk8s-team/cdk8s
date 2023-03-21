//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeCsiNodeList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeCsiNodeList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeCsiNodeList_ManifestParameters(props *KubeCsiNodeListProps) error {
	return nil
}

func validateKubeCsiNodeList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeCsiNodeListParameters(scope constructs.Construct, id *string, props *KubeCsiNodeListProps) error {
	return nil
}

