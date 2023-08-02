//go:build !no_runtime_type_checking

package mattermostcom

import (
	"fmt"
)

func validateClusterInstallationSpecReadinessProbeTcpSocketPort_FromNumberParameters(value *float64) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

func validateClusterInstallationSpecReadinessProbeTcpSocketPort_FromStringParameters(value *string) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

