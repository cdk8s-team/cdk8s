//go:build no_runtime_type_checking

package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeSelfSubjectRulesReview_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeSelfSubjectRulesReview_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeSelfSubjectRulesReview_ManifestParameters(props *KubeSelfSubjectRulesReviewProps) error {
	return nil
}

func validateKubeSelfSubjectRulesReview_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeSelfSubjectRulesReviewParameters(scope constructs.Construct, id *string, props *KubeSelfSubjectRulesReviewProps) error {
	return nil
}

