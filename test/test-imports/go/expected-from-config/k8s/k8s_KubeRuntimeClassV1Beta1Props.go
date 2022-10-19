// k8s
package k8s


// RuntimeClass defines a class of container runtime supported in the cluster.
//
// The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are (currently) manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
type KubeRuntimeClassV1Beta1Props struct {
	// Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class.
	//
	// The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
	Handler *string `field:"required" json:"handler" yaml:"handler"`
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Overhead represents the resource overhead associated with running a pod for a given RuntimeClass.
	//
	// For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
	Overhead *OverheadV1Beta1 `field:"optional" json:"overhead" yaml:"overhead"`
	// Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it.
	//
	// If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
	Scheduling *SchedulingV1Beta1 `field:"optional" json:"scheduling" yaml:"scheduling"`
}

