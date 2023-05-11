package k8s


// HTTPHeader describes a custom header to be used in HTTP probes.
type HttpHeader struct {
	// The header field name.
	Name *string `field:"required" json:"name" yaml:"name"`
	// The header field value.
	Value *string `field:"required" json:"value" yaml:"value"`
}

