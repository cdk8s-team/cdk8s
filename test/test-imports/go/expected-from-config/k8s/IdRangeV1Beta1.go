package k8s


// IDRange provides a min/max of an allowed range of IDs.
type IdRangeV1Beta1 struct {
	// max is the end of the range, inclusive.
	Max *float64 `field:"required" json:"max" yaml:"max"`
	// min is the start of the range, inclusive.
	Min *float64 `field:"required" json:"min" yaml:"min"`
}

