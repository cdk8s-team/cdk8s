//go:build !no_runtime_type_checking

// jenkinsio
package jenkinsio

import (
	"fmt"
)

func validateJenkinsSpecMasterContainersLivenessProbeTcpSocketPort_FromNumberParameters(value *float64) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

func validateJenkinsSpecMasterContainersLivenessProbeTcpSocketPort_FromStringParameters(value *string) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

