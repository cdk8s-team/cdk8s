package k8s


// CustomResourceDefinitionList is a list of CustomResourceDefinition objects.
type KubeCustomResourceDefinitionListProps struct {
	// items list individual CustomResourceDefinition objects.
	Items *[]*KubeCustomResourceDefinitionProps `field:"required" json:"items" yaml:"items"`
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

