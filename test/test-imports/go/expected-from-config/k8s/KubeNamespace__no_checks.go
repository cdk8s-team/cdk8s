//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeNamespace_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeNamespace_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeNamespace_ManifestParameters(props *KubeNamespaceProps) error {
	return nil
}

func validateKubeNamespace_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeNamespaceParameters(scope constructs.Construct, id *string, props *KubeNamespaceProps) error {
	return nil
}

