//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeRoleListV1Alpha1_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeRoleListV1Alpha1_ManifestParameters(props *KubeRoleListV1Alpha1Props) error {
	return nil
}

func validateKubeRoleListV1Alpha1_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeRoleListV1Alpha1Parameters(scope constructs.Construct, id *string, props *KubeRoleListV1Alpha1Props) error {
	return nil
}

