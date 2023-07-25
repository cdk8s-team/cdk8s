package k8s


// APIServiceList is a list of APIService objects.
type KubeApiServiceListV1Beta1Props struct {
	Items *[]*KubeApiServiceV1Beta1Props `field:"required" json:"items" yaml:"items"`
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

