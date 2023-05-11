//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeHorizontalPodAutoscalerList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeHorizontalPodAutoscalerList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeHorizontalPodAutoscalerList_ManifestParameters(props *KubeHorizontalPodAutoscalerListProps) error {
	return nil
}

func validateKubeHorizontalPodAutoscalerList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeHorizontalPodAutoscalerListParameters(scope constructs.Construct, id *string, props *KubeHorizontalPodAutoscalerListProps) error {
	return nil
}

