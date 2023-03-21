// k8s
package k8s


// APIService represents a server for a particular GroupVersion.
//
// Name must be "version.group".
type KubeApiServiceV1Beta1Props struct {
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec contains information for locating and communicating with a server.
	Spec *ApiServiceSpecV1Beta1 `field:"optional" json:"spec" yaml:"spec"`
}

