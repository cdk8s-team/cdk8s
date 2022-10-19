//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeJob_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeJob_ManifestParameters(props *KubeJobProps) error {
	return nil
}

func validateKubeJob_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeJobParameters(scope constructs.Construct, id *string, props *KubeJobProps) error {
	return nil
}

