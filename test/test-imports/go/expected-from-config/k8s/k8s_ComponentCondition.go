// k8s
package k8s


// Information about the condition of a component.
type ComponentCondition struct {
	// Status of the condition for a component.
	//
	// Valid values for "Healthy": "True", "False", or "Unknown".
	Status *string `field:"required" json:"status" yaml:"status"`
	// Type of condition for a component.
	//
	// Valid value: "Healthy".
	Type *string `field:"required" json:"type" yaml:"type"`
	// Condition error code for a component.
	//
	// For example, a health check error code.
	Error *string `field:"optional" json:"error" yaml:"error"`
	// Message about the condition for a component.
	//
	// For example, information about a health check.
	Message *string `field:"optional" json:"message" yaml:"message"`
}

