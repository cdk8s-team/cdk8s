package k8s


type SelfSubjectRulesReviewSpecV1Beta1 struct {
	// Namespace to evaluate rules for.
	//
	// Required.
	Namespace *string `field:"optional" json:"namespace" yaml:"namespace"`
}

