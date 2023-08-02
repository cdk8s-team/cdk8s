//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeJobList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeJobList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeJobList_ManifestParameters(props *KubeJobListProps) error {
	return nil
}

func validateKubeJobList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeJobListParameters(scope constructs.Construct, id *string, props *KubeJobListProps) error {
	return nil
}

