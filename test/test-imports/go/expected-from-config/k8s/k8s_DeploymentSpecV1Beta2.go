// k8s
package k8s


// DeploymentSpec is the specification of the desired behavior of the Deployment.
type DeploymentSpecV1Beta2 struct {
	// Label selector for pods.
	//
	// Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.
	Selector *LabelSelector `field:"required" json:"selector" yaml:"selector"`
	// Template describes the pods that will be created.
	Template *PodTemplateSpec `field:"required" json:"template" yaml:"template"`
	// Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
	//
	// Defaults to 0 (pod will be considered available as soon as it is ready).
	MinReadySeconds *float64 `field:"optional" json:"minReadySeconds" yaml:"minReadySeconds"`
	// Indicates that the deployment is paused.
	Paused *bool `field:"optional" json:"paused" yaml:"paused"`
	// The maximum time in seconds for a deployment to make progress before it is considered to be failed.
	//
	// The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
	ProgressDeadlineSeconds *float64 `field:"optional" json:"progressDeadlineSeconds" yaml:"progressDeadlineSeconds"`
	// Number of desired pods.
	//
	// This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
	Replicas *float64 `field:"optional" json:"replicas" yaml:"replicas"`
	// The number of old ReplicaSets to retain to allow rollback.
	//
	// This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
	RevisionHistoryLimit *float64 `field:"optional" json:"revisionHistoryLimit" yaml:"revisionHistoryLimit"`
	// The deployment strategy to use to replace existing pods with new ones.
	Strategy *DeploymentStrategyV1Beta2 `field:"optional" json:"strategy" yaml:"strategy"`
}

