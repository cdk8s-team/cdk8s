// k8s
package k8s


// A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
type ScopedResourceSelectorRequirement struct {
	// Represents a scope's relationship to a set of values.
	//
	// Valid operators are In, NotIn, Exists, DoesNotExist.
	Operator *string `field:"required" json:"operator" yaml:"operator"`
	// The name of the scope that the selector applies to.
	ScopeName *string `field:"required" json:"scopeName" yaml:"scopeName"`
	// An array of string values.
	//
	// If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
	Values *[]*string `field:"optional" json:"values" yaml:"values"`
}

