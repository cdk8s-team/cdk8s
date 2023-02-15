//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeDaemonSet_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeDaemonSet_ManifestParameters(props *KubeDaemonSetProps) error {
	return nil
}

func validateKubeDaemonSet_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeDaemonSetParameters(scope constructs.Construct, id *string, props *KubeDaemonSetProps) error {
	return nil
}

