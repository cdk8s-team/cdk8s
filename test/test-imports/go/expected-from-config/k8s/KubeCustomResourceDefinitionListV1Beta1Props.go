package k8s


// CustomResourceDefinitionList is a list of CustomResourceDefinition objects.
type KubeCustomResourceDefinitionListV1Beta1Props struct {
	// items list individual CustomResourceDefinition objects.
	Items *[]*KubeCustomResourceDefinitionV1Beta1Props `field:"required" json:"items" yaml:"items"`
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

