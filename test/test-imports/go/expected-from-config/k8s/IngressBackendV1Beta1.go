// k8s
package k8s


// IngressBackend describes all endpoints for a given service and port.
type IngressBackendV1Beta1 struct {
	// Specifies the name of the referenced service.
	ServiceName *string `field:"required" json:"serviceName" yaml:"serviceName"`
	// Specifies the port of the referenced service.
	ServicePort IntOrString `field:"required" json:"servicePort" yaml:"servicePort"`
}

