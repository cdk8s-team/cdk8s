package jenkinsio


// information about the configMap data to project.
type JenkinsSpecMasterVolumesProjectedSourcesConfigMap struct {
	// If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.
	//
	// If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
	Items *[]*JenkinsSpecMasterVolumesProjectedSourcesConfigMapItems `field:"optional" json:"items" yaml:"items"`
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
	// Specify whether the ConfigMap or its keys must be defined.
	Optional *bool `field:"optional" json:"optional" yaml:"optional"`
}

