//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeReplicaSetV1Beta2_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeReplicaSetV1Beta2_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeReplicaSetV1Beta2_ManifestParameters(props *KubeReplicaSetV1Beta2Props) error {
	return nil
}

func validateKubeReplicaSetV1Beta2_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeReplicaSetV1Beta2Parameters(scope constructs.Construct, id *string, props *KubeReplicaSetV1Beta2Props) error {
	return nil
}

