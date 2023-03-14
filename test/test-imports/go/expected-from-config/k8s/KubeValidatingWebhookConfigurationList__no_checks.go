//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeValidatingWebhookConfigurationList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeValidatingWebhookConfigurationList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeValidatingWebhookConfigurationList_ManifestParameters(props *KubeValidatingWebhookConfigurationListProps) error {
	return nil
}

func validateKubeValidatingWebhookConfigurationList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeValidatingWebhookConfigurationListParameters(scope constructs.Construct, id *string, props *KubeValidatingWebhookConfigurationListProps) error {
	return nil
}

