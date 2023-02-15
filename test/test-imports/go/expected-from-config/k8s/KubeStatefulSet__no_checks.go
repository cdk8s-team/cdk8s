//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeStatefulSet_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeStatefulSet_ManifestParameters(props *KubeStatefulSetProps) error {
	return nil
}

func validateKubeStatefulSet_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeStatefulSetParameters(scope constructs.Construct, id *string, props *KubeStatefulSetProps) error {
	return nil
}

