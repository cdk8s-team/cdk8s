//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeHorizontalPodAutoscaler_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeHorizontalPodAutoscaler_ManifestParameters(props *KubeHorizontalPodAutoscalerProps) error {
	return nil
}

func validateKubeHorizontalPodAutoscaler_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeHorizontalPodAutoscalerParameters(scope constructs.Construct, id *string, props *KubeHorizontalPodAutoscalerProps) error {
	return nil
}

