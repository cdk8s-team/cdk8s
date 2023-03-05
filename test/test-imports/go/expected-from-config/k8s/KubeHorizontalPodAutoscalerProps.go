// k8s
package k8s


// configuration of a horizontal pod autoscaler.
type KubeHorizontalPodAutoscalerProps struct {
	// Standard object metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// behaviour of autoscaler.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
	Spec *HorizontalPodAutoscalerSpec `field:"optional" json:"spec" yaml:"spec"`
}

