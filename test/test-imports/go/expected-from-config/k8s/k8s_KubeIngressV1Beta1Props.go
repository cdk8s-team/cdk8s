// k8s
package k8s


// Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend.
//
// An Ingress can be configured to give services externally-reachable urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
type KubeIngressV1Beta1Props struct {
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec is the desired state of the Ingress.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *IngressSpecV1Beta1 `field:"optional" json:"spec" yaml:"spec"`
}

