//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeApiService_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeApiService_ManifestParameters(props *KubeApiServiceProps) error {
	return nil
}

func validateKubeApiService_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeApiServiceParameters(scope constructs.Construct, id *string, props *KubeApiServiceProps) error {
	return nil
}

