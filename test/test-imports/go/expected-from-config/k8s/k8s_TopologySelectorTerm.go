// k8s
package k8s


// A topology selector term represents the result of label queries.
//
// A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
type TopologySelectorTerm struct {
	// A list of topology selector requirements by labels.
	MatchLabelExpressions *[]*TopologySelectorLabelRequirement `field:"optional" json:"matchLabelExpressions" yaml:"matchLabelExpressions"`
}

