package k8s


// ObjectFieldSelector selects an APIVersioned field of an object.
type ObjectFieldSelector struct {
	// Path of the field to select in the specified API version.
	FieldPath *string `field:"required" json:"fieldPath" yaml:"fieldPath"`
	// Version of the schema the FieldPath is written in terms of, defaults to "v1".
	ApiVersion *string `field:"optional" json:"apiVersion" yaml:"apiVersion"`
}

