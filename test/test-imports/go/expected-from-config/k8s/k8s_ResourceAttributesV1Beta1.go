// k8s
package k8s


// ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface.
type ResourceAttributesV1Beta1 struct {
	// Group is the API Group of the Resource.
	//
	// "*" means all.
	Group *string `field:"optional" json:"group" yaml:"group"`
	// Name is the name of the resource being requested for a "get" or deleted for a "delete".
	//
	// "" (empty) means all.
	Name *string `field:"optional" json:"name" yaml:"name"`
	// Namespace is the namespace of the action being requested.
	//
	// Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview.
	Namespace *string `field:"optional" json:"namespace" yaml:"namespace"`
	// Resource is one of the existing resource types.
	//
	// "*" means all.
	Resource *string `field:"optional" json:"resource" yaml:"resource"`
	// Subresource is one of the existing resource types.
	//
	// "" means none.
	Subresource *string `field:"optional" json:"subresource" yaml:"subresource"`
	// Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.
	//
	// "*" means all.
	Verb *string `field:"optional" json:"verb" yaml:"verb"`
	// Version is the API Version of the Resource.
	//
	// "*" means all.
	Version *string `field:"optional" json:"version" yaml:"version"`
}

