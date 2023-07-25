package k8s


// A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.
type ScopeSelector struct {
	// A list of scope selector requirements by scope of the resources.
	MatchExpressions *[]*ScopedResourceSelectorRequirement `field:"optional" json:"matchExpressions" yaml:"matchExpressions"`
}

