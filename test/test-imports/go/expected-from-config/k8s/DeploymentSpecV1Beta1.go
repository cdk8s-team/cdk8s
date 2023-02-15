// k8s
package k8s


// DeploymentSpec is the specification of the desired behavior of the Deployment.
type DeploymentSpecV1Beta1 struct {
	// Template describes the pods that will be created.
	Template *PodTemplateSpec `field:"required" json:"template" yaml:"template"`
	// Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available.
	//
	// Defaults to 0 (pod will be considered available as soon as it is ready).
	MinReadySeconds *float64 `field:"optional" json:"minReadySeconds" yaml:"minReadySeconds"`
	// Indicates that the deployment is paused and will not be processed by the deployment controller.
	Paused *bool `field:"optional" json:"paused" yaml:"paused"`
	// The maximum time in seconds for a deployment to make progress before it is considered to be failed.
	//
	// The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. This is set to the max value of int32 (i.e. 2147483647) by default, which means "no deadline".
	ProgressDeadlineSeconds *float64 `field:"optional" json:"progressDeadlineSeconds" yaml:"progressDeadlineSeconds"`
	// Number of desired pods.
	//
	// This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
	Replicas *float64 `field:"optional" json:"replicas" yaml:"replicas"`
	// The number of old ReplicaSets to retain to allow rollback.
	//
	// This is a pointer to distinguish between explicit zero and not specified. This is set to the max value of int32 (i.e. 2147483647) by default, which means "retaining all old RelicaSets".
	RevisionHistoryLimit *float64 `field:"optional" json:"revisionHistoryLimit" yaml:"revisionHistoryLimit"`
	// DEPRECATED.
	//
	// The config this deployment is rolling back to. Will be cleared after rollback is done.
	RollbackTo *RollbackConfigV1Beta1 `field:"optional" json:"rollbackTo" yaml:"rollbackTo"`
	// Label selector for pods.
	//
	// Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.
	Selector *LabelSelector `field:"optional" json:"selector" yaml:"selector"`
	// The deployment strategy to use to replace existing pods with new ones.
	Strategy *DeploymentStrategyV1Beta1 `field:"optional" json:"strategy" yaml:"strategy"`
}

