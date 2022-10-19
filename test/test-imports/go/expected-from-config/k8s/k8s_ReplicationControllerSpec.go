// k8s
package k8s


// ReplicationControllerSpec is the specification of a replication controller.
type ReplicationControllerSpec struct {
	// Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
	//
	// Defaults to 0 (pod will be considered available as soon as it is ready).
	MinReadySeconds *float64 `field:"optional" json:"minReadySeconds" yaml:"minReadySeconds"`
	// Replicas is the number of desired replicas.
	//
	// This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
	Replicas *float64 `field:"optional" json:"replicas" yaml:"replicas"`
	// Selector is a label query over pods that should match the Replicas count.
	//
	// If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
	Selector *map[string]*string `field:"optional" json:"selector" yaml:"selector"`
	// Template is the object that describes the pod that will be created if insufficient replicas are detected.
	//
	// This takes precedence over a TemplateRef. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
	Template *PodTemplateSpec `field:"optional" json:"template" yaml:"template"`
}

