// k8s
package k8s


// Affinity is a group of affinity scheduling rules.
type Affinity struct {
	// Describes node affinity scheduling rules for the pod.
	NodeAffinity *NodeAffinity `field:"optional" json:"nodeAffinity" yaml:"nodeAffinity"`
	// Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
	PodAffinity *PodAffinity `field:"optional" json:"podAffinity" yaml:"podAffinity"`
	// Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
	PodAntiAffinity *PodAntiAffinity `field:"optional" json:"podAntiAffinity" yaml:"podAntiAffinity"`
}

