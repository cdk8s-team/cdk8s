package k8s


// VolumeNodeResources is a set of resource limits for scheduling of volumes.
type VolumeNodeResourcesV1Beta1 struct {
	// Maximum number of unique volumes managed by the CSI driver that can be used on a node.
	//
	// A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is nil, then the supported number of volumes on this node is unbounded.
	Count *float64 `field:"optional" json:"count" yaml:"count"`
}

