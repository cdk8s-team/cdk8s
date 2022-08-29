// k8s
package k8s


// StatefulSetList is a collection of StatefulSets.
type KubeStatefulSetListV1Beta2Props struct {
	Items *[]*KubeStatefulSetV1Beta2Props `field:"required" json:"items" yaml:"items"`
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

