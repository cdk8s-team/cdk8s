//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeCronJobListV2Alpha1_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeCronJobListV2Alpha1_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeCronJobListV2Alpha1_ManifestParameters(props *KubeCronJobListV2Alpha1Props) error {
	return nil
}

func validateKubeCronJobListV2Alpha1_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeCronJobListV2Alpha1Parameters(scope constructs.Construct, id *string, props *KubeCronJobListV2Alpha1Props) error {
	return nil
}

