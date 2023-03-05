//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeStorageClassV1Beta1_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeStorageClassV1Beta1_ManifestParameters(props *KubeStorageClassV1Beta1Props) error {
	return nil
}

func validateKubeStorageClassV1Beta1_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeStorageClassV1Beta1Parameters(scope constructs.Construct, id *string, props *KubeStorageClassV1Beta1Props) error {
	return nil
}

