package k8s


// PodPreset is a policy resource that defines additional runtime requirements for a Pod.
type KubePodPresetV1Alpha1Props struct {
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	Spec *PodPresetSpecV1Alpha1 `field:"optional" json:"spec" yaml:"spec"`
}

