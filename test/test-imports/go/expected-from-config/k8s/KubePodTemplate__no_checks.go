//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubePodTemplate_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubePodTemplate_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubePodTemplate_ManifestParameters(props *KubePodTemplateProps) error {
	return nil
}

func validateKubePodTemplate_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubePodTemplateParameters(scope constructs.Construct, id *string, props *KubePodTemplateProps) error {
	return nil
}

