// k8s
package k8s


// NamespaceList is a list of Namespaces.
type KubeNamespaceListProps struct {
	// Items is the list of Namespace objects in the list.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
	Items *[]*KubeNamespaceProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

