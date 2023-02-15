// k8s
package k8s


// Scale represents a scaling request for a resource.
type KubeScaleProps struct {
	// Standard object metadata;
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// defines the behavior of the scale.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
	Spec *ScaleSpec `field:"optional" json:"spec" yaml:"spec"`
}

