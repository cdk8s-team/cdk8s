// k8s
package k8s


// Status is a return value for calls that don't return other objects.
type KubeStatusProps struct {
	// Suggested HTTP return code for this status, 0 if not set.
	Code *float64 `field:"optional" json:"code" yaml:"code"`
	// Extended data associated with the reason.
	//
	// Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
	Details *StatusDetails `field:"optional" json:"details" yaml:"details"`
	// A human-readable description of the status of this operation.
	Message *string `field:"optional" json:"message" yaml:"message"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// A machine-readable description of why this operation is in the "Failure" status.
	//
	// If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
	Reason *string `field:"optional" json:"reason" yaml:"reason"`
}

