//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeDeploymentList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeDeploymentList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeDeploymentList_ManifestParameters(props *KubeDeploymentListProps) error {
	return nil
}

func validateKubeDeploymentList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeDeploymentListParameters(scope constructs.Construct, id *string, props *KubeDeploymentListProps) error {
	return nil
}

