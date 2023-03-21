// k8s
package k8s


// PersistentVolumeList is a list of PersistentVolume items.
type KubePersistentVolumeListProps struct {
	// List of persistent volumes.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
	Items *[]*KubePersistentVolumeProps `field:"required" json:"items" yaml:"items"`
	// Standard list metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

