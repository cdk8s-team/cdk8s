// k8s
package k8s


// ResourceFieldSelector represents container resources (cpu, memory) and their output format.
type ResourceFieldSelector struct {
	// Required: resource to select.
	Resource *string `field:"required" json:"resource" yaml:"resource"`
	// Container name: required for volumes, optional for env vars.
	ContainerName *string `field:"optional" json:"containerName" yaml:"containerName"`
	// Specifies the output format of the exposed resources, defaults to "1".
	Divisor Quantity `field:"optional" json:"divisor" yaml:"divisor"`
}

