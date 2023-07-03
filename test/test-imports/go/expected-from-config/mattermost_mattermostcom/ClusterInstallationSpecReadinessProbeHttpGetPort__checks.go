//go:build !no_runtime_type_checking

package mattermost_mattermostcom

import (
	"fmt"
)

func validateClusterInstallationSpecReadinessProbeHttpGetPort_FromNumberParameters(value *float64) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

func validateClusterInstallationSpecReadinessProbeHttpGetPort_FromStringParameters(value *string) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

