package k8s


// Node is a worker node in Kubernetes.
//
// Each node will have a unique identifier in the cache (i.e. in etcd).
type KubeNodeProps struct {
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec defines the behavior of a node.
	//
	// https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *NodeSpec `field:"optional" json:"spec" yaml:"spec"`
}

