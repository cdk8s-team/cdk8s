//go:build no_runtime_type_checking

// mattermost_mattermostcom
package mattermost_mattermostcom

// Building without runtime type checking enabled, so all the below just return nil

func validateClusterInstallation_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateClusterInstallation_IsConstructParameters(x interface{}) error {
	return nil
}

func validateClusterInstallation_ManifestParameters(props *ClusterInstallationProps) error {
	return nil
}

func validateClusterInstallation_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewClusterInstallationParameters(scope constructs.Construct, id *string, props *ClusterInstallationProps) error {
	return nil
}

