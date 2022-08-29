// k8s
package k8s


// ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
type KubeValidatingWebhookConfigurationListV1Beta1Props struct {
	// List of ValidatingWebhookConfiguration.
	Items *[]*KubeValidatingWebhookConfigurationV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

