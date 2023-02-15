//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubePriorityClass_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubePriorityClass_ManifestParameters(props *KubePriorityClassProps) error {
	return nil
}

func validateKubePriorityClass_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubePriorityClassParameters(scope constructs.Construct, id *string, props *KubePriorityClassProps) error {
	return nil
}

