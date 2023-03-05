// k8s
package k8s


// AuditSinkSpec holds the spec for the audit sink.
type AuditSinkSpecV1Alpha1 struct {
	// Policy defines the policy for selecting which events should be sent to the webhook required.
	Policy *PolicyV1Alpha1 `field:"required" json:"policy" yaml:"policy"`
	// Webhook to send events required.
	Webhook *WebhookV1Alpha1 `field:"required" json:"webhook" yaml:"webhook"`
}

