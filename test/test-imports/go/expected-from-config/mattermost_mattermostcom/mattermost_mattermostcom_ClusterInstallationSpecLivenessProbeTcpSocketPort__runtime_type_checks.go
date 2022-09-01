//go:build !no_runtime_type_checking
// +build !no_runtime_type_checking

// mattermost_mattermostcom
package mattermost_mattermostcom

import (
	"fmt"
)

func validateClusterInstallationSpecLivenessProbeTcpSocketPort_FromNumberParameters(value *float64) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

func validateClusterInstallationSpecLivenessProbeTcpSocketPort_FromStringParameters(value *string) error {
	if value == nil {
		return fmt.Errorf("parameter value is required, but nil was provided")
	}

	return nil
}

