package mattermostcom


// EnvVar represents an environment variable present in a Container.
type ClusterInstallationSpecMattermostEnv struct {
	// Name of the environment variable.
	//
	// Must be a C_IDENTIFIER.
	Name *string `field:"required" json:"name" yaml:"name"`
	// Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.
	//
	// If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
	Value *string `field:"optional" json:"value" yaml:"value"`
	// Source for the environment variable's value.
	//
	// Cannot be used if value is not empty.
	ValueFrom *ClusterInstallationSpecMattermostEnvValueFrom `field:"optional" json:"valueFrom" yaml:"valueFrom"`
}

