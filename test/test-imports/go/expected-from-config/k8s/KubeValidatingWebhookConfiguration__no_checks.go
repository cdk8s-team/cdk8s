//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeValidatingWebhookConfiguration_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeValidatingWebhookConfiguration_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeValidatingWebhookConfiguration_ManifestParameters(props *KubeValidatingWebhookConfigurationProps) error {
	return nil
}

func validateKubeValidatingWebhookConfiguration_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeValidatingWebhookConfigurationParameters(scope constructs.Construct, id *string, props *KubeValidatingWebhookConfigurationProps) error {
	return nil
}

