//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeRoleBindingList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeRoleBindingList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeRoleBindingList_ManifestParameters(props *KubeRoleBindingListProps) error {
	return nil
}

func validateKubeRoleBindingList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeRoleBindingListParameters(scope constructs.Construct, id *string, props *KubeRoleBindingListProps) error {
	return nil
}

