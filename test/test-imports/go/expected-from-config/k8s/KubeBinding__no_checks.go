//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeBinding_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeBinding_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeBinding_ManifestParameters(props *KubeBindingProps) error {
	return nil
}

func validateKubeBinding_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeBindingParameters(scope constructs.Construct, id *string, props *KubeBindingProps) error {
	return nil
}

