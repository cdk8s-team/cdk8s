package k8s


// RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.
type RuntimeClassStrategyOptionsV1Beta1 struct {
	// allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod.
	//
	// A value of "*" means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
	AllowedRuntimeClassNames *[]*string `field:"required" json:"allowedRuntimeClassNames" yaml:"allowedRuntimeClassNames"`
	// defaultRuntimeClassName is the default RuntimeClassName to set on the pod.
	//
	// The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
	DefaultRuntimeClassName *string `field:"optional" json:"defaultRuntimeClassName" yaml:"defaultRuntimeClassName"`
}

