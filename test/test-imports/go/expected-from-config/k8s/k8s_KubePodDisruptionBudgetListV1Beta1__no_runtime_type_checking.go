//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubePodDisruptionBudgetListV1Beta1_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubePodDisruptionBudgetListV1Beta1_ManifestParameters(props *KubePodDisruptionBudgetListV1Beta1Props) error {
	return nil
}

func validateKubePodDisruptionBudgetListV1Beta1_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubePodDisruptionBudgetListV1Beta1Parameters(scope constructs.Construct, id *string, props *KubePodDisruptionBudgetListV1Beta1Props) error {
	return nil
}

