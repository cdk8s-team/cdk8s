//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeStatefulSetList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeStatefulSetList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeStatefulSetList_ManifestParameters(props *KubeStatefulSetListProps) error {
	return nil
}

func validateKubeStatefulSetList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeStatefulSetListParameters(scope constructs.Construct, id *string, props *KubeStatefulSetListProps) error {
	return nil
}

