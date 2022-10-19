//go:build !no_runtime_type_checking
// +build !no_runtime_type_checking

// jenkinsio
package jenkinsio

import (
	"fmt"
)

func validateJenkinsSpecMasterContainersReadinessProbeHttpGetPort_FromNumberParameters(value *float64) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

func validateJenkinsSpecMasterContainersReadinessProbeHttpGetPort_FromStringParameters(value *string) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

