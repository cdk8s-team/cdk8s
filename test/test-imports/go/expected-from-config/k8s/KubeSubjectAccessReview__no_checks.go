//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeSubjectAccessReview_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeSubjectAccessReview_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeSubjectAccessReview_ManifestParameters(props *KubeSubjectAccessReviewProps) error {
	return nil
}

func validateKubeSubjectAccessReview_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeSubjectAccessReviewParameters(scope constructs.Construct, id *string, props *KubeSubjectAccessReviewProps) error {
	return nil
}

