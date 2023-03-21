// k8s
package k8s


// FlowDistinguisherMethod specifies the method of a flow distinguisher.
type FlowDistinguisherMethodV1Alpha1 struct {
	// `type` is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace".
	//
	// Required.
	Type *string `field:"required" json:"type" yaml:"type"`
}

