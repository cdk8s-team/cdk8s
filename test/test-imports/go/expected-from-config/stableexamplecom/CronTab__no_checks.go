//go:build no_runtime_type_checking

package stableexamplecom

// Building without runtime type checking enabled, so all the below just return nil

func validateCronTab_IsApiObjectParameters(o interface{}) error {
	return nil
}

func validateCronTab_IsConstructParameters(x interface{}) error {
	return nil
}

func validateCronTab_ManifestParameters(props *CronTabProps) error {
	return nil
}

func validateCronTab_OfParameters(c constructs.IConstruct) error {
	return nil
}

func validateNewCronTabParameters(scope constructs.Construct, id *string, props *CronTabProps) error {
	return nil
}

