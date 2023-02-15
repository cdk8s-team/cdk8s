//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeTokenReview_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeTokenReview_ManifestParameters(props *KubeTokenReviewProps) error {
	return nil
}

func validateKubeTokenReview_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeTokenReviewParameters(scope constructs.Construct, id *string, props *KubeTokenReviewProps) error {
	return nil
}

