package k8s


// ClientIPConfig represents the configurations of Client IP based session affinity.
type ClientIpConfig struct {
	// timeoutSeconds specifies the seconds of ClientIP type session sticky time.
	//
	// The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).
	TimeoutSeconds *float64 `field:"optional" json:"timeoutSeconds" yaml:"timeoutSeconds"`
}

