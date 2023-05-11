package k8s


// ServiceAccountList is a list of ServiceAccount objects.
type KubeServiceAccountListProps struct {
	// List of ServiceAccounts.
	//
	// More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
	Items *[]*KubeServiceAccountProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

