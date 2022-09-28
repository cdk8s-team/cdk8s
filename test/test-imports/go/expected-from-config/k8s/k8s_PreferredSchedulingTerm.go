// k8s
package k8s


// An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
type PreferredSchedulingTerm struct {
	// A node selector term, associated with the corresponding weight.
	Preference *NodeSelectorTerm `field:"required" json:"preference" yaml:"preference"`
	// Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
	Weight *float64 `field:"required" json:"weight" yaml:"weight"`
}

