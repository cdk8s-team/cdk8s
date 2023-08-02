package k8s


// This information is immutable after the request is created.
//
// Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
type CertificateSigningRequestSpecV1Beta1 struct {
	// Base64-encoded PKCS#10 CSR data.
	Request *string `field:"required" json:"request" yaml:"request"`
	// Extra information about the requesting user.
	//
	// See user.Info interface for details.
	Extra *map[string]*[]*string `field:"optional" json:"extra" yaml:"extra"`
	// Group information about the requesting user.
	//
	// See user.Info interface for details.
	Groups *[]*string `field:"optional" json:"groups" yaml:"groups"`
	// UID information about the requesting user.
	//
	// See user.Info interface for details.
	Uid *string `field:"optional" json:"uid" yaml:"uid"`
	// allowedUsages specifies a set of usage contexts the key will be valid for.
	//
	// See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
	// https://tools.ietf.org/html/rfc5280#section-4.2.1.12
	Usages *[]*string `field:"optional" json:"usages" yaml:"usages"`
	// Information about the requesting user.
	//
	// See user.Info interface for details.
	Username *string `field:"optional" json:"username" yaml:"username"`
}

