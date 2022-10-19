// k8s
package k8s


// CustomResourceSubresources defines the status and scale subresources for CustomResources.
type CustomResourceSubresourcesV1Beta1 struct {
	// scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
	Scale *CustomResourceSubresourceScaleV1Beta1 `field:"optional" json:"scale" yaml:"scale"`
	// status indicates the custom resource should serve a `/status` subresource.
	//
	// When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
	Status interface{} `field:"optional" json:"status" yaml:"status"`
}

