package k8s


// SessionAffinityConfig represents the configurations of session affinity.
type SessionAffinityConfig struct {
	// clientIP contains the configurations of Client IP based session affinity.
	ClientIp *ClientIpConfig `field:"optional" json:"clientIp" yaml:"clientIp"`
}

