package k8s


// PriorityLevelConfigurationList is a list of PriorityLevelConfiguration objects.
type KubePriorityLevelConfigurationListV1Alpha1Props struct {
	// `items` is a list of request-priorities.
	Items *[]*KubePriorityLevelConfigurationV1Alpha1Props `field:"required" json:"items" yaml:"items"`
	// `metadata` is the standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

