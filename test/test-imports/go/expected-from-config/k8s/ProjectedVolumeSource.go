package k8s


// Represents a projected volume source.
type ProjectedVolumeSource struct {
	// list of volume projections.
	Sources *[]*VolumeProjection `field:"required" json:"sources" yaml:"sources"`
	// Mode bits to use on created files by default.
	//
	// Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
	DefaultMode *float64 `field:"optional" json:"defaultMode" yaml:"defaultMode"`
}

