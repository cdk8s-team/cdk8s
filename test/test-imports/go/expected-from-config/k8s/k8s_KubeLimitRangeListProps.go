// k8s
package k8s


// LimitRangeList is a list of LimitRange items.
type KubeLimitRangeListProps struct {
	// Items is a list of LimitRange objects.
	//
	// More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
	Items *[]*KubeLimitRangeProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

