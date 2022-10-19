// k8s
package k8s


// ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
type ResourceQuotaSpec struct {
	// hard is the set of desired hard limits for each named resource.
	//
	// More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
	Hard *map[string]Quantity `field:"optional" json:"hard" yaml:"hard"`
	// A collection of filters that must match each object tracked by a quota.
	//
	// If not specified, the quota matches all objects.
	Scopes *[]*string `field:"optional" json:"scopes" yaml:"scopes"`
	// scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values.
	//
	// For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
	ScopeSelector *ScopeSelector `field:"optional" json:"scopeSelector" yaml:"scopeSelector"`
}

