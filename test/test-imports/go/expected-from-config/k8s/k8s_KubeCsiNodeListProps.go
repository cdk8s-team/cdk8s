// k8s
package k8s


// CSINodeList is a collection of CSINode objects.
type KubeCsiNodeListProps struct {
	// items is the list of CSINode.
	Items *[]*KubeCsiNodeProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

