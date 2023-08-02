package k8s


// DEPRECATED - This group version of ControllerRevision is deprecated by apps/v1beta2/ControllerRevision.
//
// See the release notes for more information. ControllerRevision implements an immutable snapshot of state data. Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.
type KubeControllerRevisionV1Beta1Props struct {
	// Revision indicates the revision of the state represented by Data.
	Revision *float64 `field:"required" json:"revision" yaml:"revision"`
	// Data is the serialized representation of the state.
	Data interface{} `field:"optional" json:"data" yaml:"data"`
	// Standard object's metadata.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

