package k8s


// MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
type KubeMutatingWebhookConfigurationListProps struct {
	// List of MutatingWebhookConfiguration.
	Items *[]*KubeMutatingWebhookConfigurationProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

