//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeDeployment_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeDeployment_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeDeployment_ManifestParameters(props *KubeDeploymentProps) error {
	return nil
}

func validateKubeDeployment_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeDeploymentParameters(scope constructs.Construct, id *string, props *KubeDeploymentProps) error {
	return nil
}

