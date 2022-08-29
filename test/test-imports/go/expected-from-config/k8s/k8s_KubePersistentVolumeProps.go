// k8s
package k8s


// PersistentVolume (PV) is a storage resource provisioned by an administrator.
//
// It is analogous to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
type KubePersistentVolumeProps struct {
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec defines a specification of a persistent volume owned by the cluster.
	//
	// Provisioned by an administrator. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
	Spec *PersistentVolumeSpec `field:"optional" json:"spec" yaml:"spec"`
}

