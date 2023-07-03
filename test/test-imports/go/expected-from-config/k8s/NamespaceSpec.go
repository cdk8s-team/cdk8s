package k8s


// NamespaceSpec describes the attributes on a Namespace.
type NamespaceSpec struct {
	// Finalizers is an opaque list of values that must be empty to permanently remove object from storage.
	//
	// More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
	Finalizers *[]*string `field:"optional" json:"finalizers" yaml:"finalizers"`
}

