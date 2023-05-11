//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeNode_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeNode_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeNode_ManifestParameters(props *KubeNodeProps) error {
	return nil
}

func validateKubeNode_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeNodeParameters(scope constructs.Construct, id *string, props *KubeNodeProps) error {
	return nil
}

