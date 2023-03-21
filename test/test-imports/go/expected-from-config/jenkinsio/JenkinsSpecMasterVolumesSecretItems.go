// jenkinsio
package jenkinsio


// Maps a string key to a path within a volume.
type JenkinsSpecMasterVolumesSecretItems struct {
	// The key to project.
	Key *string `field:"required" json:"key" yaml:"key"`
	// The relative path of the file to map the key to.
	//
	// May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
	Path *string `field:"required" json:"path" yaml:"path"`
	// Optional: mode bits to use on this file, must be a value between 0 and 0777.
	//
	// If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	Mode *float64 `field:"optional" json:"mode" yaml:"mode"`
}

