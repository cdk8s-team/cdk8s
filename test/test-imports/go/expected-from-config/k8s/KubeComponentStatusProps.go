package k8s


// ComponentStatus (and ComponentStatusList) holds the cluster validation info.
type KubeComponentStatusProps struct {
	// List of component conditions observed.
	Conditions *[]*ComponentCondition `field:"optional" json:"conditions" yaml:"conditions"`
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

