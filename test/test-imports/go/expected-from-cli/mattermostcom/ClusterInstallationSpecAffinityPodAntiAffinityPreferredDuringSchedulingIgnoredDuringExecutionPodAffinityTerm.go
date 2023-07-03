package mattermostcom


// Required.
//
// A pod affinity term, associated with the corresponding weight.
type ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm struct {
	// This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.
	//
	// Empty topologyKey is not allowed.
	TopologyKey *string `field:"required" json:"topologyKey" yaml:"topologyKey"`
	// A label query over a set of resources, in this case pods.
	LabelSelector *ClusterInstallationSpecAffinityPodAntiAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector `field:"optional" json:"labelSelector" yaml:"labelSelector"`
	// namespaces specifies which namespaces the labelSelector applies to (matches against);
	//
	// null or empty list means "this pod's namespace".
	Namespaces *[]*string `field:"optional" json:"namespaces" yaml:"namespaces"`
}

