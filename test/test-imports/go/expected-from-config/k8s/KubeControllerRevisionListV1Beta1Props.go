// k8s
package k8s


// ControllerRevisionList is a resource containing a list of ControllerRevision objects.
type KubeControllerRevisionListV1Beta1Props struct {
	// Items is the list of ControllerRevisions.
	Items *[]*KubeControllerRevisionV1Beta1Props `field:"required" json:"items" yaml:"items"`
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

