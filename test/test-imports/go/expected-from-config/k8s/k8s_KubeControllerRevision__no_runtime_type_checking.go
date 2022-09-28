//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeControllerRevision_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeControllerRevision_ManifestParameters(props *KubeControllerRevisionProps) error {
	return nil
}

func validateKubeControllerRevision_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeControllerRevisionParameters(scope constructs.Construct, id *string, props *KubeControllerRevisionProps) error {
	return nil
}

