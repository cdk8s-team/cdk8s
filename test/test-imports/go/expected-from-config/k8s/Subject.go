package k8s


// Subject contains a reference to the object or user identities a role binding applies to.
//
// This can either hold a direct API object reference, or a value for non-objects such as user and group names.
type Subject struct {
	// Kind of object being referenced.
	//
	// Values defined by this API group are "User", "Group", and "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
	Kind *string `field:"required" json:"kind" yaml:"kind"`
	// Name of the object being referenced.
	Name *string `field:"required" json:"name" yaml:"name"`
	// APIGroup holds the API group of the referenced subject.
	//
	// Defaults to "" for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
	ApiGroup *string `field:"optional" json:"apiGroup" yaml:"apiGroup"`
	// Namespace of the referenced object.
	//
	// If the object kind is non-namespace, such as "User" or "Group", and this value is not empty the Authorizer should report an error.
	Namespace *string `field:"optional" json:"namespace" yaml:"namespace"`
}

