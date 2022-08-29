// k8s
package k8s


// DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
type DaemonSetUpdateStrategy struct {
	// Rolling update config params.
	//
	// Present only if type = "RollingUpdate".
	RollingUpdate *RollingUpdateDaemonSet `field:"optional" json:"rollingUpdate" yaml:"rollingUpdate"`
	// Type of daemon set update.
	//
	// Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
	Type *string `field:"optional" json:"type" yaml:"type"`
}

