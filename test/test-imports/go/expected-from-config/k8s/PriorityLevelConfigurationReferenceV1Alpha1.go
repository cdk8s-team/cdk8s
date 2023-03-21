// k8s
package k8s


// PriorityLevelConfigurationReference contains information that points to the "request-priority" being used.
type PriorityLevelConfigurationReferenceV1Alpha1 struct {
	// `name` is the name of the priority level configuration being referenced Required.
	Name *string `field:"required" json:"name" yaml:"name"`
}

