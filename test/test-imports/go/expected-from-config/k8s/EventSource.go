package k8s


// EventSource contains information for an event.
type EventSource struct {
	// Component from which the event is generated.
	Component *string `field:"optional" json:"component" yaml:"component"`
	// Node name on which the event is generated.
	Host *string `field:"optional" json:"host" yaml:"host"`
}

