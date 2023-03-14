//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeLeaseList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeLeaseList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeLeaseList_ManifestParameters(props *KubeLeaseListProps) error {
	return nil
}

func validateKubeLeaseList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeLeaseListParameters(scope constructs.Construct, id *string, props *KubeLeaseListProps) error {
	return nil
}

