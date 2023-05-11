package k8s


// ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it.
type KubeValidatingWebhookConfigurationProps struct {
	// Standard object metadata;
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Webhooks is a list of webhooks and the affected resources and operations.
	Webhooks *[]*ValidatingWebhook `field:"optional" json:"webhooks" yaml:"webhooks"`
}

