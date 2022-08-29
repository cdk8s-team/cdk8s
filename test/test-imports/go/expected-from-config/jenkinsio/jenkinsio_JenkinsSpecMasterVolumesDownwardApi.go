// jenkinsio
package jenkinsio


// DownwardAPI represents downward API about the pod that should populate this volume.
type JenkinsSpecMasterVolumesDownwardApi struct {
	// Optional: mode bits to use on created files by default.
	//
	// Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	DefaultMode *float64 `field:"optional" json:"defaultMode" yaml:"defaultMode"`
	// Items is a list of downward API volume file.
	Items *[]*JenkinsSpecMasterVolumesDownwardApiItems `field:"optional" json:"items" yaml:"items"`
}

