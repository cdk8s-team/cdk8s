// k8s
package k8s


// APIServiceList is a list of APIService objects.
type KubeApiServiceListProps struct {
	Items *[]*KubeApiServiceProps `field:"required" json:"items" yaml:"items"`
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

