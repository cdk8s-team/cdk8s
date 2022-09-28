//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeReplicaSetListV1Beta2_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeReplicaSetListV1Beta2_ManifestParameters(props *KubeReplicaSetListV1Beta2Props) error {
	return nil
}

func validateKubeReplicaSetListV1Beta2_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeReplicaSetListV1Beta2Parameters(scope constructs.Construct, id *string, props *KubeReplicaSetListV1Beta2Props) error {
	return nil
}

