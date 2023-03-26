//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeClusterRoleList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeClusterRoleList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeClusterRoleList_ManifestParameters(props *KubeClusterRoleListProps) error {
	return nil
}

func validateKubeClusterRoleList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeClusterRoleListParameters(scope constructs.Construct, id *string, props *KubeClusterRoleListProps) error {
	return nil
}

