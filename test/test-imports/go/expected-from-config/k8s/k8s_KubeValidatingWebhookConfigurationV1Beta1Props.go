// k8s
package k8s


// ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it.
//
// Deprecated in v1.16, planned for removal in v1.19. Use admissionregistration.k8s.io/v1 ValidatingWebhookConfiguration instead.
type KubeValidatingWebhookConfigurationV1Beta1Props struct {
	// Standard object metadata;
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Webhooks is a list of webhooks and the affected resources and operations.
	Webhooks *[]*ValidatingWebhookV1Beta1 `field:"optional" json:"webhooks" yaml:"webhooks"`
}

