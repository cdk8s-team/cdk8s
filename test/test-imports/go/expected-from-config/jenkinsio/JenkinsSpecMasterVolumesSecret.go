package jenkinsio


// Secret represents a secret that should populate this volume.
//
// More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
type JenkinsSpecMasterVolumesSecret struct {
	// Optional: mode bits to use on created files by default.
	//
	// Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	DefaultMode *float64 `field:"optional" json:"defaultMode" yaml:"defaultMode"`
	// If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value.
	//
	// If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
	Items *[]*JenkinsSpecMasterVolumesSecretItems `field:"optional" json:"items" yaml:"items"`
	// Specify whether the Secret or its keys must be defined.
	Optional *bool `field:"optional" json:"optional" yaml:"optional"`
	// Name of the secret in the pod's namespace to use.
	//
	// More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
	SecretName *string `field:"optional" json:"secretName" yaml:"secretName"`
}

