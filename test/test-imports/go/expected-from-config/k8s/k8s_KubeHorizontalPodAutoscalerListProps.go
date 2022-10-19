// k8s
package k8s


// list of horizontal pod autoscaler objects.
type KubeHorizontalPodAutoscalerListProps struct {
	// list of horizontal pod autoscaler objects.
	Items *[]*KubeHorizontalPodAutoscalerProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

