package k8s


// CSIDriverList is a collection of CSIDriver objects.
type KubeCsiDriverListV1Beta1Props struct {
	// items is the list of CSIDriver.
	Items *[]*KubeCsiDriverV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

