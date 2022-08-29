// k8s
package k8s


// LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
type LimitRangeItem struct {
	// Default resource requirement limit value by resource name if resource limit is omitted.
	Default *map[string]Quantity `field:"optional" json:"default" yaml:"default"`
	// DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
	DefaultRequest *map[string]Quantity `field:"optional" json:"defaultRequest" yaml:"defaultRequest"`
	// Max usage constraints on this kind by resource name.
	Max *map[string]Quantity `field:"optional" json:"max" yaml:"max"`
	// MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value;
	//
	// this represents the max burst for the named resource.
	MaxLimitRequestRatio *map[string]Quantity `field:"optional" json:"maxLimitRequestRatio" yaml:"maxLimitRequestRatio"`
	// Min usage constraints on this kind by resource name.
	Min *map[string]Quantity `field:"optional" json:"min" yaml:"min"`
	// Type of resource that this limit applies to.
	Type *string `field:"optional" json:"type" yaml:"type"`
}

