//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeRole_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeRole_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeRole_ManifestParameters(props *KubeRoleProps) error {
	return nil
}

func validateKubeRole_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeRoleParameters(scope constructs.Construct, id *string, props *KubeRoleProps) error {
	return nil
}

