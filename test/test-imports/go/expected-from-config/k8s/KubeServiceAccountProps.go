package k8s


// ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets.
type KubeServiceAccountProps struct {
	// AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted.
	//
	// Can be overridden at the pod level.
	AutomountServiceAccountToken *bool `field:"optional" json:"automountServiceAccountToken" yaml:"automountServiceAccountToken"`
	// ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount.
	//
	// ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
	ImagePullSecrets *[]*LocalObjectReference `field:"optional" json:"imagePullSecrets" yaml:"imagePullSecrets"`
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount.
	//
	// More info: https://kubernetes.io/docs/concepts/configuration/secret
	Secrets *[]*ObjectReference `field:"optional" json:"secrets" yaml:"secrets"`
}

