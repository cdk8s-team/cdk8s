// k8s
package k8s


// StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response.
//
// The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
type StatusDetails struct {
	// The Causes array includes more details associated with the StatusReason failure.
	//
	// Not all StatusReasons may provide detailed causes.
	Causes *[]*StatusCause `field:"optional" json:"causes" yaml:"causes"`
	// The group attribute of the resource associated with the status StatusReason.
	Group *string `field:"optional" json:"group" yaml:"group"`
	// The kind attribute of the resource associated with the status StatusReason.
	//
	// On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `field:"optional" json:"kind" yaml:"kind"`
	// The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
	Name *string `field:"optional" json:"name" yaml:"name"`
	// If specified, the time in seconds before the operation should be retried.
	//
	// Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
	RetryAfterSeconds *float64 `field:"optional" json:"retryAfterSeconds" yaml:"retryAfterSeconds"`
	// UID of the resource.
	//
	// (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
	Uid *string `field:"optional" json:"uid" yaml:"uid"`
}

