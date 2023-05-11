package mattermostcom


// Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
type ClusterInstallationSpecMattermostEnvValueFromResourceFieldRef struct {
	// Required: resource to select.
	Resource *string `field:"required" json:"resource" yaml:"resource"`
	// Container name: required for volumes, optional for env vars.
	ContainerName *string `field:"optional" json:"containerName" yaml:"containerName"`
	// Specifies the output format of the exposed resources, defaults to "1".
	Divisor *string `field:"optional" json:"divisor" yaml:"divisor"`
}

