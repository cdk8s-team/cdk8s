// jenkinsio
package jenkinsio


// VolumeMount describes a mounting of a Volume within a container.
type JenkinsSpecMasterContainersVolumeMounts struct {
	// Path within the container at which the volume should be mounted.
	//
	// Must not contain ':'.
	MountPath *string `field:"required" json:"mountPath" yaml:"mountPath"`
	// This must match the Name of a Volume.
	Name *string `field:"required" json:"name" yaml:"name"`
	// mountPropagation determines how mounts are propagated from the host to container and the other way around.
	//
	// When not set, MountPropagationNone is used. This field is beta in 1.10.
	MountPropagation *string `field:"optional" json:"mountPropagation" yaml:"mountPropagation"`
	// Mounted read-only if true, read-write otherwise (false or unspecified).
	//
	// Defaults to false.
	ReadOnly *bool `field:"optional" json:"readOnly" yaml:"readOnly"`
	// Path within the volume from which the container's volume should be mounted.
	//
	// Defaults to "" (volume's root).
	SubPath *string `field:"optional" json:"subPath" yaml:"subPath"`
	// Expanded path within the volume from which the container's volume should be mounted.
	//
	// Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive. This field is beta in 1.15.
	SubPathExpr *string `field:"optional" json:"subPathExpr" yaml:"subPathExpr"`
}

