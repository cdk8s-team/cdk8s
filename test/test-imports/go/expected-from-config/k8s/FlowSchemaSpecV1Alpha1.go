// k8s
package k8s


// FlowSchemaSpec describes how the FlowSchema's specification looks like.
type FlowSchemaSpecV1Alpha1 struct {
	// `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster.
	//
	// If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
	PriorityLevelConfiguration *PriorityLevelConfigurationReferenceV1Alpha1 `field:"required" json:"priorityLevelConfiguration" yaml:"priorityLevelConfiguration"`
	// `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema.
	//
	// `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
	DistinguisherMethod *FlowDistinguisherMethodV1Alpha1 `field:"optional" json:"distinguisherMethod" yaml:"distinguisherMethod"`
	// `matchingPrecedence` is used to choose among the FlowSchemas that match a given request.
	//
	// The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be non-negative. Note that if the precedence is not specified or zero, it will be set to 1000 as default.
	MatchingPrecedence *float64 `field:"optional" json:"matchingPrecedence" yaml:"matchingPrecedence"`
	// `rules` describes which requests will match this flow schema.
	//
	// This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
	Rules *[]*PolicyRulesWithSubjectsV1Alpha1 `field:"optional" json:"rules" yaml:"rules"`
}

