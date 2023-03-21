// mattermost_mattermostcom
package mattermost_mattermostcom


// A null or empty node selector term matches no objects.
//
// The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
type ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTerms struct {
	// A list of node selector requirements by node's labels.
	MatchExpressions *[]*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchExpressions `field:"optional" json:"matchExpressions" yaml:"matchExpressions"`
	// A list of node selector requirements by node's fields.
	MatchFields *[]*ClusterInstallationSpecAffinityNodeAffinityRequiredDuringSchedulingIgnoredDuringExecutionNodeSelectorTermsMatchFields `field:"optional" json:"matchFields" yaml:"matchFields"`
}

