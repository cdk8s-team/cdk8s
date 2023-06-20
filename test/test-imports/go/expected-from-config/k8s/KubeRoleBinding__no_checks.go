//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeRoleBinding_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeRoleBinding_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeRoleBinding_ManifestParameters(props *KubeRoleBindingProps) error {
	return nil
}

func validateKubeRoleBinding_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeRoleBindingParameters(scope constructs.Construct, id *string, props *KubeRoleBindingProps) error {
	return nil
}

