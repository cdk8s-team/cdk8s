//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeEndpoints_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeEndpoints_ManifestParameters(props *KubeEndpointsProps) error {
	return nil
}

func validateKubeEndpoints_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeEndpointsParameters(scope constructs.Construct, id *string, props *KubeEndpointsProps) error {
	return nil
}

