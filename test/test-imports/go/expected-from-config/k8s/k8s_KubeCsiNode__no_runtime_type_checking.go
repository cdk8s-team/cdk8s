//go:build no_runtime_type_checking
// +build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateKubeCsiNode_IsConstructParameters(x interface{}) error {
	return nil
}

func validateKubeCsiNode_ManifestParameters(props *KubeCsiNodeProps) error {
	return nil
}

func validateKubeCsiNode_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewKubeCsiNodeParameters(scope constructs.Construct, id *string, props *KubeCsiNodeProps) error {
	return nil
}

