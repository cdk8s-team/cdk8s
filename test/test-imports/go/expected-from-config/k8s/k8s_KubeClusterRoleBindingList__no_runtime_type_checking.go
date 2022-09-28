//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeClusterRoleBindingList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeClusterRoleBindingList_ManifestParameters(props *KubeClusterRoleBindingListProps) error {
	return nil
}

func validateKubeClusterRoleBindingList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeClusterRoleBindingListParameters(scope constructs.Construct, id *string, props *KubeClusterRoleBindingListProps) error {
	return nil
}

