//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeLease_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeLease_ManifestParameters(props *KubeLeaseProps) error {
	return nil
}

func validateKubeLease_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeLeaseParameters(scope constructs.Construct, id *string, props *KubeLeaseProps) error {
	return nil
}

