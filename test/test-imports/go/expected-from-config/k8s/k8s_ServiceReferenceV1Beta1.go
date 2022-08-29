// k8s
package k8s


// ServiceReference holds a reference to Service.legacy.k8s.io.
type ServiceReferenceV1Beta1 struct {
	// `name` is the name of the service.
	//
	// Required.
	Name *string `field:"required" json:"name" yaml:"name"`
	// `namespace` is the namespace of the service.
	//
	// Required.
	Namespace *string `field:"required" json:"namespace" yaml:"namespace"`
	// `path` is an optional URL path which will be sent in any request to this service.
	Path *string `field:"optional" json:"path" yaml:"path"`
	// If specified, the port on the service that hosting webhook.
	//
	// Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
	Port *float64 `field:"optional" json:"port" yaml:"port"`
}

