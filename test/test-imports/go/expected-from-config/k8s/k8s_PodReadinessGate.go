// k8s
package k8s


// PodReadinessGate contains the reference to a pod condition.
type PodReadinessGate struct {
	// ConditionType refers to a condition in the pod's condition list with matching type.
	ConditionType *string `field:"required" json:"conditionType" yaml:"conditionType"`
}

