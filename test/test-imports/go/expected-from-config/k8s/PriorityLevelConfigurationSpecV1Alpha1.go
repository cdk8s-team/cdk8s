package k8s


// PriorityLevelConfigurationSpec specifies the configuration of a priority level.
type PriorityLevelConfigurationSpecV1Alpha1 struct {
	// `type` indicates whether this priority level is subject to limitation on request execution.
	//
	// A value of `"Exempt"` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `"Limited"` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.
	Type *string `field:"required" json:"type" yaml:"type"`
	// `limited` specifies how requests are handled for a Limited priority level.
	//
	// This field must be non-empty if and only if `type` is `"Limited"`.
	Limited *LimitedPriorityLevelConfigurationV1Alpha1 `field:"optional" json:"limited" yaml:"limited"`
}

