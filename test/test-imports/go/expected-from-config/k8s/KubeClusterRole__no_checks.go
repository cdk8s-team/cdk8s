//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeClusterRole_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeClusterRole_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeClusterRole_ManifestParameters(props *KubeClusterRoleProps) error {
	return nil
}

func validateKubeClusterRole_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeClusterRoleParameters(scope constructs.Construct, id *string, props *KubeClusterRoleProps) error {
	return nil
}

