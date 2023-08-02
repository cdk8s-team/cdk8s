package k8s


// IngressSpec describes the Ingress the user wishes to exist.
type IngressSpecV1Beta1 struct {
	// A default backend capable of servicing requests that don't match any rule.
	//
	// At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
	Backend *IngressBackendV1Beta1 `field:"optional" json:"backend" yaml:"backend"`
	// A list of host rules used to configure the Ingress.
	//
	// If unspecified, or no rule matches, all traffic is sent to the default backend.
	Rules *[]*IngressRuleV1Beta1 `field:"optional" json:"rules" yaml:"rules"`
	// TLS configuration.
	//
	// Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
	Tls *[]*IngressTlsv1Beta1 `field:"optional" json:"tls" yaml:"tls"`
}

