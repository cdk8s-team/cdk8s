// k8s
package k8s


// DaemonSetSpec is the specification of a daemon set.
type DaemonSetSpecV1Beta2 struct {
	// A label query over pods that are managed by the daemon set.
	//
	// Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
	Selector *LabelSelector `field:"required" json:"selector" yaml:"selector"`
	// An object that describes the pod that will be created.
	//
	// The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
	Template *PodTemplateSpec `field:"required" json:"template" yaml:"template"`
	// The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available.
	//
	// Defaults to 0 (pod will be considered available as soon as it is ready).
	MinReadySeconds *float64 `field:"optional" json:"minReadySeconds" yaml:"minReadySeconds"`
	// The number of old history to retain to allow rollback.
	//
	// This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
	RevisionHistoryLimit *float64 `field:"optional" json:"revisionHistoryLimit" yaml:"revisionHistoryLimit"`
	// An update strategy to replace existing DaemonSet pods with new pods.
	UpdateStrategy *DaemonSetUpdateStrategyV1Beta2 `field:"optional" json:"updateStrategy" yaml:"updateStrategy"`
}

