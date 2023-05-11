//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeLocalSubjectAccessReview_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeLocalSubjectAccessReview_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeLocalSubjectAccessReview_ManifestParameters(props *KubeLocalSubjectAccessReviewProps) error {
	return nil
}

func validateKubeLocalSubjectAccessReview_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeLocalSubjectAccessReviewParameters(scope constructs.Construct, id *string, props *KubeLocalSubjectAccessReviewProps) error {
	return nil
}

