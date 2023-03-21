// k8s
package k8s


// Webhook holds the configuration of the webhook.
type WebhookV1Alpha1 struct {
	// ClientConfig holds the connection parameters for the webhook required.
	ClientConfig *WebhookClientConfigV1Alpha1 `field:"required" json:"clientConfig" yaml:"clientConfig"`
	// Throttle holds the options for throttling the webhook.
	Throttle *WebhookThrottleConfigV1Alpha1 `field:"optional" json:"throttle" yaml:"throttle"`
}

