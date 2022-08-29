// k8s
package k8s


// describes the attributes of a scale subresource.
type ScaleSpecV1Beta1 struct {
	// desired number of instances for the scaled object.
	Replicas *float64 `field:"optional" json:"replicas" yaml:"replicas"`
}

