// k8s
package k8s


// PodPresetSpec is a description of a pod preset.
type PodPresetSpecV1Alpha1 struct {
	// Env defines the collection of EnvVar to inject into containers.
	Env *[]*EnvVar `field:"optional" json:"env" yaml:"env"`
	// EnvFrom defines the collection of EnvFromSource to inject into containers.
	EnvFrom *[]*EnvFromSource `field:"optional" json:"envFrom" yaml:"envFrom"`
	// Selector is a label query over a set of resources, in this case pods.
	//
	// Required.
	Selector *LabelSelector `field:"optional" json:"selector" yaml:"selector"`
	// VolumeMounts defines the collection of VolumeMount to inject into containers.
	VolumeMounts *[]*VolumeMount `field:"optional" json:"volumeMounts" yaml:"volumeMounts"`
	// Volumes defines the collection of Volume to inject into the pod.
	Volumes *[]*Volume `field:"optional" json:"volumes" yaml:"volumes"`
}

