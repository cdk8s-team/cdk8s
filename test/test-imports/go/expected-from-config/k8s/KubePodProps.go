package k8s


// Pod is a collection of containers that can run on a host.
//
// This resource is created by clients and scheduled onto hosts.
type KubePodProps struct {
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Specification of the desired behavior of the pod.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *PodSpec `field:"optional" json:"spec" yaml:"spec"`
}

