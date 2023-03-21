//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeStatefulSetV1Beta1_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeStatefulSetV1Beta1_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeStatefulSetV1Beta1_ManifestParameters(props *KubeStatefulSetV1Beta1Props) error {
	return nil
}

func validateKubeStatefulSetV1Beta1_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeStatefulSetV1Beta1Parameters(scope constructs.Construct, id *string, props *KubeStatefulSetV1Beta1Props) error {
	return nil
}

