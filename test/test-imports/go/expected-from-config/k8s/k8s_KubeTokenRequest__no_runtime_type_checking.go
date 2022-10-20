//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeTokenRequest_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeTokenRequest_ManifestParameters(props *KubeTokenRequestProps) error {
	return nil
}

func validateKubeTokenRequest_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeTokenRequestParameters(scope constructs.Construct, id *string, props *KubeTokenRequestProps) error {
	return nil
}

