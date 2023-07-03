package k8s


// StatefulSetList is a collection of StatefulSets.
type KubeStatefulSetListProps struct {
	Items *[]*KubeStatefulSetProps `field:"required" json:"items" yaml:"items"`
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

