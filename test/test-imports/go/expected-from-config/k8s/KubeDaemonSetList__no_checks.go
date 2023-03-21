//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeDaemonSetList_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateKubeDaemonSetList_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeDaemonSetList_ManifestParameters(props *KubeDaemonSetListProps) error {
	return nil
}

func validateKubeDaemonSetList_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeDaemonSetListParameters(scope constructs.Construct, id *string, props *KubeDaemonSetListProps) error {
	return nil
}

