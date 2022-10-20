//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeControllerRevisionList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeControllerRevisionList_ManifestParameters(props *KubeControllerRevisionListProps) error {
	return nil
}

func validateKubeControllerRevisionList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeControllerRevisionListParameters(scope constructs.Construct, id *string, props *KubeControllerRevisionListProps) error {
	return nil
}

