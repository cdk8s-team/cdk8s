//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeScale_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeScale_ManifestParameters(props *KubeScaleProps) error {
	return nil
}

func validateKubeScale_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeScaleParameters(scope constructs.Construct, id *string, props *KubeScaleProps) error {
	return nil
}

