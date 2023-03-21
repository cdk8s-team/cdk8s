// k8s
package k8s

import (
	"time"
)

// EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
type EventSeries struct {
	// Number of occurrences in this series up to the last heartbeat time.
	Count *float64 `field:"optional" json:"count" yaml:"count"`
	// Time of the last occurrence observed.
	LastObservedTime *time.Time `field:"optional" json:"lastObservedTime" yaml:"lastObservedTime"`
	// State of this Series: Ongoing or Finished Deprecated.
	//
	// Planned removal for 1.18
	State *string `field:"optional" json:"state" yaml:"state"`
}

