// k8s
package k8s


// ReplicaSetSpec is the specification of a ReplicaSet.
type ReplicaSetSpec struct {
	// Selector is a label query over pods that should match the replica count.
	//
	// Label keys and values that must match in order to be controlled by this replica set. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
	Selector *LabelSelector `field:"required" json:"selector" yaml:"selector"`
	// Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
	//
	// Defaults to 0 (pod will be considered available as soon as it is ready).
	MinReadySeconds *float64 `field:"optional" json:"minReadySeconds" yaml:"minReadySeconds"`
	// Replicas is the number of desired replicas.
	//
	// This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
	Replicas *float64 `field:"optional" json:"replicas" yaml:"replicas"`
	// Template is the object that describes the pod that will be created if insufficient replicas are detected.
	//
	// More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
	Template *PodTemplateSpec `field:"optional" json:"template" yaml:"template"`
}

