//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeEndpointsList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeEndpointsList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeEndpointsList_ManifestParameters(props *KubeEndpointsListProps) error {
	return nil
}

func validateKubeEndpointsList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeEndpointsListParameters(scope constructs.Construct, id *string, props *KubeEndpointsListProps) error {
	return nil
}

