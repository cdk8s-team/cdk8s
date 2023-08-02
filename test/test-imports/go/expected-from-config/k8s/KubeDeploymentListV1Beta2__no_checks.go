//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeDeploymentListV1Beta2_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeDeploymentListV1Beta2_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeDeploymentListV1Beta2_ManifestParameters(props *KubeDeploymentListV1Beta2Props) error {
	return nil
}

func validateKubeDeploymentListV1Beta2_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeDeploymentListV1Beta2Parameters(scope constructs.Construct, id *string, props *KubeDeploymentListV1Beta2Props) error {
	return nil
}

