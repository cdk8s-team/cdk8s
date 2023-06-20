package mattermost_mattermostcom


// The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s).
type ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution struct {
	// Required.
	//
	// A pod affinity term, associated with the corresponding weight.
	PodAffinityTerm *ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm `field:"required" json:"podAffinityTerm" yaml:"podAffinityTerm"`
	// weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
	Weight *float64 `field:"required" json:"weight" yaml:"weight"`
}

