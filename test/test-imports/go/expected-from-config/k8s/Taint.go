package k8s

import (
	"time"
)

// The node this Taint is attached to has the "effect" on any pod that does not tolerate the Taint.
type Taint struct {
	// Required.
	//
	// The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
	Effect *string `field:"required" json:"effect" yaml:"effect"`
	// Required.
	//
	// The taint key to be applied to a node.
	Key *string `field:"required" json:"key" yaml:"key"`
	// TimeAdded represents the time at which the taint was added.
	//
	// It is only written for NoExecute taints.
	TimeAdded *time.Time `field:"optional" json:"timeAdded" yaml:"timeAdded"`
	// Required.
	//
	// The taint value corresponding to the taint key.
	Value *string `field:"optional" json:"value" yaml:"value"`
}

