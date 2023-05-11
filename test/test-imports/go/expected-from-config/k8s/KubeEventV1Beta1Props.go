package k8s

import (
	"time"
)

// Event is a report of an event somewhere in the cluster.
//
// It generally denotes some state change in the system.
type KubeEventV1Beta1Props struct {
	// Required.
	//
	// Time when this Event was first observed.
	EventTime *time.Time `field:"required" json:"eventTime" yaml:"eventTime"`
	// What action was taken/failed regarding to the regarding object.
	Action *string `field:"optional" json:"action" yaml:"action"`
	// Deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedCount *float64 `field:"optional" json:"deprecatedCount" yaml:"deprecatedCount"`
	// Deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedFirstTimestamp *time.Time `field:"optional" json:"deprecatedFirstTimestamp" yaml:"deprecatedFirstTimestamp"`
	// Deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedLastTimestamp *time.Time `field:"optional" json:"deprecatedLastTimestamp" yaml:"deprecatedLastTimestamp"`
	// Deprecated field assuring backward compatibility with core.v1 Event type.
	DeprecatedSource *EventSource `field:"optional" json:"deprecatedSource" yaml:"deprecatedSource"`
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Optional.
	//
	// A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
	Note *string `field:"optional" json:"note" yaml:"note"`
	// Why the action was taken.
	Reason *string `field:"optional" json:"reason" yaml:"reason"`
	// The object this Event is about.
	//
	// In most cases it's an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
	Regarding *ObjectReference `field:"optional" json:"regarding" yaml:"regarding"`
	// Optional secondary object for more complex actions.
	//
	// E.g. when regarding object triggers a creation or deletion of related object.
	Related *ObjectReference `field:"optional" json:"related" yaml:"related"`
	// Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
	ReportingController *string `field:"optional" json:"reportingController" yaml:"reportingController"`
	// ID of the controller instance, e.g. `kubelet-xyzf`.
	ReportingInstance *string `field:"optional" json:"reportingInstance" yaml:"reportingInstance"`
	// Data about the Event series this event represents or nil if it's a singleton Event.
	Series *EventSeriesV1Beta1 `field:"optional" json:"series" yaml:"series"`
	// Type of this event (Normal, Warning), new types could be added in the future.
	Type *string `field:"optional" json:"type" yaml:"type"`
}

