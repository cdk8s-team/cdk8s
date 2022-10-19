// k8s
package k8s


// Policy defines the configuration of how audit events are logged.
type PolicyV1Alpha1 struct {
	// The Level that all requests are recorded at.
	//
	// available options: None, Metadata, Request, RequestResponse required.
	Level *string `field:"required" json:"level" yaml:"level"`
	// Stages is a list of stages for which events are created.
	Stages *[]*string `field:"optional" json:"stages" yaml:"stages"`
}

