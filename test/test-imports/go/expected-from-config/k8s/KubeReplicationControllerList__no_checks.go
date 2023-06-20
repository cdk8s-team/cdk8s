//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeReplicationControllerList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeReplicationControllerList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeReplicationControllerList_ManifestParameters(props *KubeReplicationControllerListProps) error {
	return nil
}

func validateKubeReplicationControllerList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeReplicationControllerListParameters(scope constructs.Construct, id *string, props *KubeReplicationControllerListProps) error {
	return nil
}

