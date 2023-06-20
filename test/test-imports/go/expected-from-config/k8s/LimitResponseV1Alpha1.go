package k8s


// LimitResponse defines how to handle requests that can not be executed right now.
type LimitResponseV1Alpha1 struct {
	// `type` is "Queue" or "Reject".
	//
	// "Queue" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. "Reject" means that requests that can not be executed upon arrival are rejected. Required.
	Type *string `field:"required" json:"type" yaml:"type"`
	// `queuing` holds the configuration parameters for queuing.
	//
	// This field may be non-empty only if `type` is `"Queue"`.
	Queuing *QueuingConfigurationV1Alpha1 `field:"optional" json:"queuing" yaml:"queuing"`
}

