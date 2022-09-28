//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeResourceQuota_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeResourceQuota_ManifestParameters(props *KubeResourceQuotaProps) error {
	return nil
}

func validateKubeResourceQuota_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeResourceQuotaParameters(scope constructs.Construct, id *string, props *KubeResourceQuotaProps) error {
	return nil
}

