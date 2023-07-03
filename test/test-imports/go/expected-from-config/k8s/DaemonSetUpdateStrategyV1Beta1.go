package k8s


type DaemonSetUpdateStrategyV1Beta1 struct {
	// Rolling update config params.
	//
	// Present only if type = "RollingUpdate".
	RollingUpdate *RollingUpdateDaemonSetV1Beta1 `field:"optional" json:"rollingUpdate" yaml:"rollingUpdate"`
	// Type of daemon set update.
	//
	// Can be "RollingUpdate" or "OnDelete". Default is OnDelete.
	Type *string `field:"optional" json:"type" yaml:"type"`
}

