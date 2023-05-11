package k8s


// ScaleSpec describes the attributes of a scale subresource.
type ScaleSpecV1Beta2 struct {
	// desired number of instances for the scaled object.
	Replicas *float64 `field:"optional" json:"replicas" yaml:"replicas"`
}

