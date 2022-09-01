//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubePod_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubePod_ManifestParameters(props *KubePodProps) error {
	return nil
}

func validateKubePod_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubePodParameters(scope constructs.Construct, id *string, props *KubePodProps) error {
	return nil
}

