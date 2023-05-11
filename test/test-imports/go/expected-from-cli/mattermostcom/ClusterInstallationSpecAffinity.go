package mattermostcom


// If specified, affinity will define the pod's scheduling constraints.
type ClusterInstallationSpecAffinity struct {
	// Describes node affinity scheduling rules for the pod.
	NodeAffinity *ClusterInstallationSpecAffinityNodeAffinity `field:"optional" json:"nodeAffinity" yaml:"nodeAffinity"`
	// Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
	PodAffinity *ClusterInstallationSpecAffinityPodAffinity `field:"optional" json:"podAffinity" yaml:"podAffinity"`
	// Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
	PodAntiAffinity *ClusterInstallationSpecAffinityPodAntiAffinity `field:"optional" json:"podAntiAffinity" yaml:"podAntiAffinity"`
}

