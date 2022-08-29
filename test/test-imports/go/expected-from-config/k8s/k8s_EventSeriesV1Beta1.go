// k8s
package k8s

import (
	"time"
)

// EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
type EventSeriesV1Beta1 struct {
	// Number of occurrences in this series up to the last heartbeat time.
	Count *float64 `field:"required" json:"count" yaml:"count"`
	// Time when last Event from the series was seen before last heartbeat.
	LastObservedTime *time.Time `field:"required" json:"lastObservedTime" yaml:"lastObservedTime"`
	// Information whether this series is ongoing or finished.
	//
	// Deprecated. Planned removal for 1.18
	State *string `field:"required" json:"state" yaml:"state"`
}

