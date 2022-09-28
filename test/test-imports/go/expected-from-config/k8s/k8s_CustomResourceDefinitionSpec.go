// k8s
package k8s


// CustomResourceDefinitionSpec describes how a user wants their resource to appear.
type CustomResourceDefinitionSpec struct {
	// group is the API group of the defined custom resource.
	//
	// The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).
	Group *string `field:"required" json:"group" yaml:"group"`
	// names specify the resource and kind names for the custom resource.
	Names *CustomResourceDefinitionNames `field:"required" json:"names" yaml:"names"`
	// scope indicates whether the defined custom resource is cluster- or namespace-scoped.
	//
	// Allowed values are `Cluster` and `Namespaced`.
	Scope *string `field:"required" json:"scope" yaml:"scope"`
	// versions is the list of all API versions of the defined custom resource.
	//
	// Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
	Versions *[]*CustomResourceDefinitionVersion `field:"required" json:"versions" yaml:"versions"`
	// conversion defines conversion settings for the CRD.
	Conversion *CustomResourceConversion `field:"optional" json:"conversion" yaml:"conversion"`
	// preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage.
	//
	// apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting `x-preserve-unknown-fields` to true in `spec.versions[*].schema.openAPIV3Schema`. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
	PreserveUnknownFields *bool `field:"optional" json:"preserveUnknownFields" yaml:"preserveUnknownFields"`
}

