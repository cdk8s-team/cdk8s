package k8s


// CrossVersionObjectReference contains enough information to let you identify the referred resource.
type CrossVersionObjectReferenceV2Beta1 struct {
	// Kind of the referent;
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
	Kind *string `field:"required" json:"kind" yaml:"kind"`
	// Name of the referent;
	//
	// More info: http://kubernetes.io/docs/user-guide/identifiers#names
	Name *string `field:"required" json:"name" yaml:"name"`
	// API version of the referent.
	ApiVersion *string `field:"optional" json:"apiVersion" yaml:"apiVersion"`
}

