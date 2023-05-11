package k8s


// SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.
type SupplementalGroupsStrategyOptionsV1Beta1 struct {
	// ranges are the allowed ranges of supplemental groups.
	//
	// If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
	Ranges *[]*IdRangeV1Beta1 `field:"optional" json:"ranges" yaml:"ranges"`
	// rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
	Rule *string `field:"optional" json:"rule" yaml:"rule"`
}

