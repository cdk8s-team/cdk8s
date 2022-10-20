//go:build no_runtime_type_checking

// jenkinsio
package jenkinsio

// Building without runtime type checking enabled, so all the below just return nil

func validateJenkins_IsConstructParameters(x interface{}) error {
	return nil
}

func validateJenkins_ManifestParameters(props *JenkinsProps) error {
	return nil
}

func validateJenkins_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewJenkinsParameters(scope constructs.Construct, id *string, props *JenkinsProps) error {
	return nil
}

