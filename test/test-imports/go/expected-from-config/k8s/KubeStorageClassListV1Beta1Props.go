// k8s
package k8s


// StorageClassList is a collection of storage classes.
type KubeStorageClassListV1Beta1Props struct {
	// Items is the list of StorageClasses.
	Items *[]*KubeStorageClassV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

