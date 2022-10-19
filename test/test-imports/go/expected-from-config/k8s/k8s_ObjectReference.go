// k8s
package k8s


// ObjectReference contains enough information to let you inspect or modify the referred object.
type ObjectReference struct {
	// API version of the referent.
	ApiVersion *string `field:"optional" json:"apiVersion" yaml:"apiVersion"`
	// If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers to the name of the container that triggered the event) or if no container name is specified "spec.containers[2]" (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object.
	FieldPath *string `field:"optional" json:"fieldPath" yaml:"fieldPath"`
	// Kind of the referent.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `field:"optional" json:"kind" yaml:"kind"`
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
	Name *string `field:"optional" json:"name" yaml:"name"`
	// Namespace of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
	Namespace *string `field:"optional" json:"namespace" yaml:"namespace"`
	// Specific resourceVersion to which this reference is made, if any.
	//
	// More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
	ResourceVersion *string `field:"optional" json:"resourceVersion" yaml:"resourceVersion"`
	// UID of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
	Uid *string `field:"optional" json:"uid" yaml:"uid"`
}

