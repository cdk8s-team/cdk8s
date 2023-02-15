//go:build no_runtime_type_checking

// k8s
package k8s

// Building without runtime type checking enabled, so all the below just return nil

func validateQuantity_FromNumberParameters(value *float64) error {
	return nil
}

func validateQuantity_FromStringParameters(value *string) error {
	return nil
}

