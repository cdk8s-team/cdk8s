//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeReplicationController_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeReplicationController_ManifestParameters(props *KubeReplicationControllerProps) error {
	return nil
}

func validateKubeReplicationController_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeReplicationControllerParameters(scope constructs.Construct, id *string, props *KubeReplicationControllerProps) error {
	return nil
}

