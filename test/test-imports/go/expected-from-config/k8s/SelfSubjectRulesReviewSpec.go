package k8s


type SelfSubjectRulesReviewSpec struct {
	// Namespace to evaluate rules for.
	//
	// Required.
	Namespace *string `field:"optional" json:"namespace" yaml:"namespace"`
}

