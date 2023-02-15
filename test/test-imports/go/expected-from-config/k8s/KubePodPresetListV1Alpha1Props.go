// k8s
package k8s


// PodPresetList is a list of PodPreset objects.
type KubePodPresetListV1Alpha1Props struct {
	// Items is a list of schema objects.
	Items *[]*KubePodPresetV1Alpha1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

