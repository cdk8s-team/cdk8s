// k8s
package k8s


// PodDNSConfigOption defines DNS resolver options of a pod.
type PodDnsConfigOption struct {
	// Required.
	Name *string `field:"optional" json:"name" yaml:"name"`
	Value *string `field:"optional" json:"value" yaml:"value"`
}

