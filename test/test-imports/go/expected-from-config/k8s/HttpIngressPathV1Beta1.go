package k8s


// HTTPIngressPath associates a path regex with a backend.
//
// Incoming urls matching the path are forwarded to the backend.
type HttpIngressPathV1Beta1 struct {
	// Backend defines the referenced service endpoint to which the traffic will be forwarded to.
	Backend *IngressBackendV1Beta1 `field:"required" json:"backend" yaml:"backend"`
	// Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a catch all sending traffic to the backend.
	Path *string `field:"optional" json:"path" yaml:"path"`
}

