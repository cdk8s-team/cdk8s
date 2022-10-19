// k8s
package k8s


// PersistentVolumeClaim is a user's request for and claim to a persistent volume.
type KubePersistentVolumeClaimProps struct {
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec defines the desired characteristics of a volume requested by a pod author.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
	Spec *PersistentVolumeClaimSpec `field:"optional" json:"spec" yaml:"spec"`
}

