//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubePriorityClassList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubePriorityClassList_ManifestParameters(props *KubePriorityClassListProps) error {
	return nil
}

func validateKubePriorityClassList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubePriorityClassListParameters(scope constructs.Construct, id *string, props *KubePriorityClassListProps) error {
	return nil
}

