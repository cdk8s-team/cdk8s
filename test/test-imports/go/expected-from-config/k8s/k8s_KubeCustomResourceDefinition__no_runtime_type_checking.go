//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeCustomResourceDefinition_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeCustomResourceDefinition_ManifestParameters(props *KubeCustomResourceDefinitionProps) error {
	return nil
}

func validateKubeCustomResourceDefinition_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeCustomResourceDefinitionParameters(scope constructs.Construct, id *string, props *KubeCustomResourceDefinitionProps) error {
	return nil
}

