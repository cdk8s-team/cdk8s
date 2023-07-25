package jenkinsio


// Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
type JenkinsSpecMasterVolumesProjectedSourcesDownwardApiItemsFieldRef struct {
	// Path of the field to select in the specified API version.
	FieldPath *string `field:"required" json:"fieldPath" yaml:"fieldPath"`
	// Version of the schema the FieldPath is written in terms of, defaults to "v1".
	ApiVersion *string `field:"optional" json:"apiVersion" yaml:"apiVersion"`
}

