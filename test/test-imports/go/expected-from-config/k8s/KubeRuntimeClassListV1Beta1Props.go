// k8s
package k8s


// RuntimeClassList is a list of RuntimeClass objects.
type KubeRuntimeClassListV1Beta1Props struct {
	// Items is a list of schema objects.
	Items *[]*KubeRuntimeClassV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

