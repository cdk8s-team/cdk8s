//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeMutatingWebhookConfiguration_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeMutatingWebhookConfiguration_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeMutatingWebhookConfiguration_ManifestParameters(props *KubeMutatingWebhookConfigurationProps) error {
	return nil
}

func validateKubeMutatingWebhookConfiguration_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeMutatingWebhookConfigurationParameters(scope constructs.Construct, id *string, props *KubeMutatingWebhookConfigurationProps) error {
	return nil
}

