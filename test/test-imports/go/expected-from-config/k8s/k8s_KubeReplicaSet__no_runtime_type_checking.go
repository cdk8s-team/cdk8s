//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeReplicaSet_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeReplicaSet_ManifestParameters(props *KubeReplicaSetProps) error {
	return nil
}

func validateKubeReplicaSet_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeReplicaSetParameters(scope constructs.Construct, id *string, props *KubeReplicaSetProps) error {
	return nil
}

