//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeEvent_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeEvent_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeEvent_ManifestParameters(props *KubeEventProps) error {
	return nil
}

func validateKubeEvent_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeEventParameters(scope constructs.Construct, id *string, props *KubeEventProps) error {
	return nil
}

