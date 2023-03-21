//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeClusterRoleBinding_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeClusterRoleBinding_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeClusterRoleBinding_ManifestParameters(props *KubeClusterRoleBindingProps) error {
	return nil
}

func validateKubeClusterRoleBinding_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeClusterRoleBindingParameters(scope constructs.Construct, id *string, props *KubeClusterRoleBindingProps) error {
	return nil
}

