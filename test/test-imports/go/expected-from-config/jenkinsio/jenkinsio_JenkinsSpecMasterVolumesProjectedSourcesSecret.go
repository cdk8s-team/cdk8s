// jenkinsio
package jenkinsio


// information about the secret data to project.
type JenkinsSpecMasterVolumesProjectedSourcesSecret struct {
	// If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value.
	//
	// If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
	Items *[]*JenkinsSpecMasterVolumesProjectedSourcesSecretItems `field:"optional" json:"items" yaml:"items"`
	// Name of the referent.
	//
	// More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
	Name *string `field:"optional" json:"name" yaml:"name"`
	// Specify whether the Secret or its key must be defined.
	Optional *bool `field:"optional" json:"optional" yaml:"optional"`
}

