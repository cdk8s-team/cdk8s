package jenkinsio


// ServiceAccount defines Jenkins master service account attributes.
type JenkinsSpecServiceAccount struct {
	// Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
	//
	// They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
	Annotations *map[string]*string `field:"optional" json:"annotations" yaml:"annotations"`
}

