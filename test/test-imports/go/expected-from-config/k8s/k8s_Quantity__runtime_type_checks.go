//go:build !no_runtime_type_checking
// +build !no_runtime_type_checking

// k8s
package k8s

import (
	"fmt"
)

func validateQuantity_FromNumberParameters(value *float64) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

func validateQuantity_FromStringParameters(value *string) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

