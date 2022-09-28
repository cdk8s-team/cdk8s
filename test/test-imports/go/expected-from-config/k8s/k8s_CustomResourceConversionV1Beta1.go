// k8s
package k8s


// CustomResourceConversion describes how to convert different versions of a CR.
type CustomResourceConversionV1Beta1 struct {
	// strategy specifies how custom resources are converted between versions.
	//
	// Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
	// is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
	Strategy *string `field:"required" json:"strategy" yaml:"strategy"`
	// conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects.
	//
	// The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `["v1beta1"]`.
	ConversionReviewVersions *[]*string `field:"optional" json:"conversionReviewVersions" yaml:"conversionReviewVersions"`
	// webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
	//
	// Required when `strategy` is set to `Webhook`.
	WebhookClientConfig *WebhookClientConfigV1Beta1 `field:"optional" json:"webhookClientConfig" yaml:"webhookClientConfig"`
}

