// k8s
package k8s


// SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
type SeLinuxStrategyOptionsV1Beta1 struct {
	// rule is the strategy that will dictate the allowable labels that may be set.
	Rule *string `field:"required" json:"rule" yaml:"rule"`
	// seLinuxOptions required to run as;
	//
	// required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
	SeLinuxOptions *SeLinuxOptions `field:"optional" json:"seLinuxOptions" yaml:"seLinuxOptions"`
}

