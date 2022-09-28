//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeSelfSubjectAccessReview_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeSelfSubjectAccessReview_ManifestParameters(props *KubeSelfSubjectAccessReviewProps) error {
	return nil
}

func validateKubeSelfSubjectAccessReview_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeSelfSubjectAccessReviewParameters(scope constructs.Construct, id *string, props *KubeSelfSubjectAccessReviewProps) error {
	return nil
}

