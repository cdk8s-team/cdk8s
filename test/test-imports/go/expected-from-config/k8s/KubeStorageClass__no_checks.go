//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeStorageClass_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeStorageClass_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeStorageClass_ManifestParameters(props *KubeStorageClassProps) error {
	return nil
}

func validateKubeStorageClass_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeStorageClassParameters(scope constructs.Construct, id *string, props *KubeStorageClassProps) error {
	return nil
}

