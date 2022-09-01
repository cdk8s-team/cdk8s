//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeLimitRange_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeLimitRange_ManifestParameters(props *KubeLimitRangeProps) error {
	return nil
}

func validateKubeLimitRange_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeLimitRangeParameters(scope constructs.Construct, id *string, props *KubeLimitRangeProps) error {
	return nil
}

