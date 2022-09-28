// k8s
package k8s


// EndpointConditions represents the current condition of an endpoint.
type EndpointConditionsV1Beta1 struct {
	// ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint.
	//
	// A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
	Ready *bool `field:"optional" json:"ready" yaml:"ready"`
}

