package k8s


// CSINodeSpec holds information about the specification of all CSI drivers installed on a node.
type CsiNodeSpec struct {
	// drivers is a list of information of all CSI Drivers existing on a node.
	//
	// If all drivers in the list are uninstalled, this can become empty.
	Drivers *[]*CsiNodeDriver `field:"required" json:"drivers" yaml:"drivers"`
}

