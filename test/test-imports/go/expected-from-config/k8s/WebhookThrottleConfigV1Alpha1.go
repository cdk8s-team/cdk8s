// k8s
package k8s


// WebhookThrottleConfig holds the configuration for throttling events.
type WebhookThrottleConfigV1Alpha1 struct {
	// ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS.
	Burst *float64 `field:"optional" json:"burst" yaml:"burst"`
	// ThrottleQPS maximum number of batches per second default 10 QPS.
	Qps *float64 `field:"optional" json:"qps" yaml:"qps"`
}

