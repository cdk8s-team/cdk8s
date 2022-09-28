//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeNetworkPolicy_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeNetworkPolicy_ManifestParameters(props *KubeNetworkPolicyProps) error {
	return nil
}

func validateKubeNetworkPolicy_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeNetworkPolicyParameters(scope constructs.Construct, id *string, props *KubeNetworkPolicyProps) error {
	return nil
}

