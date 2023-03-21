// jenkinsio
package jenkinsio


// EnvFromSource represents the source of a set of ConfigMaps.
type JenkinsSpecMasterContainersEnvFrom struct {
	// The ConfigMap to select from.
	ConfigMapRef *JenkinsSpecMasterContainersEnvFromConfigMapRef `field:"optional" json:"configMapRef" yaml:"configMapRef"`
	// An optional identifier to prepend to each key in the ConfigMap.
	//
	// Must be a C_IDENTIFIER.
	Prefix *string `field:"optional" json:"prefix" yaml:"prefix"`
	// The Secret to select from.
	SecretRef *JenkinsSpecMasterContainersEnvFromSecretRef `field:"optional" json:"secretRef" yaml:"secretRef"`
}

