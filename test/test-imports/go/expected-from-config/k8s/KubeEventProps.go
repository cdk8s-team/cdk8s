package k8s

import (
	"time"
)

// Event is a report of an event somewhere in the cluster.
type KubeEventProps struct {
	// The object that this event is about.
	InvolvedObject *ObjectReference `field:"required" json:"involvedObject" yaml:"involvedObject"`
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"required" json:"metadata" yaml:"metadata"`
	// What action was taken/failed regarding to the Regarding object.
	Action *string `field:"optional" json:"action" yaml:"action"`
	// The number of times this event has occurred.
	Count *float64 `field:"optional" json:"count" yaml:"count"`
	// Time when this Event was first observed.
	EventTime *time.Time `field:"optional" json:"eventTime" yaml:"eventTime"`
	// The time at which the event was first recorded.
	//
	// (Time of server receipt is in TypeMeta.)
	FirstTimestamp *time.Time `field:"optional" json:"firstTimestamp" yaml:"firstTimestamp"`
	// The time at which the most recent occurrence of this event was recorded.
	LastTimestamp *time.Time `field:"optional" json:"lastTimestamp" yaml:"lastTimestamp"`
	// A human-readable description of the status of this operation.
	Message *string `field:"optional" json:"message" yaml:"message"`
	// This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
	Reason *string `field:"optional" json:"reason" yaml:"reason"`
	// Optional secondary object for more complex actions.
	Related *ObjectReference `field:"optional" json:"related" yaml:"related"`
	// Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
	ReportingComponent *string `field:"optional" json:"reportingComponent" yaml:"reportingComponent"`
	// ID of the controller instance, e.g. `kubelet-xyzf`.
	ReportingInstance *string `field:"optional" json:"reportingInstance" yaml:"reportingInstance"`
	// Data about the Event series this event represents or nil if it's a singleton Event.
	Series *EventSeries `field:"optional" json:"series" yaml:"series"`
	// The component reporting this event.
	//
	// Should be a short machine understandable string.
	Source *EventSource `field:"optional" json:"source" yaml:"source"`
	// Type of this event (Normal, Warning), new types could be added in the future.
	Type *string `field:"optional" json:"type" yaml:"type"`
}

