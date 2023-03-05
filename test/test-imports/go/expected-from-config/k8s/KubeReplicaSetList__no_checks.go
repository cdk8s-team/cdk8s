//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeReplicaSetList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeReplicaSetList_ManifestParameters(props *KubeReplicaSetListProps) error {
	return nil
}

func validateKubeReplicaSetList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeReplicaSetListParameters(scope constructs.Construct, id *string, props *KubeReplicaSetListProps) error {
	return nil
}

